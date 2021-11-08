a = [[1, 2],
     [2, 4]]
b = [[1, 0],
     [0, 3]]


def complex_check(a, b):
    if len(a) < 1 and len(b) < 1:
        return False

    check_len_first = len(a[0])
    check_len_second = len(b[0])

    for i in a:
        if len(i) != check_len_first:
            return False

    for i in b:
        if len(i) != check_len_second:
            return False

    if len(a) != len(b[0]):
        return False

    return True


# 2차원 행렬 곱
# a = [[a, b],
#      [c, d]]
# b = [[x, y],
#      [u, v]]

# [ax + bu , ay + bv]
# [cx + du , cy + dv]
# [(a[0][0] * b[0][0] + a[0][1] * b[1][0]) , (a[0][0] * b[0][1] + a[0][1] * b[1][1])]
# [(a[1][0] * b[0][0] + a[1][1] * b[1][0]) , (a[1][0] * b[0][1] + a[1][1] * b[1][1])]

def solution(arr1, arr2):
    answer = [[0 for _ in range(len(arr2[0]))] for _ in range(len(arr1))]
    print(answer)
    for i in range(len(arr1)):
        for j in range(len(arr2[0])):
            for k in range(len(arr1[0])):
                answer[i][j] += (arr1[i][k] * arr2[k][j])
    return answer


if complex_check(a, b):
    print(solution(a, b))

# Matrix Product
matrix_a = [[1, 1, 2], [2, 1, 1]]
matrix_b = [[1, 1], [2, 1], [1, 3]]
result = [[sum(a * b for a, b in zip(row_a, column_b))
           for column_b in zip(*matrix_b)] for row_a in matrix_a]
print(result)

# Matrix Transpose
matrix_a = [[1, 2, 3], [4, 5, 6]]
result = [[element for element in t] for t in zip(*matrix_a)]
print(result)

# Matrix의 덧셈
matrix_a = [[3, 6], [4, 5]]
matrix_b = [[5, 8], [3, 7]]
result = [[sum(row) for row in zip(*t)] for t in zip(matrix_a, matrix_b)]
print(result)
