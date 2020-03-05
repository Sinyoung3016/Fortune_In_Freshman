def prime_number(n):
    if n==1:
        return False
    if n==2:
        return True
    else:
        for i in range(2,n-1):
            if n%i == 0:
                return False
            else:
                return True
    
plist = []
for n in range(1,100):
    if prime_number(n):
        plist.append(n)

print(plist)
