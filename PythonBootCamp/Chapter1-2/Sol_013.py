# List Index

a = int(input()) - 1

solar = ["수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성"]

if(a < 0 or a > len(solar)):
    print("존재 하지 않는 행성")
else:
    print(solar[a])
