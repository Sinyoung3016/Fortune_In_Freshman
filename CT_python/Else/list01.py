a = range(1,31)

b = [x for x in a if x % 2 == 0]
c = [x for x in a if x % 2 == 1]

length = len(b)
for i in range(length):
        print(b[0], end = ", ")
        del b[0]

print(b)

length = len(c)
for i in range(length):
        print(c[0], end = ", ")
        del c[0]

print(c)
