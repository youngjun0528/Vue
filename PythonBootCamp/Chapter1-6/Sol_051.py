# Merge Sort

def merge_sort(input):
    input_size = len(input)
    if input_size <= 1:
        return input
    middle_cnt = input_size // 2
    grp_1 = merge_sort(input[:middle_cnt])
    grp_2 = merge_sort(input[middle_cnt:])
    result = []

    while grp_1 and grp_2:
        if grp_1[0] < grp_2[0]:
            result.append(grp_1.pop(0))
        else:
            result.append(grp_2.pop(0))

    while grp_1:
        result.append(grp_1.pop(0))

    while grp_2:
        result.append(grp_2.pop(0))

    return result


input = [100, 145, 165, 45, 170, 175, 173, 171]

print(merge_sort(input))
