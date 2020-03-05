a = input("파일 이름 :")
b = input("새 파일 이름 :")

fileA= open(a, "r")
fileB = open(b, "w")

s = fileA.read()
fileB.write(s)

fileA.close()
fileB.close()


