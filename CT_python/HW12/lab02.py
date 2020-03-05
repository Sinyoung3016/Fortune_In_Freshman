from turtle import*
class Ball:
    def __init__(self,color,size,speed):
        self.x = 0
        self.y = 0
        self.speed = speed
        self.size = size
        self.color = color
        
        self.turtle = Turtle()
        self.turtle.shape("circle")
        self.turtle.shapesize(self.size)
        self.turtle.color(self.color)
        

    def move(self):
        self.x +=self.speed
        self.y +=self.speed
        self.turtle.goto(self.x,self.y)
        
ball = Ball("red",2,1)
for i in range(100):
    ball.move()

        
    
