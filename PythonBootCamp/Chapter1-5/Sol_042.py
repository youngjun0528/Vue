# 요일 구하기

import datetime
year = 2020
month = 5
day = 25

cal = datetime.date(year, month, day)
print(cal.isoweekday())

weekname = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']

print(weekname[cal.isoweekday()-1])
