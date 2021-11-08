
# https://docs.python.org/ko/3/library/functions.html?highlight=enumerate#enumerate

stu = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
       'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'z', 'y', 'z']

for i, j in enumerate(stu):
    print('num: {}, alpha : {}'.format(i, j))

