# Dictionary

name = input().split(' ')
score = [int(x) for x in input().split(' ')]


result = dict()
for i in range(len(name)):
    result[name[i]] = score[i]

print(result)
