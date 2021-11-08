import copy
L = [10, 20, 25, 27, 34, 35, 39]
N = 1
# N = 0, 7
# N = 1, 8

if N > 6:
    N = N - 7

temp = copy.copy(L)
result_map = []
for i in range(N):
    temp = temp[-1:] + temp[:len(L)-1]

print(temp)

for i in range(len(L)):
    result_map.append(abs(temp[i] - L[i]))

print(result_map)
print(min(result_map))
