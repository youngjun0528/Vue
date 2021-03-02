# 연속되는 수

def check(input):
    first = input[0]

    result = []
    for i in range(first, len(input)+1):
        result.append(i)

    if result == input:
        print('YES')
    else:
        print('NO')


input = [1, 2, 3, 4, 5]
check(input)
input = [1, 4, 3, 6, 5]
check(input)
