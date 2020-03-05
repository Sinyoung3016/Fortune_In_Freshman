x = int(input("연도를 입력하세요 :"))
if (((x%4==0)and(x%100!=0))or(x%400==0)):
    print(x,"년은 윤년입니다.")
else:
    print(x,"년은 평년입니다.")
    
