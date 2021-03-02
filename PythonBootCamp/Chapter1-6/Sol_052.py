# Quick Sort

def quick_sort(input):
    input_size = len(input)
    if input_size <= 1:
        return input
    middle_value = input.pop(input_size//2)
    group_1 = []
    group_2 = []

    for i in range(input_size-1):
        if input[i] < middle_value:
            group_1.append(input[i])
        else:
            group_2.append(input[i])
    return quick_sort(group_1) + [middle_value] + quick_sort(group_2)


input = [100, 145, 165, 45, 170, 175, 173, 171]

print(quick_sort(input))
