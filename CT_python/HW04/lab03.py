a = [i for i in range(1, 31)]
print(a)

bL=a[:]
cL=a[:]

b = [x for x in range(0,30) if x % 2 == 0]
c = [x for x in range(0,30) if x % 2 == 1]

b.reverse()
c.reverse()

for i in b:
        del bL[i]

for i in c:
        del cL[i]
        

print(bL)
print(cL)
