import turtle
t = turtle.Turtle()

def snow(len,n):

    t.speed(0)
    
    if n==0:
        t.fd(len)
    else:
        len=len/3
        n=n-1
        snow(len,n)
        t.lt(60)
        snow(len,n)
        t.rt(120)
        snow(len,n)
        t.lt(60)
        snow(len,n)

for i in range(3):
    snow(300,3)
    t.rt(120)



