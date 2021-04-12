
# 조합 공식

# 중복되지 않는 n개 중에서 k개를 선택하는 경우의 수
# c = n! / (n-k)!k!
# c = n(n-1)(n-2)(n-3)..... / (n-2)(n-3).....k(k-1)(k-2)

# 만약 2개를 뽑으면 공식에 의해서 (n-2).. 이하는 제거
# c = n(n-1) / 2(2-1)

people = 0

total = 59

num = 0

while True:
    num = people * (people-1) // 2
    if num > total:
        people -= 1
        break
    people += 1

print(people+1)
print(total - (people * (people-1) // 2))


# from itertools import combinations

# for i in combinations([1,2,3,4], 2):
#     print(i, end=" ")
