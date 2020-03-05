x = int(input("정수를 입력하시오 :"))
m = 1
if (x==0):
    print("0! = 1")
elif (x < 0):
    print("값이 없습니다.")
else:
    for i in range(1,x+1):
        m = m * i
    print(x,"!= ",m)
