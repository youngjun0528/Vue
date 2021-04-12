from datetime import datetime

bus_time = ["12:30", "13:20", "14:13"]

current_time = '12:40'

now = datetime.now()

print(now)

string = str(now.year) + "-" + str(now.month) + \
    "-" + str(now.day) + " " + current_time

current_time_tm = datetime.strptime(string, '%Y-%m-%d %H:%M')
print(current_time_tm)

for bus in bus_time:
    string = str(now.year) + "-" + str(now.month) + \
        "-" + str(now.day) + " " + bus

    bus_time_tm = datetime.strptime(string, '%Y-%m-%d %H:%M')
    print(bus_time_tm)

    bus_gap = (bus_time_tm - current_time_tm)
    if (bus_gap).total_seconds() == 0:
        print("도착하였습니다.")
    elif (bus_gap).total_seconds() < 0:
        print('지나갔습니다.')
    else:
        print(str(bus_gap.seconds//3600) + "시간 " +
              str((bus_gap.seconds//60) % 60) + '분')
