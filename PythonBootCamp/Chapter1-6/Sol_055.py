# 하노이의 탑
# https://shoark7.github.io/programming/algorithm/tower-of-hanoi

move = []


def top(circle_cnt, start_pill, end_pill, temp_pill):
    # 만약 원반이 하나일 때, 한번만 옮기면 끝
    if circle_cnt == 1:
        move.append([start_pill, end_pill])
        return None
    # 원반의 n-1개를 temp_pill 로 이동
    top(circle_cnt-1, start_pill, temp_pill, end_pill)
    # 가장 큰 원반은 end_pill 로 이동
    move.append([start_pill, end_pill])
    # temp_pill 와 start_pill 를 바꾼다.
    top(circle_cnt-1, temp_pill, end_pill, start_pill)


top(3, 'A', 'C', 'B')

print(move)

