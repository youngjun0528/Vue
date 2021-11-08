
import collections
a = [97, 86, 75, 66, 55, 97, 85, 97, 97, 95]


result = collections.Counter(a)

max_result = result.most_common(3)

sum = 0
for data in max_result:
    sum += data[1]
print(dict(max_result))
print(sum)
