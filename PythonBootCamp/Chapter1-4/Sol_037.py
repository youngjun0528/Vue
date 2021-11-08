# Collction count

import collections
a = ['a', 'b', 'c', 'c', 'c', 'c', 'd', 'd']


result = collections.Counter(a)
max_result = result.most_common(1)[0]

print("Max Key is " + str(max_result[0]) +
      " and This Key Count is " + str(max_result[1]))
