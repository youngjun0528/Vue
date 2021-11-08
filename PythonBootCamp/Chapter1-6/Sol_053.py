# 괄호 문자열 Stack/Queue

open_icon = ['(', '[', '{']
close_icon = [')', ']', '}']

input = list('{}((()){})')

print(input)

check = True

temp = []

while input:
    a = input.pop(0)
    if a in open_icon:
        temp.append(a)
    elif a in close_icon:
        if not temp:
            check = False
            break
        if open_icon.index(temp[-1]) == close_icon.index(a):
            temp.pop()

if temp or not check:
    print("NO")
else:
    print("YES")
