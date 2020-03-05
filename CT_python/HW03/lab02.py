p=int(input("투입한 돈 : "))
q=int(input("물건값 : "))
r=p-q
print("거스름돈 : ",r)
print("500원 동전의 개수 :",r//500)
print("100원 동전의 개수 :",(r%500)//100)
