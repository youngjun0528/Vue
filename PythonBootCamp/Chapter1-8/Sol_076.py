map_size = 5
search_size = 3

map = [[1, 0, 0, 1, 0],
       [0, 1, 0, 0, 1],
       [0, 0, 0, 1, 0],
       [0, 0, 0, 0, 0],
       [0, 0, 1, 0, 0]]

result = 0
for k in range(search_size):
    temp = 0
    for i in range(k, search_size + k):
        for j in range(search_size):
            temp += map[i][j]
    result = max(temp, result)

    temp = 0
    for i in range(search_size):
        for j in range(k, search_size + k):
            temp += map[i][j]
    result = max(temp, result)

print(result)
