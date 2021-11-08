
def solution(a, b):
    a = ' ' + a
    b = ' ' + b
    an = len(a)
    bn = len(b)

    dp = [[0]*an for _ in range(bn)]
    for i in range(1, bn):
        for j in range(1, an):
            if b[i] == a[j]:
                dp[i][j] = dp[i-1][j-1] + 1
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])

    new_dp = list(map(list, zip(*dp)))

    for row in new_dp:
        print(row)

    result = ''
    max_cnt = dp[-1][-1]
    for k in range(1, max_cnt+1):
        check = False
        for i in range(len(new_dp)):
            for j in range(len(new_dp[0])):
                if new_dp[i][j] == k:
                    result += a[i]
                    check = True
                if check:
                    break
            if check:
                break

    print(result)
    print(dp[-1][-1])

    return result


if __name__ == "__main__":
    a0 = "THESTRINGS"
    b0 = "THISIS"
    solution(a0, b0)
