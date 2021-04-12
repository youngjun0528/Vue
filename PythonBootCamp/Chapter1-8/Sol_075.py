
# 만약 1- 100
# 3 6 9 로 조합 가능한 숫자
# 엽력한 숫자가 55 인 경우
# 55보다 작은 최대한 2자리 큰수
# 3     6       9
# 33    36      39
# 63    66      69
# 93    96      99
# 333   336     339
# 363   366     369
# 393   396     399

# 1자리 3
# 2자리 3 * 3
# 3자리 3 * 3 * 3

count = 0
for i in range(93+1):
    test = str(i)
    check = True
    for t in test:
        if int(t) % 3 != 0 or int(t) == 0:
            check = False
    if check:
        # print(test)
        count += 1

# print(count)


# 먼저 자리수 체크
n = 397
p = list(str(n))
p.reverse()
result = 0
cnt = 1
for k in range(len(p)):
    i = int(p[k])
    if i % 9 > 0 and i // 9 > 0 and i % 3 > 0:
        n -= (i % 9) * cnt
    elif i % 6 > 0 and i // 6 > 0 and i % 3 > 0:
        n -= (i % 6) * cnt
    elif i % 3 > 0 and i // 3 > 0:
        n -= (i % 3) * cnt
    else:
        if i % 3 > 0:
            n -= (i - 9) * cnt
            n -= cnt * 10
    p = list(str(n))
    p.reverse()
    cnt *= 10
    result = n

n = list(str(result))
answer = 0
count = 1
d = {3: 1, 6: 2, 9: 3}

while n:
    answer += d[int(n.pop())] * count
    count *= 3

print(answer)
