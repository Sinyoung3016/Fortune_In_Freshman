import turtle

t = turtle.Turtle()
t.speed(0)

def maze(x,y):
    for i in range(2):
        t.penup()
        t.goto(0,100*i)
        t.pendown()
        t.fd(300+100*i)
        t.right(90)
        t.fd(300)
        t.left(90)
        t.fd(300-100*i)

def left():
    t.setheading(180)
    t.fd(20)

def right():
    t.setheading(0)
    t.fd(20)

def up():
    t.setheading(90)
    t.fd(20)

def down():
    t.setheading(-90)
    t.fd(20)

screen = turtle.Screen()
t.shape("turtle")

maze(-300,200)

screen.onkey(left,"Left")
screen.onkey(right,"Right")
screen.onkey(up,"Up")
screen.onkey(down,"Down")

t.penup()
t.goto(0,50)
t.pendown()
screen.listen()
screen.mainloop()

