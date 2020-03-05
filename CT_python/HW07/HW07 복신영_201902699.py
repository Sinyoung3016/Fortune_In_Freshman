import turtle
import random

screen=turtle.Screen()

def draw_sq(t,distance=400):
    t.ht()
    t.penup()
    t.goto(-200,200)
    t.pendown()
    t.fd(distance)
    t.right(90)
    t.fd(distance)
    t.right(90)
    t.fd(distance)
    t.right(90)
    t.fd(distance)

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

t = turtle.Turtle()
t.speed(0)
draw_sq(t)

t=turtle.Turtle()
t.penup()
t.goto(0,0)
t.shape("turtle")
screen.onkey(left,"Left")
screen.onkey(right,"Right")
screen.onkey(up,"Up")
screen.onkey(down,"Down")
screen.listen()

a = turtle.Turtle()
a.penup()
a.shape("triangle")
a.color("blue")
a.left(90)
a.speed(1)

while True:
    x1 = random.randint(-200,200)
    y1 = random.randint(-200,200)
    a.goto(x1,y1)
    if t.distance(x1,y1) == 10 or t.xcor() >= 200 or t.xcor() <= -200 or t.ycor() >= 200 or t.ycor() <= -200 :
        t.clear()
        t.ht()
        t.home()               

b = turtle.Turtle()
b.penup()
b.shape("triangle")
b.color("blue")
b.left(90)
b.speed(1)

while True:
    x2 = random.randint(-200,200)
    y2 = random.randint(-200,200)
    b.goto(x2,y2)
    if t.distance(x2,y2) == 10 or t.xcor() >= 200 or t.xcor() <= -200 or t.ycor() >= 200 or t.ycor() <= -200 :
        t.clear()
        t.ht()
        t.home()               

c = turtle.Turtle()
c.penup()
c.shape("triangle")
c.color("blue")
c.left(90)
c.speed(1)

while True:
    x3 = random.randint(-200,200)
    y3 = random.randint(-200,200)
    c.goto(x3,y3)
    if t.distance(x3,y3) == 10 or t.xcor() >= 200 or t.xcor() <= -200 or t.ycor() >= 200 or t.ycor() <= -200 :
        t.clear()
        t.ht()
        t.home()               







