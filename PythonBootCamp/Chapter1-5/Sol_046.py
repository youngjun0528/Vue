

start = 10
end = 20

numlist = [str(x) for x in range(start, end+1)]

sum = 0
for i in "".join(numlist):
    sum += int(i)

print(sum)

sum = 0
for i in range(start, end+1):
    for j in str(i):
        sum += int(j)
print(sum)
