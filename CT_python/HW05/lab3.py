import turtle
r = 50
t= turtle.Turtle()
t.up()
t.goto(0,-r)
t.down()
t.circle(r)
t.up()

import random

for i in range(100):

    x = random.randint(-r,r)
    y = random.randint(-r,r)

    t.goto(x,y)
    
    if x**2+y**2>=r**2:
        t.dot()
    else :
        t.dot('red')
   



