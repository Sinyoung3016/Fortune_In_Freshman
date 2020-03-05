import turtle
t = turtle.Turtle()

def square():
    for i in range(3):
        t.fd(100)
        t.right(90)


def drawit(x,y):
    t.penup()
    t.goto(x,y)
    t.pendown()
    t.begin_fill()
    square()
    t.color("blue")
    t.end_fill()

t.speed(50)
s = turtle.Screen()
s.onscreenclick(drawit)
