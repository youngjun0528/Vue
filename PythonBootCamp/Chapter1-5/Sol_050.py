# 버블정렬
# https://onestep.tistory.com/44

def bubble(n, data):
    for i in range(n-1):
        for j in range(n-i-1):
            if data[j] > data[j+1]:
                # temp = data[j+1]
                # data[j+1] = data[j]
                # data[j] = temp
                data[j], data[j+1] = data[j+1], data[j]
    for i in range(n):
        print(data[i], end=' ')


n = 5

data = [4, 2, 3, 8, 5]

bubble(n, data)

# data = list(map(int, input().split()))
