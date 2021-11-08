# List 함수 응용

nationWidth = {'Korea': 220877,
               'Rusia': 17098242,
               'China': 9596961,
               'France': 543965,
               'Japan': 377915,
               'England': 242900}

koreaWidth = nationWidth['Korea']

maxNation = ''
maxWidth = max([x for x in nationWidth.values()])

for (nation, width) in nationWidth.items():
    if nation != 'Korea':
        gapWidth = abs(koreaWidth - width)
        if width < maxWidth:
            maxWidth = gapWidth
            maxNation = nation

print(maxWidth, maxNation)

