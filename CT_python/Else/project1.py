import turtle
import random


def draw_sq(t,distance=200):
    t.ht()
    t.up()
    t.goto(-distance,-distance)
    t.down()
    for i in range(4):
        t.fd(distance*2)
        t.lt(90)
    t.up()
    t.goto(0,0)
    t.st()

def add_tri():
    global l_tri
    tt = turtle.Turtle()
    tt.shape('triangle')
    tt.ht()
    tt.up()
    tt.speed(0)
    r_x = -200
    r_y = random.randint(-100, 100)
    r_a = random.randint(-89, 89)
    tt.goto(r_x,r_y)
    tt.setheading(r_a)
    tt.st()
    l_tri.append(tt)

def turn_right():
    global right
    right = True

def turn_left():
    global left
    left = True

def turn_up():
    global up
    up = True

def turn_down():
    global down
    down = True

def _turn_right():
    global right
    right = False

def _turn_left():
    global left
    left = False

def _turn_up():
    global up
    up = False

def _turn_down():
    global down
    down = False

def is_touch(x,y,triangle,threshold=20):
    global playing
    t_x,t_y = triangle.position()
    dist = (t_x - x)**2 + (t_y - y)**2

    if dist<(threshold**2):
        playing = False

def timer_go():
    global heading

    if playing:
        distance = 200
        if up:
            if right:
                heading=45
            elif left:
                heading=135
            elif down:
                heading = heading
            else:
                heading=90
        if down:
            if right:
                heading=315
            elif left:
                heading=225
            elif up:
                pass
            else:
                heading = 270
        if left:
            if right:
                heading = heading
            elif up:
                pass
            elif down:
                pass
            else:
                heading = 180
        if right:
            if left:
                pass
            elif up:
                pass
            elif down:
                pass
            else:
                heading = 0
        x, y = t.position()

        for param_tri in l_tri:
            t_x, t_y = param_tri.position()
            t_a = param_tri.heading()

            if t_x > distance or t_x < -distance:
                t_a = 180 - t_a
                param_tri.setheading(t_a)

            if t_y > distance or t_y < -distance:
                t_a = -t_a
                param_tri.setheading(t_a)

            is_touch(x, y, param_tri)
            param_tri.fd(4)

        t.setheading(heading)
        t.fd(4)
    else:
        t.write('FAIL',font=('',20,'bold'))


up = False
down = False
right = False
left = False
playing = True
heading = 0
l_tri = []

t = turtle.Turtle()
t.shape('turtle')
t.speed(0)
draw_sq(t)
screen = t.screen


screen.onkeypress(turn_right, 'Right')
screen.onkeypress(turn_left, 'Left')
screen.onkeypress(turn_up, 'Up')
screen.onkeypress(turn_down, 'Down')
screen.onkeyrelease(_turn_right, 'Right')
screen.onkeyrelease(_turn_left, 'Left')
screen.onkeyrelease(_turn_up, 'Up')
screen.onkeyrelease(_turn_down, 'Down')


for i in range(5):
    add_tri()

for i in range(1,200):
    time = i*100
    screen.ontimer(timer_go, time)

screen.ontimer(lambda : t.write('success',font=('',20,'bold')) if playing else 0, (i+1)*100)
screen.listen()
screen.mainloop()