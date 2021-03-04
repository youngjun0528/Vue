# 순서대로 탑쌓기

top_list = ["ABCDEF", "BCAD", "ADEFQRX", "BEDFG", "EFGHZ"]
rule = "ABD"
rule_list = list(rule)
check_list = []

for top in top_list:
    temp_list = list(top)
    result = []
    check = True
    for j in range(len(temp_list)):
        if temp_list[j] in rule_list:
            result.append(rule_list.index(temp_list[j]))
            if len(result) > 1 and result[-1] < result[-2]:
                check = False
                break

    if check:
        check_list.append("가능")
    else:
        check_list.append("불가능")

print(check_list)

