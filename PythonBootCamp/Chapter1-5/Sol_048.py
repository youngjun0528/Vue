# 대소문자 replace

a = 'AAAbbbCCCddd'

result = ""
for i in a:
    if i.isupper():
        result += i.lower()
    else:
        result += i.upper()

print(a)
print(result)
