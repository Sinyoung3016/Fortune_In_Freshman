import turtle
t = turtle.Turtle()

t.left(90)
t.speed(0)

def tree(length):
       
    if length > 6:
        t.fd(length) 
        t.right(20)
        tree(length*0.6)
        t.left(40)
        tree(length*0.6)
        t.right(20)
        t.backward(length)
        

tree(100)
    
