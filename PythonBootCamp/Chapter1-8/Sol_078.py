N = 6
K = 3

map = [i for i in range(1, N+1)]

P = 0
while True:
    if len(map) == 2:
        break
    map.pop(P)
    P += 2
    if P >= len(map):
        P = len(map) - P
    print(map)
