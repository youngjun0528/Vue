# time 함수

import time

t = time.time()
t = int(t//(365*24*60*60))+1970
print(t)
print(time.strptime('2019-10-11', '%Y-%m-%d'))
