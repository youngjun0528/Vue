# 에라스토테네스의 체

def check_prime_num(x):
    temp = [True]*x

    target = int(x ** 0.5)

    for i in range(2, target+1):
        if temp[i]:
            for j in range(i+i, x, i):
                temp[j] = False

    result = [i for i in range(2, x) if temp[i] == True]

    return result


primes = check_prime_num(1000)

n = 88

check = []
result = []
sub = []

for i in range(2, n//2):
    if i in primes and n-i in primes:
        check = []
        check.append(i)
        check.append(n-i)
        result.append(check)

print(result)

for i in result:
    sub.append(abs(i[0] - i[1]))

print(result[sub.index(min(sub))])
print(result[sub.index(max(sub))])
