class Point:
    def __init__(self,score):
        self.score = score

    def __str__(self):
        result = "점수는 "+ str(self.score) + "점 입니다"
        return result

student1 = Point(20)
student2 = Point(40)
student3 = Point(60)
print(student1)
print(student2)
print(student3)
