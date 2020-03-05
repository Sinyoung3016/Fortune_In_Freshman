x = []
for i in range(30):
    x.append(i+1)
print(x)

for i in range(0,15):
    del x[2*(15-i)-2]
print(x)

x = []
for i in range(30):
    x.append(i+1)
    
for i in range(0,15):
    del x[2*(15-i)-1]
print(x)

