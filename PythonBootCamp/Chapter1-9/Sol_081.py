# 지뢰없이 깃발만 있는 리스트
flag = [
    [0, 1, 0, 0, 0],
    [0, 0, 0, 0, 0],
    [0, 0, 0, 1, 0],
    [0, 0, 1, 0, 0],
    [0, 0, 0, 0, 0]
]

minesweeper = []  # 지뢰를 찾은 리스트

for i in range(len(flag)):
    for j in range(len(flag[0])):
        if flag[i][j] == 1:
            if i-1 > -1:
                flag[i-1][j] = 2
            if j - 1 > -1:
                flag[i][j-1] = 2
            if i + 1 < len(flag):
                flag[i+1][j] = 2
            if j + 1 < len(flag):
                flag[i][j+1] = 2
