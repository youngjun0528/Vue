
from collections import deque

max_weight = 50
num = 5

weight = deque([10, 20, 50, 30, 40])

print(weight)

result = []
temp = []
while True:
    a = weight.popleft()
    temp.append(a)

    if(sum(temp) == 50):
        result.append(temp)
        temp = []
    elif(sum(temp) > 50):
        b = temp.pop()
        weight.appendleft(a)
        result.append(temp)
        temp = []
    elif(sum(weight) < 50):
        result.append(temp)
        temp = []

    if len(weight) == 0:
        break

print(result)

print(len(result[0]))
