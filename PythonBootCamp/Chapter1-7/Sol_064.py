# 무게 나누기 최소

weight = 25

result = 0
while weight > 0:
    if weight < 7:
        weight -= 3
        result += 1
    else:
        weight -= 7
        result += 1

if weight == 0:
    print(result)
else:
    print(-1)

