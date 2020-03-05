import random

guesses = ''
turns = 20

infile = open("words.txt", "r")
lines = infile.readlines()
word = random.choice(lines)

while turns > 0:
    failed = 1
    for char in word:
        if char in guesses:
            print(char, end = "")
        else:
            failed += 1
            print("_", end = "")
    if failed == 1:
        print("사용자 승리")
        break
    print("")
    guess = input("단어를 추측 ㄱ : ")
    guesses+=guess
    if guess not in word:
        print("틀림ㅠ")
        turns -= 1
        print("남은 기회 :" + str(turns))
        if turns == 0:
            print("사용자 패배/ 정답은" + word)
                
infile.close()
        
