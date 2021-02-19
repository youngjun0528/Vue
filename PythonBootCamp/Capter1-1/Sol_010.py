# 입력, 별찍기

cnt = int(input())

star_cnt = 1
star = [star_cnt]

# 1,3,5,7,9 홀수
for i in range(cnt-1):
    star_cnt += 2
    star.append(star_cnt)

width = star[-1]
for i in range(cnt):
    blank_cnt = (width - star[i])//2
    for j in range(blank_cnt):
        print(" ", end="")
    for k in range(star[i]):
        print("*", end="")
    print()
