# 문자열 압축하기

a = 'aaabbbaabccaabbdd'

tmp = a[0]
result = ''
cnt = 1

for i in a[1:]:
    if tmp == i:
        cnt += 1
    else:
        result += tmp + str(cnt)
        tmp = i
        cnt = 1
print(result)

