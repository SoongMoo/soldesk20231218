start =  int(input("시작곱을 숫자를 입력해 주세요. : "))
end = int(input("마지막곱을 숫자를 입력해 주세요. : "))
gop = start
while gop <= end:
    print(f" 8 * {gop} = {8 * gop}")
    gop += 1