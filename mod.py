class Calculator:
    def __init__(self, first, second):
        self.first = first
        self.second = second
    def add(self):
        self.result = self.first + self.second
        return self.result
    def div(self):
        self.result = self.first / self.second
        return self.result

class FourCal(Calculator):
    def sub(self):
        self.result = self.first - self.second
        return self.result
    def mul(self):
        self.result = self.first * self.second
        return self.result
    def div(self): # 오버라이드 override :재정의
        if self.second == 0:
            self.result = 0
        else:
            self.result = self.first / self.second
        return self.result

fCalc2 = FourCal(10 , 0)

def gugu(startDan, endDan, startGop, endGop):
        for dan in range(startDan , endDan + 1):
                for gop in range(startGop, endGop + 1):
                        print(f"{dan} * {gop} = {dan * gop}")

def randint(x1 , x2):
        return x1 + x2
i = 10
PI = 3.141492