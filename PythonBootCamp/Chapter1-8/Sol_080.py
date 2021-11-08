from itertools import combinations  # 조합
from itertools import permutations  # 순열

result = []
for i in combinations([1, 2, 3, 4], 3):
    result.append([*i])
print(result)


result = []
for i in permutations([1, 2, 3, 4], 3):
    result.append(i)
print(result)
