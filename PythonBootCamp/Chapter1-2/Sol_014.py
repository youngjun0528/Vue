# 3의 배수 확인, 3항 연산자, random 변수

import random

a = random.randint(1, 1000)

print(a)

print("짝" if (a % 3) == 0 else a)
