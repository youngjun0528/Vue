# 문자열 빈칸 채우기

a = 'hi'

size = 50

print('{:<50}'.format('left aligned'))
#'left aligned                  '
print('{:>50}'.format('right aligned'))
#'                 right aligned'
print('{:^50}'.format(a))
#'           centered           '
print('{:=^50}'.format(a))  # use '*' as a fill char
# '***********centered***********'


