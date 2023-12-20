import random
lottoCnt = int(input("로또 구매 수량을 입력해 주세요. : "))
qty= 1
while qty <= lottoCnt:
    lotto = []
    i = 1
    while i <= 45:
        lotto.append(i)
        i += 1 
    size = len(lotto) # 45
    cnt = 1
    while cnt <= 6:
        size -= 1
        idx = random.randint(0, size) 
        result = lotto.pop(idx) # 0 ~ 44
        print(result, end =", " )
        cnt += 1
    print()
    qty += 1