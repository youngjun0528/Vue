# Dictionary Select

name = input()

solar = {'Mercury': '수성', 'Venus': '금성', 'Earth': '지구', 'Mars': '화성',
         'Jupiter': '목성', 'Saturn': '토성', 'Uranus': '천왕성', 'Neptune': '해왕성', }

if(solar.get(name)):
    print(solar[name])
else:
    for (key, value) in solar.items():
        if value == name:
            print(key)
