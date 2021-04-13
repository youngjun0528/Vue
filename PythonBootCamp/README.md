# Python BootCamp

# 문제1 : 리스트의 삭제

다음 리스트에서 400, 500를 삭제하는 code를 입력하세요.

```python
nums = [100, 200, 300, 400, 500]
```

# 답안

```python
nums = [100, 200, 300, 400, 500]
nums.pop()
nums.pop()
print(nums)
```



# 문제2 : 리스트의 내장함수

```python
l = [200, 100, 300]
<pass>
print(l)
```

<pass>부분에 리스트 내장함수를 insert를 이용하여 코드를 입력하고 다음과 같이 출력되게 하세요.

>> 출력

```python
[200, 100, 10000, 300]
```

# 답안

```python
l = [200, 100, 300]
l.insert(2, 10000)
print(l)
```



# 문제3 : 변수의 타입

- 다음 출력 값으로 올바른 것은?

```python
l = [100, 200, 300]
print(type(l))
```

1)  class 'str'
2)  class 'int'
3)  class 'list'
4)  class 'tuple'



# 답안

3)  class 'list'

정답은 '3번'입니다.



# 문제4 : 변수의 타입2

다음 변수 a를 print(type(a))로 넣었을 때 출력될 값과의 연결이 알맞지 않은 것은?

1)  입력 : a =1,   출력 : class 'int'

2)  입력 : a = 2.22,   출력 : class 'float'

3)  입력 : a = 'p',   출력 : class 'char'

4)  입력 : a = [1, 2, 3],   출력 : class 'list'

# 답안

3)  입력 : a = 'p',   출력 : class 'char'

class 'str' 이 맞는 출력값입니다

정답은 '3번'입니다.



# 문제5 : for문 계산

- 다음 코드의 출력 값으로 알맞은 것은?

```python
a = 10
b = 2
for i in range(1, 5, 2):
    a += i

print(a+b)
```

1)  10
2)  12
3)  14
4)  16

# 답안

4)  16

정답은 '4번'입니다.



# 문제6 : False

다음은 파이썬 문법 중에서 False로 취급하는 것들 입니다.
앗, False로 취급하지 않는 것이 하나 있네요! **True를 찾아주세요.**

1)  None
2)  1
3)  ""
4)  0
5)  bool(0)

# 답안

2)  1

정답은 '2번'입니다.



# 문제7 : 변수명

다음 중 변수명으로 사용할 수 없는 것 2개를 고르시오.

1)  age
2)  a
3)  as
4)  _age
5)  1age

# 답안

3)  as
5)  lage

정답은 '3번', '5번' 입니다.



# 문제8 : 딕셔너리 키 이름 중복

딕셔너리를 다음과 같이 만들었다. 
출력값을 입력하시오. (출력값은 공백을 넣지 않습니다. )

```python
d = {'height':180,'weight':78,'weight':84,'temparture':36,'eyesight':1}
print(d['weight'])
```

# 답안

정답은 '84' 입니다.



# 문제9 : sep과 end를활용한 출력방법

다음 소스 코드를 완성하여 날짜와 시간을 출력하시오.

```python
year = '2019'
month = '04'
day = '26'
hour = '11'
minute = '34'
second = '27'

print(year, month, day, )
print(hour, minute, second, )
```

>> 출력

```python
2019/04/26 11:34:27
```

# 답안

```python
year = '2019'
month = '04'
day = '26'
hour = '11'
minute = '34'
second = '27'

print(year, month, day, sep='/', end=' ')
print(hour, minute, second, sep=':')
```



# 문제10 : 별 찍기

크리스마스 날, 은비는 친구들과 함께 파티를 하기로 했습니다. 그런데, 크리스마스 트리를 사는 것을 깜빡하고 말았습니다. 온 가게를 돌아다녀 봤지만 크리스마스 트리는 모두 품절이었습니다. 
하는 수 없이 은비는 프로그래밍으로 트리를 만들기로 합니다. 

**은비를 위해 프로그램을 작성해 주세요.**

### 입출력 예시

>> 입력

```python
5
```

>> 출력

```python
    *
   ***
  *****
 *******
*********
```

# 답안

```python
n = int(input())
for i in range(1,n+1):
	print(" "*(n-i)+("*"*(2*i-1)))
```



# 문제11 : for를 이용한 기본 활용

1부터 100까지 모두 더하는 Code를 <pass> 부분에 완성하세요. for를 사용해야 합니다.

```python
s = 0

<pass>

print(s)
```

# 답안

```python
s = 0

for i in range(101):
		s += i

print(s)
```



# 문제12 : 게임 캐릭터 클래스 만들기

다음 소스코드에서 클래스를 작성하여 게임 캐릭터의 능력치와 '파이어볼'이 출력되게 만드시오.

**주어진 소스 코드를 수정해선 안됩니다.**

```python
<여기에 class를 작성하세요.>

x = Wizard(health = 545, mana = 210, armor = 10)
print(x.health, x.mana, x.armor)
x.attack()
```

>> 출력예시

```python
545 210 10
파이어볼
```

# 답안

```python
class Wizard:
    def stats(self, health, mana, armor):
        self.health = health
        self.mana = mana
        self.armor = armor
 
    def attack(self):
        print('파이어볼')

x = Wizard(health=545, mana=210, armor=10)
print(x.health, x.mana, x.armor)
x.attack()
```



# 문제13 : 몇 번째 행성인가요?

우리 태양계를 이루고 있는 행성은 수성, 금성, 지구, 화성, 목성, 토성, 천왕성, 해왕성으로 총 8개 입니다. 저희는 우리 태양계의 n번째 행성이 무엇인지 알고 싶습니다.

입력으로 행성의 순서를 나타내는 숫자 n이 입력됩니다. 예를들어 수성은 첫번째 행성입니다.

```python
1
```

출력으로 그 순서에 해당하는 행성의 이름을 출력해 주세요.

```python
수성
```

# 답안

```python
planets = ['수성', '금성', '지구', '화성', '목성', '토성', '천왕성', '해왕성']

n = int(input()) - 1
print(planets[n])
```



# 문제14 : 3의 배수 인가요?

영희는 친구와 게임을 하고 있습니다. 서로 돌아가며 랜덤으로 숫자를 하나 말하고 그게 3의 배수이면 박수를 치고 아니면 그 숫자를 그대로 말하는 게임입니다.

입력으로 랜덤한 숫자 n이 주어집니다.

만약 그 수가 **3의 배수라면 '짝'이라는 글자를, 3의 배수가 아니라면 n을 그대로 출력**해 주세요.

>> 입력

```python
3
```

>> 출력

```python
짝
```

>> 입력

```python
2
```

>> 출력

```python
2
```

# 답안

```python
n = int(input())

if n % 3 == 0:
	print('짝')
else:
	print(n)
```



# 문제15 : 자기소개

신학기가 시작되고, 아이들이 돌아가면서 자기소개를 하기로 했습니다.

만약 입력으로 `김다정`이라는 이름이 주어지면

```python
안녕하세요. 저는 김다정입니다.
```

라고 출력하게 해주세요.

>>입력

# 답안

```python
n = input()

print('안녕하세요. 저는 {}입니다.'.format(n))
```



# 문제16 : 로꾸거

문장이 입력되면 거꾸로 출력하는 프로그램을 만들어 봅시다.

>> 입력

```python
거꾸로
```

>> 출력

```python
로꾸거
```

# 답안

```python
n = input()
print(n[::-1])
```



# 문제17 : 놀이기구 키 제한

유주는 놀이공원 아르바이트 중입니다. 그런데 놀이기구마다 키 제한이 있습니다.
유주가 담당하는 놀이기구는 키가 150 이상만 탈 수 있습니다.

입력으로 키가 주어지면
키가 150이 넘으면 **YES**를 틀리면 **NO**를 출력하는 프로그램을 작성하세요.

# 답안

```python
n = int(input())
if n < 150:
	print("NO")
elif 150 <= n:
	print("YES")
```



# 문제18 : 평균 점수

영하네 반은 국어, 수학, 영어 시험을 보았습니다. 영하는 친구들의 평균 점수를 구해주기로 했습니다.

공백으로 구분하여 세 과목의 점수가 주어지면
**전체 평균 점수**를 구하는 프로그램을 작성하세요. **단, 소숫점 자리는 모두 버립니다.**

>> 입력

```python
20 30 40
```

>> 출력

```python
30
```

# 답안

```python
data = list(map(int, input().split()))

print(int(sum(data)/3))
```



# 문제19 : 제곱을 구하자

공백으로 구분하여 두 숫자 a와 b가 주어지면, **a의 b승**을 구하는 프로그램을 작성하세요.

# 답안

```python
n = list(map(int, input().split()))
print(n[0] ** n[1])
```



# 문제20 : 몫과 나머지

공백으로 구분하여 두 숫자가 주어집니다.
첫번째 숫자로 두번째 숫자를 나누었을 때 **그 몫과 나머지를 공백으로 구분하여 출력하세요.**

>> 입력

```python
10 2
```

>> 출력

```python
5 0
```

# 답안

```python
data = list(map(int, input().split()))

result = data[0] // data[1]
left = data[0] % data[1]

print(result, left)
```



# 문제21 : set은 어떻게 만드나요?

다음 중 set을 만드는 방법이 아닌 것?

1)  x = {1, 2, 3, 5, 6, 7}
2)  x = {}
3)  x = set('python')
4)  x = set(range(5))
5)  x = set()

# 답안

2)  x = { }

정답은 '2번'입니다.



# 문제22 : 배수인지 확인하기

다음 중 변수 i가 6의 배수인지 확인하는 방법으로 올바른 것은?

1)  i / 6 == 0
2)  i % 6 == 0
3)  i & 6 == 0
4)  i | 6 == 0
5)  i // 6 == 0

# 답안

2)  i % 6 == 0

정답은 '2번'입니다.



# 문제23 : OX문제

print(10/2)의 출력 결과는 **5**이다.

# 답안

X

정답은 'X'입니다.



# 문제24 : 대문자로 바꿔주세요!

민지는 국제 포럼에서 아르바이트를 하게 되었습니다. 민지는 각 국에서 온 참가자들의 명단을 엑셀로 정리하고 있는데 참가자들 이름이 어떤 이는 전부 소문자, 어떤 이는 전부 대문자로 써져 있는 등 형식이 제각각이었습니다.

민지를 위해 **이름이 입력되면 전부 대문자로 출력되는 프로그램**을 만들어주세요.

>> 입력

```python
mary
```

>> 출력

```python
MARY
```

# 답안

```python
name = input()
print(name.upper())
```



# 문제25 : 원의 넓이를 구하세요

원의 넓이는 `반지름의 길이 x 반지름의 길이 x 3.14`로 구할 수 있습니다.
함수를 사용하여 원의 넓이를 구하는 코드를 작성해봅시다.

**입력을 반지름의 길이로 정수 n이 주어지면 원의 넓이를 반환하는 함수**를 만들어 주세요.
(입력을 해야하기 때문에 input을 반드시 사용해야합니다)

# 답안

```python
def solution(n):
	return n * n * 3.14

print(solution(int(input()))
```



# 문제26 : 행성 문제2

우리 태양계를 이루는 행성은 수성, 금성, 지구, 화성, 목성, 토성, 천왕성, 해왕성이 있습니다.
이 행성들의 영어 이름은 Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune입니다.

**행성의 한글 이름을 입력하면 영어 이름을 반환하는 프로그램**을 만들어 주세요.

# 답안

```python
planets = {
	'수성' : 'Mercury',
	'금성' : 'Venus',
	'지구' : 'Earth',
	'화성' : 'Mars',
	'목성' : 'Jupiter',
	'토성' : 'Saturn',
	'천왕성' : 'Uranus',
	'해왕성' : 'Neptune',
}

name = input()
print(planets[name])
```



# 문제27 : 딕셔너리 만들기

첫 줄에는 학생의 이름이 공백으로 구분되어 입력되고, 두번째 줄에는 그 학생의 수학 점수가 공백으로 구분되어 주어집니다.

두 개를 합쳐 **학생의 이름이 key**이고 **value가 수학 점수**인 딕셔너리를 출력해주세요.

>> 입력

```python
Yujin Hyewon
70 100
```

>> 출력

```python
{'Yujin': 70, 'Hyewon': 100}
```

# 답안

```python
keys = input().split()
values = map(int, input().split())

result = dict(zip(keys, values))
print(result)
```



# 문제28 : 2-gram

**2-gram**이란 문자열에서 2개의 연속된 요소를 출력하는 방법입니다. 
예를 들어 '**Python**'을 2-gram으로 반복해 본다면 다음과 같은 결과가 나옵니다.

```python
Py
yt
th
ho
on
```

입력으로 문자열이 주어지면 **2-gram**으로 출력하는 프로그램을 작성해 주세요.

# 답안

```python
data = input()

for i in range(len(data) - 1):
	print(data[i], data[i+1], sep = '')
```



# 문제29 : 대문자만 지나가세요

진구는 영어 학원 아르바이트를 하고 있습니다. 반 아이들은 알파벳을 공부하는 학생들인데 오늘은 대문자 쓰기 시험을 봤습니다.

**알파벳 하나만을 입력하고 그 알파벳이 대문자이면 YES를 아니면 NO를 출력하는 프로그램**을 만들어 주세요.

→ 알파벳 여러개를 입력하고 여러개 입력한 것 중 대문자만 출력해주는 프로그램도 만들어보세요.

# 답안

```python
data = input()

if data.isupper():
	print("YES")
else:
	print("NO")
```



# 문제30 : 문자열 속 문자 찾기

문자 pineapple에는 apple이라는 문자가 숨어 있습니다. 원범이는 이렇듯 문자열 속에 숨어있는 문자를 찾아보려고 합니다.

입력으로 첫 줄에 문자열이 주어지고 둘째 줄에 찾을 문자가 주어지면 
**그 문자가 시작하는 index를 반환하는 프로그램**을 만들어 주세요

```python
**입력**

pineapple is yummy
apple

**출력**
4
```

# 답안

```python
data = input()
word = input()

print(data.find(word))
```

- index와 find의 차이점을 찾아보세요.



# 문제31 : 파이썬 자료형의 복잡도

다음 리스트의 내장함수의 시간 복잡도가 O(1)이 아닌것은?

1)  l[i]
2)  l.append(5)
3)  l[a:b]
4)  l.pop()
5)  l.clear()

# 답안

3)  l[a:b]

정답은 '3번'입니다.



# 문제32 : 문자열 만들기

취업 준비생인 혜림이는 자기소개서를 쓰고 있습니다. 열심히 자기소개서를 작성하던 도중 혜림이는 자기가 지금까지 단어를 얼마나 적었는지 궁금하게 됩니다. 

혜림이를 위해 **문자열을 입력받으면 단어의 갯수를 출력하는 프로그램**을 작성해 주세요.

```python
**입출력**

입력 : 안녕하세요. 저는 제주대학교 컴퓨터공학전공 혜림입니다.
출력 : 5
```

# 답안

```python
n = input()
l = list(n.strip().split())
print(len(l))
```



# 문제33 : 거꾸로 출력하기

한 줄에 여러개의 숫자가 입력되면, 역순으로 그 숫자들을 하나씩 출력하는 프로그램을 작성하시오.

```python
**입출력**

입력 : 1 2 3 4 5
출력 : 5 4 3 2 1

입력 : 2 4 6 7 8
출력 : 8 7 6 4 2
```

# 답안

```python
n = input()

l = list(n.strip().split())
len1 = len(l) - 1
for i in range(len1, -1, -1):
	print(l[i], end=' ')
```



# 문제34 : sort 구현하기

민주는 체육부장으로 체육시간이 되면 반 친구들이 제대로 키 순서대로 모였는지를 확인해야 한다. 그런데 요즘 민주는 그것이 너무 번거롭게 느껴져 한 번에 확인하고 싶어한다. 

민주를 위해 **키가 주어지면 순서대로 제대로 섰는지 확인하는 프로그램**을 작성해보자.

**입출력 예시**

```
입력 : 176 156 155 165 166 169
출력 : NO
```

# 답안

```python
user_input = input()

l = list(user_input.strip().split())
l = [int (i) for i in l]

if l != sorted(l):
	print("NO")
	
else:
	print("YES")
```



# 문제35 : Factory 함수 사용하기

2제곱, 3제곱, 4제곱을 할 수 있는 Factory 함수를 만들려고 합니다. 

- <pass>에 코드를 작성하여 two함수를 완성하세요.

```python
def one(n):
    def two():
        <pass>
    return two

a = one(2)
b = one(3)
c = one(4)
print(a(10))
print(b(10))
print(c(10))
```

# 답안

```python
def one(n):
    def two(value):
        sq = value ** n
        return sq
    return two

a = one(2)
b = one(3)
c = one(4)
print(a(10))
print(b(10))
print(c(10))
```



# 문제36 : 구구단 출력하기

1~9까지의 숫자 중 하나를 입력하면 그 단의 구구단 결과를 한 줄에 출력하는 프로그램을 작성하세요.

>> 입력

```python
2
```

>> 출력

```python
2 4 6 8 10 12 14 16 18
```

# 답안

```python
n = int(input())
for i in range(1, 10):
	print(n*i, end = ' ')
```



# 문제37 : count 사용하기

새 학기를 맞아 호준이네 반은 반장 선거를 하기로 했습니다.  그런데 표를 하나씩 개표하는 과정이 너무 번거롭게 느껴진 당신은 **학생들이 뽑은 후보들을 입력받으면 뽑힌 학생의 이름과 받은 표 수를 출력하는 프로그램**을 작성하기로 하였습니다.

```python
**입력**
원범 원범 혜원 혜원 혜원 혜원 유진 유진

**출력**
혜원(이)가 총 4표로 반장이 되었습니다.
```

# 답안

```python
data = list(map(str, input().split()))
count = 0
for i in range(len(data)):
	if data.count(data[i-1]) < data.count(data[i]):
		count = i
print("{}(이)가 총 {}표로 반장이 되었습니다.".format(data[count], data.count(data[count])))
```



# 문제38 : 호준이의 아르바이트

호준이는 아르바이트로 영어 학원에서 단어 시험지를 채점하는 일을 하고 있다. 호준이가 일하는 학원은 매번 1위부터 3위까지의 학생에게 상으로 사탕을 준다. 그런데 오늘은 마침 사탕이 다 떨어져서 호준이가 채점을 하고 점수를 보내면, 당신이 아이들의 숫자만큼 사탕을 사러 가기로 했다.

학생들의 점수를 공백으로 구분하여 입력받는다. 1위~ 3위 학생은 여러명일 수 있고 1~3위 학생 중 중복되는 학생까지 포함하여 사탕을 사기로 한다.

```
점수입력 : 97 86 75 66 55 97 85 97 97 95
출력 : 6
```

# 답안

```python
user_input = input()

l = list(user_input.strip().split())
l = [int (i) for i in l]

count = 3
#3개는 무조건 구매, 배열 정렬 후 1~3위 중 중복되는 숫자까지 포함

data_sorted = sorted(list(l))

print(data_sorted)
for i in range(len(l)-1, 0, -1):
	if data_sorted[-3] == l[i]:
		count += 1
print(count)

'''
**난뀨님 문의사항(https://www.inflearn.com/questions/16158)**
#key.count(top) 이걸 넣는 이유가 무엇인가요? 그냥 리스트 전체 순회해서 지우면 안되나요?

**답변**
안녕하세요 난뀨님! :)
먼저 38번 답변을 해드리자면, 맞습니다. 그렇게 하시는 편이 효율면에서도 좋아요.^^

(이해하기 쉽도록 설명한다고 그렇게 설명한 것인데 오히려 비효율적이고 
이해하기 어려우셨을 수도 있었겠다는 생각을 했습니다.ㅜㅜ)

아래 예제를 들어드릴게요.

[1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8, 9, .... 10000000]

여기서 5라는 숫자만 다 지우고 싶으면 6번만 순회를 하면 되는데, 
리스트 전체를 순회할 경우 10000000를 순회해야 한다고 일반적으로 생각합니다.

그러나!
remove의 시간복잡도는 O(N)입니다.

따라서, 오히려 비효율적이에요.
난뀨님이 말씀해주신 것처럼 푸는 것이 옳습니다.^^
'''
```



# 문제39 : 오타 수정하기

혜원이는 평소 영타가 빠르고 정확한 것을 친구들에게 자랑하고 다녔습니다. 반 친구들이 혜원이의 타자 속도가 빠르다는 것을 모두 알게 되자 혜원이는 모두의 앞에서 타자 실력을 보여주게 됩니다. 

그런데 막상 보여주려니 긴장이 되서 문장의 모든 e를 q로 잘못 친 것을 발견했습니다. 
혜원이는 프로그램을 돌려 재빠르게 모든 q를 e로 바꾸는 프로그램을 작성하려고 합니다.

**문장이 입력되면 모든 q를 e로 바꾸는 프로그램을 작성해 주세요.**

```python
**입출력**

입력 : querty
출력 : euerty

입력 : hqllo my namq is hyqwon
출력 : hello my name is hyewon
```

# 답안

```python
n = input()
print(n.replace("q", "e"))
```



# 문제40 : 놀이동산에 가자

테마파크에 온 원범이와 친구들은 놀이기구를 타려고 합니다. 모든 놀이기구는 한번에 타는 인원수에는 제한이 없지만 제한 무게를 넘으면 무조건 다음 기구를 타야 합니다. 

**원범이와 친구들이 총 몇 명 탈 수 있는지 알 수 있는 프로그램을 작성해 주세요.**

첫번째 줄에서 제한 무게가 주어지고 두번째 줄에서는 함께한 친구들의 수 n이 주어집니다. 
그 다음 차례대로 탑승할 친구들의 몸무게가 주어집니다. 몸무게는 무작위로 주어집니다.

```python
**입력**

50
5
20
20
20
20
20

**출력**
2
```

# 답안

```python
total = 0
count = 0
limit = int(input())
n = int(input())
 
for i in range(n):
    if total <= limit:
        total += int(input())
        count = i
print(count)

## 두 코드의 차이점은 무엇일까요?

제한무게 = int(input())
친구수 = int(input())
친구몸무게 = []
for i in range(친구수):
    친구몸무게.append(int(input()))

전체몸무게 = 0
for i in range(len(친구몸무게)):
    전체몸무게 += 친구몸무게[i]
    print(전체몸무게, 제한무게)
    if 전체몸무게 > 제한무게:
        print(i)
        break
```



# 문제41 : 소수판별

숫자가 주어지면 **소수인지 아닌지 판별하는 프로그램**을 작성해주세요.
소수이면 YES로, 소수가 아니면 NO로 출력해주세요.
(소수 : 1과 자기 자신만으로 나누어떨어지는 1보다 큰 양의 정수)

# 답안

```python
#인터넷에서 에라토스테네스의 체를 검색해보시고, 에라토스테네스의 체를 구현해보세요.

def check_prime(n):
    i = 2
    while i < n:
        if n % i == 0:
            break
        i = i + 1
    if i == n:
        print("YES")
    else:
        print("NO")
check_prime(int(input()))

###

x = int(input())
for i in range(2, x//2 + 1):
    if x == 1:
        print('소수가 아닙니다.')
        break
    if x == 2:
        print('소수입니다.')
        break
    if x % i == 0:
        print('소수가 아닙니다.')
        break
else:
    print('소수입니다.')
```



# 문제42 : 2020년(datetime 모듈 사용)

2020년 1월 1일은 수요일입니다. 2020년 a월 b일은 무슨 요일일까요?
두 수 a, b를 입력받아 2020년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
요일의 이름은 일요일부터 토요일까지 각각 SUN, MON, TUE, WED, THU, FRI, SAT 입니다.

예를 들어 a = 5, b = 24라면 5월 24일은 일요일이므로 문자열 "SUN"를 반환하세요.

**제한 조건**
2020년은 윤년입니다.
2020년 a월 b일은 실제로 있는 날입니다. 
(13월 26일이나 2월 45일 같은 날짜는 주어지지 않습니다.)
datetime 모듈을 사용하세요.

# 답안

```python
import datetime
m = int(input())
d = int(input())
def findDay(a,b):
    day = ["MON","TUE","WED","THU","FRI","SAT","SUN"]
    return day[datetime.date(2020,a,b).weekday()]
print(findDay(m,d))
```



# 문제43 : 10진수를 2진수로

우리가 흔히 사용하는 숫자 1, 8, 19, 28893 등등...은 10진수 체계입니다.
이를 컴퓨터가 알아 들을 수 있는 2진수로 바꾸려고 합니다. 어떻게 해야할까요?

예를들어 13은 2^3 + 2^2 + 2^0 = 13 이기때문에 1101으로 표현합니다

**사용자에게 숫자를 입력받고 이를 2진수를 바꾸고 그 값을 출력해주세요.**
(bin 함수를 사용하지 않고 풀어주세요.)



# 답안

```python
a = int(input())
b = []

while a:
    print(a)
    b.append(str(a % 2))
    a = int(a / 2)

print(b)
b.reverse()
print(b)
print(''.join(b))

**'''**
**난뀨님 문의사항(https://www.inflearn.com/questions/16158)에 대한 답변**
b = []
while key: 
    b.append(str(key % 2)) 
 #int형은 append가 왜 여기서만 오류가 뜨는 거에요? 
 #답변 -> int형으로 하였을 때 append에서 오류가 뜨진 않고, 
 #답변 -> 아래 join에서 오류가 뜹니다.
    key = int(key / 2)  
 #key는 이미 int인데 왜 int를 한번 더 해주는 건가요? 
 #위에 줄에서 str로 바꿔줬기 때문이라면 int(key / 2)가 아니라 int(key) / 2 
 #이렇게 해야 작동해야 하는거 아닌가요? 
 #답변 -> 슬러쉬가 1개(/)일때 반환형이 float형이어서 그렇습니다.
 #답변 -> //로 해도 좋을 것 같네요.^^
b.reverse() 
print(int(''.join(b)))
'''
```



# 문제44 : 각 자리수의 합

**사용자가 입력한 양의 정수의 각 자리수의 합을 구하는 프로그램**을 만들어주세요

**예를들어**
18234 = 1+8+2+3+4 이고 정답은 18 입니다.
3849 = 3+8+4+9 이고 정답은 24입니다.

# 답안

```python
n = list(map(int,input()))
result = 0
for i in n:
	result += i
	
print(result)

---

result = 0
for i in input():
    result += int(i)

print(result)
```



# 문제45 : time함수 사용하기

python의 모듈 중 하나인 **time 모듈**은 1970년 1월 1일 0시 0분 0초 이후로부터 지금까지 흐른 시간을 초단위로 반환합니다

이를 이용하여 **현재 연도(2019)를 출력해보세요**

# 답안

```python
import time
t = time.time()
t = int(t//(3600*24*365))+1970
print(t)
```



# 문제46 : str 자료형의 응용

1부터 100까지의(100을 포함) 모든 숫자를 일렬로 놓고 모든 자릿수의 총 합을 구하세요. 

예를 들어 10부터 15까지의 모든 숫자를 일렬로 놓으면 101112131415이고 각 자리의 숫자를 더하면 25입니다.

# 답안

```python
s = ''
for i in range(101):
    s += str(i)
print(s)
result = 0
for i in s:
    result += int(i)
print(result)
```



# 문제47 : set 자료형의 응용

바울랩에서는 3월 29일 제주대학교에서 '제주 빅데이터 사회혁신 해커톤' 행사를 주최하게 되었습니다. 이에 구글 설문지를 배포하였으나 제주대학생들이 중복해서 n개씩 설문지를 제출하였습니다. **중복된 데이터들을 삭제하여 실제 접수 명단이 몇 명인지 알고 싶습니다.**

아래 주어진 데이터들로부터 중복을 제거하여 실제 접수 인원을 출력해 주세요.

```python
people = [
         ('이호준', '01050442903'),
         ('이호상', '01051442904'),
         ('이준호', '01050342904'),
         ('이호준', '01050442903'),
         ('이준', '01050412904'),
         ('이호', '01050443904'),
         ('이호준', '01050442903'),
         ]
```

# 답안

```python
people = [
         ('이호준', '01050004429'),
         ('이호상', '01051442904'),
         ('이준호', '01050003429'),
         ('이호준', '01050004429'),
         ('이준', '01050412904'),
         ('이호', '0105000443904'),
         ('이호준', '01050004429'),
         ]

print(len(set(people)))
```



# 문제48 : 대소문자 바꿔서 출력하기

문자열이 주어지면 대문자와 소문자를 바꿔서 출력하는 프로그램을 작성하세요.

입력

```
AAABBBcccddd
```

출력

```
aaabbbCCCDDD
```

# 답안

```python
a = input()
b = []

for i in a:
	if i.islower():
		b.append(i.upper())
	else:
		b.append(i.lower())
	
for i in b:
	print(i, end='')
```



# 문제49 : 최댓값 구하기

순서가 없는 10개의 숫자가 공백으로 구분되어 주어진다. 주어진 숫자들 중 최댓값을 반환하라.

입력

```
10 9 8 7 6 5 4 3 2 1
```

출력

```
10
```

# 답안

```python
data = list(map(int, input().split()))
print(sorted(data)[-1])
```



# 문제50 : 버블정렬 구현하기

버블정렬은 두 인접한 원소를 검사하여 정렬하는 방법을 말합니다. 시간 복잡도는 느리지만 코드가 단순하기 때문에 자주 사용됩니다.

[https://img.scoop.it/omRChIeVtQY1Nodjul8eODl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9](https://img.scoop.it/omRChIeVtQY1Nodjul8eODl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9)

아래 코드의 빈 칸을 채워 버블 정렬을 완성해 봅시다.

```python
def bubble(n, data):
	for i in range(n-1):
		for j in range(빈칸을 채워주세요):
			if data[j] > data[j+1]:
				빈칸을 채워주세요
	for i in range(n):
		print(data[i], end = " ")

n = int(input())
data = list(map(int, input().split()))

bubble(n, data)
```

# 답안

```python
def bubble(n, data):
	for i in range(n-1):
		for j in range(n-i-1):
			if data[j] > data[j+1]:
				data[j], data[j+1] = data[j+1], data[j]
	for i in range(n):
		print(data[i], end = " ")

n = int(input())
data = list(map(int, input().split()))

bubble(n, data)
```



# 문제51 : merge sort를 만들어보자

병합정렬(merge sort)은 대표적인 정렬 알고리즘 중 하나로 다음과 같이 동작합니다.

> 1. 리스트의 길이가 0 또는 1이면 이미 정렬된 것으로 본다. 그렇지 않은 경우에는

2. 정렬되지 않은 리스트를 절반으로 잘라 비슷한 크기의 두 부분 리스트로 나눈다.

3. 각 부분 리스트를 재귀적으로 합병 정렬을 이용해 정렬한다.

4. 두 부분 리스트를 다시 하나의 정렬된 리스트로 합병한다.

(출처 : 위키피디아)

다음 코드의 빈칸을 채워 병합정렬을 완성해 봅시다.

```python
#병합 정렬
def 병합정렬(입력리스트):
    입력리스트길이 = len(입력리스트)
    if 입력리스트길이 <= 1:
        return 입력리스트
    중간값 = 입력리스트길이 // 2
    그룹_하나 = 병합정렬(입력리스트[:중간값])
    그룹_둘 = 병합정렬(입력리스트[중간값:])
    결과값 = []

    while (#빈칸을 채워주세요) and (#빈칸을 채워주세요) :
        if (#빈칸을 채워주세요):
            결과값.append(그룹_하나.pop(0))
        else:
            결과값.append(그룹_둘.pop(0))

    while 그룹_하나:
        결과값.append(그룹_하나.pop(0))
    while 그룹_둘:
        결과값.append(그룹_둘.pop(0))
    return 결과값

주어진리스트 = [180, 145, 165, 45, 170, 175, 173, 171]
#빈칸을 채워주세요

print(병합정렬(주어진리스트))
```

# 답안

```python
#병합 정렬
def 병합정렬(입력리스트):
    입력리스트길이 = len(입력리스트)
    if 입력리스트길이 <= 1:
        return 입력리스트
    중간값 = 입력리스트길이 // 2
    그룹_하나 = 병합정렬(입력리스트[:중간값])
    그룹_둘 = 병합정렬(입력리스트[중간값:])
    결과값 = []

    while 그룹_하나 and 그룹_둘:
        if 그룹_하나[0] < 그룹_둘[0]:
            결과값.append(그룹_하나.pop(0))
        else:
            결과값.append(그룹_둘.pop(0))

    while 그룹_하나:
        결과값.append(그룹_하나.pop(0))
    while 그룹_둘:
        결과값.append(그룹_둘.pop(0))
    return 결과값

주어진리스트 = input().split(' ')
주어진리스트 = [int(i) for i in 주어진리스트]

print(병합정렬(주어진리스트))
```



# 문제52 : quick sort

다음 빈 칸을 채워 퀵 정렬을 완성해주세요.

```python
def 퀵정렬(입력리스트):
    입력리스트의길이 = len(입력리스트)
    if 입력리스트의길이 <= 1:
        return 입력리스트
    기준값 = 입력리스트.pop(입력리스트의길이//2)
    그룹_하나 = []
    그룹_둘 = []
    
    for i in range(입력리스트의길이-1):
        if #내용을 채워주세요:
            그룹_하나.append(입력리스트[i])
        else:
            그룹_둘.append(입력리스트[i])
    return #내용을 채워주세요

주어진리스트 = input().split(' ')
#내용을 채워주세요.

print(퀵정렬(주어진리스트))
```

# 답안

```python
def 퀵정렬(입력리스트):
    입력리스트의길이 = len(입력리스트)
    if 입력리스트의길이 <= 1:
        return 입력리스트
    기준값 = 입력리스트.pop(입력리스트의길이//2)
    그룹_하나 = []
    그룹_둘 = []
    
    for i in range(입력리스트의길이-1):
        if 입력리스트[i] < 기준값:
            그룹_하나.append(입력리스트[i])
        else:
            그룹_둘.append(입력리스트[i])
    return 퀵정렬(그룹_하나) + [기준값] + 퀵정렬(그룹_둘)

주어진리스트 = input().split(' ')
주어진리스트 = [int(i) for i in 주어진리스트]

print(퀵정렬(주어진리스트))
```



# 문제53 : 괄호 문자열

괄호 문자열이란 괄호 기호인 '{', '}', '[', ']', '(', ')' 와 같은 것을 말한다. 그 중 괄호의 모양이 바르게 구성 된 문자열을 **바른 문자열**, 그렇지 않은 문자열을 **바르지 않은 문자열**이라 부르도록 하자. 

(())와 같은 문자열은 바른 문자열이지만 ()()) 와 같은 문자열은 바르지 않은 문자열이다.(해당 문제에서는 소괄호만 판별하지만, 실력이 되시는 분들은 중괄호와 대괄호까지 판별해보세요.)

**입력으로 주어진 괄호 문자열이 바른 문자열인지 바르지 않은 문자열인지 "YES"와 "NO"로 구분된 문자열을 출력해보자.**

# 답안

```python
def math(e):
    if e.count('(') != e.count(')'):
        return False
    괄호 = []
    for i in e:
        if i == '(':
            괄호.append('(')
        if i == ')':
            if len(괄호) == 0:
                return False
            괄호.pop()
    return True

n = input()
if math(n) == True:
	print("YES")
else:
	print("NO")
```



# 문제54 : 연속되는 수

은주는 놀이공원 아르바이트를 하고 있습니다. 은주가 일하는 놀이공원에서는 현재 놀이공원 곳곳에 숨겨진 숫자 스탬프를 모아 오면 선물을 주는 이벤트를 하고 있습니다. 숫자 스탬프는 매일 그 수와 스탬프에 적힌 숫자가 바뀌지만 그 숫자는 항상 연속됩니다. 
그런데 요즘 다른 날에 찍은 스탬프를 가지고 와 선물을 달라고 하는 손님이 늘었습니다.

스탬프에 적힌 숫자가 공백으로 구분되어 주어지면 이 숫자가 연속수인지 아닌지 "YES"와 "NO"로 판별하는 프로그램을 작성하세요.

```python
**입력1**
1 2 4 3 5

**출력1**
YES

**입력2**
1 4 2 6 3

**출력2**
NO
```

# 답안

```python
user_input = input().split(' ')
user_input = [int(i) for i in user_input]

def sol(l):
    l = sorted(l)
    for i in range(len(l) - 1):
        if l[i]+1 != l[i+1]:
            return 'NO'
    return 'YES'

print(sol(user_input))
```



# 문제55 : 하노이의 탑

하노이의 탑은 프랑스 수학자 에두아르드가 처음으로 발표한 게임입니다. 하노이의 탑은 A, B, C 3개의 기둥과 기둥에 꽂을 수 있는 N개의 원판으로 이루어져 있습니다. 이 게임에서 다음의 규칙을 만족해야 합니다.

> 1. 처음에 모든 원판은 A기둥에 꽂혀 있다.

2. 모든 원판의 지름은 다르다.
3. 이 원반은 세 개의 기둥 중 하나에 반드시 꽂혀야 한다.
4. 작은 원반 위에 큰 원반을 놓을 수 없다.
5. 한 번에 하나의 원판(가장 위에 있는 원판) 만을 옮길 수 있다.

이 규칙을 만족하며 A기둥에 있는 원반 N개를 모두 C 원반으로 옮기고 싶습니다.
모든 원반을 옮기기 위해 실행되어야 할 최소 원반 이동 횟수를 계산하는 프로그램을 완성해주세요.

```python
원판의이동경로 = []
def 하노이(원반의수, 시작기둥, 목표기둥, 보조기둥):
    #원판이 한개일 때에는 옮기면 됩니다.
    if 원반의수 == 1:
        원판의이동경로.append([시작기둥, 목표기둥]) 
        return None
    #원반의 n-1개를 경유기둥으로 옮기고
    하노이(#내용을 채워주세요.)
    #가장 큰 원반은 목표기둥으로
    원판의이동경로.append(#내용을 채워주세요.) 
    #경유기둥과 시작기둥을 바꿉니다!
    하노이(#내용을 채워주세요.)

user_input = int(input())
하노이(user_input,'A','C','B')

print(len(원판의이동경로))
```

# 답안

```python
원판의이동경로 = []
def 하노이(원반의수, 시작기둥, 목표기둥, 보조기둥):
    #원판이 한개일 때에는 옮기면 됩니다.
    if 원반의수 == 1:
        원판의이동경로.append([시작기둥, 목표기둥]) 
        return None

    #원반의 n-1개를 경유기둥으로 옮기고
    하노이(원반의수-1, 시작기둥, 보조기둥, 목표기둥)
    #가장 큰 원반은 목표기둥으로
    원판의이동경로.append([시작기둥, 목표기둥]) 
    #경유기둥과 시작기둥을 바꿉니다!
    하노이(원반의수-1, 보조기둥, 목표기둥, 시작기둥)

하노이(3,'A','C','B')
print(원판의이동경로)
print(len(원판의이동경로))
```



# 문제56 : 리스트의 함수 응용

다음의 딕셔너리가 주어졌을 때 한국의 면적과 가장 비슷한 국가와 그 차이를 출력하세요.

```python
**데이터**
nationWidth = {
     'korea': 220877,
     'Rusia': 17098242,
     'China': 9596961,
     'France': 543965,
     'Japan': 377915,
     'England' : 242900 }

**출력**
England 22023
```

# 답안

```python
nationWidth = {
	'korea': 220877, 
	'Rusia': 17098242, 
	'China': 9596961, 
	'France': 543965, 
	'Japan': 377915,
	'England' : 242900,
}

w = nationWidth['korea']
nationWidth.pop('korea')
l = list(nationWidth.items())
gap = max(nationWidth.values())
item = 0

for i in l:
    if gap > abs(i[1] - w):
        gap = abs(i[1] - w)
        item = i
print(item[0],item[1]-220877)
```



# 문제57 : 내장함수 응용하기

**0부터 1000까지 1의 개수를 세는 프로그램**을 만들려고 합니다. 예를 들어 0부터 20까지 1의 개수를 세어본다면 1, 10 11, 12, 13, 14, 15, 16, 17, 18, 19 에 각각 1이 들어가므로 12개의 1이 있게 됩니다. 11은 1이 2번 들어간 셈이죠.

그렇다면 0부터 1000까지 수에서 1은 몇번이나 들어갔을까요? 출력해주세요!

# 답안

```python
def count(n):
	countN = str(list(range(n+1))).count('1')
	return countN

print(count(1000))
```



# 문제58 : 콤마 찍기

원범이는 편의점 아르바이트가 끝난 후 정산을 하고자 합니다.
정산을 빨리하고 집에가고 싶은 원범이는 프로그램을 만들려고 합니다.

**숫자를 입력 받고 천단위로 콤마(,)를 찍어주세요.**

예를들어, 123456789를 입력받았으면 123,456,789 를 출력해야합니다.

# 답안

```python
n = int(input())

result = format(n, ',')
print(result)

##재귀함수 사용해서도 풀어보세요!
```



# 문제59 : 빈칸채우기

총 문자열의 길이는 50으로 제한하고 사용자가 문자열을 입력하면 그 문자열을 가운데 정렬을 해주고, 나머지 빈 부분에는 '='을 채워넣어주세요

**입출력예시** 

```python
**입력**
hi

**출력**
========================hi========================
```

# 답안

```python
user_input = input()
print("{0:=^50}".format(user_input))
```



# 문제60 : enumerate

새학기가 되어 **이름을 가나다 순서대로 배정하고 번호를 매기려고 합니다**.
코드에 입력된 이름을 아래와 같이 출력해주세요.

```python
**데이터**
student = ['강은지','김유정','박현서','최성훈','홍유진','박지호','권윤일','김채리','한지호','김진이','김민호','강채연']

**출력**
번호: 1, 이름: 강은지
번호: 2, 이름: 강채연
번호: 3, 이름: 권윤일
번호: 4, 이름: 김민호
번호: 5, 이름: 김유정
번호: 6, 이름: 김진이
번호: 7, 이름: 김채리
번호: 8, 이름: 박지호
번호: 9, 이름: 박현서
번호: 10, 이름: 최성훈
번호: 11, 이름: 한지호
번호: 12, 이름: 홍유진
```

# 답안

```python
students = sorted(students)

for number, name in enumerate(students):
    print("번호: {}, 이름: {}".format(number+1, name))
```



# 문제61 : 문자열 압축하기

문자열을 입력받고 연속되는 문자열을 압축해서 표현하고싶습니다.

```python
**입력**
aaabbbbcdddd

**출력**
a3b4c1d4
```

# 답안

```python
#답1
user_input = input()
s = ''
storeString = user_input[0]
count = 0
for i in user_input:
    if i == storeString:
        count += 1
    else:
        s += str(count) + storeString
        storeString = i
        count = 1
s += str(count) + storeString
print(s)

#답2 - 이해를 돕기 위한 예제

import re

input_data = 'aaabbccccccasss'
rule = re.compile('[a-c]+')

one = re.findall('b', input_data)
two = re.findall(rule, input_data)
three = re.findall('(\\w)(\\1*)', input_data)

print(one)
print(two)
print(three)

#답2 - 풀이

import re

input_data = 'aaabbccccccasss'
rule = re.compile('[a-c]+')

one = re.findall('b', input_data)
two = re.findall(rule, input_data)
three = re.findall('(\\w)(\\1*)', input_data)

print(one)
print(two)
print(three)

s = ''
for i, j in three:
    s += str(len(j)+1)+i
print(s)
```



# 문제62 : 20190923출력하기

`20190923`을 출력합니다.  아래 기준만 만족하면 됩니다.

1. 코드 내에 숫자가 없어야 합니다.
    - 예) print(20190923)이라고 하시면 안됩니다.
2. 파일 이름이나 경로를 사용해서는 안됩니다.
3. 시간, 날짜 함수를 사용해서는 안됩니다.
4. 에러 번호 출력을 이용해서는 안됩니다.
5. input을 이용해서는 안됩니다.

# 답안

```python
string='aacddddddddd'
a=string.count('a') #2
b=string.count('b') #0
c=string.count('c') #1
d=string.count('d') #9
print(int(str(a)+str(b)+str(c)+str(d)+str(b)+str(d)+str(a)+str(a+1)))
```



# 문제63 : 친해지고 싶어

한국대학교의 김한국교수님은 학생들과 친해지기 위해서 딸에게 줄임말을 배우기로 했습니다.
딸은 '복잡한 세상 편하게 살자' 라는 문장을 '복세편살'로 줄여 말합니다.

교수님이 줄임말을 배우기 위해 위와 같이 어떤 입력이 주어지면 앞 글자만 줄여 출력하도록 해주세요.

```python
**입력 - 입력은 한글 혹은 영어로 입력됩니다.**
복잡한 세상 편하게 살자

**출력 - 띄어쓰기를 기준으로 하여 짧은 형태로 출력합니다.**
복세편살
```

# 답안

```python
user_input = input().split(' ')
#print(user_input)
result = ''

for s in user_input:
    result += s[0]

print(result)
```



# 문제64 : 이상한 엘레베이터

정량 N에 정확히 맞춰야만 움직이는 화물용 엘레베이터가 있습니다.
화물은 7kg, 3kg 두 가지이며 팔이 아픈 은후는 가장 적게 화물을 옮기고 싶습니다.

예를 들어 정량이 24kg이라면 3kg 8개를 옮기는 것 보다는
7kg 3개, 3kg 1개 즉 4개로 더 적게 옮길 수 있습니다.

**입력**
정량 N이 입력됩니다.

**출력**
가장 적게 옮길 수 있는 횟수를 출력합니다.
만약 어떻게 해도 정량이 N이 되지 않는다면 -1을 출력합니다.

# 답안

```python
#64번 이상한 엘리베이터
N = int(input())
result = 0

while True:
    if N%7 ==0:
        result += N//7
        print(result)
        break
    N -= 3
    result += 1
    if N < 0:
        print(-1)
        break
```



# 문제65 : 변형된 리스트

a = [1,2,3,4]
b = [a,b,c,d]
이런 리스트가 있을 때 [[1,a],[b,2],[3,c],[d,4]] 이런식으로 a,b리스트가 번갈아가면서 출력되게 해주세요.

# 답안

```python
a = input().split(' ')
b = input().split(' ')

c = []
count = 0

for i, j in zip(a, b):
	if count % 2 == 0:
		c.append([i, j])
	else:
		c.append([j, i])
	count += 1

print(c)

# [[1,'a'],['b',2],[3,'c'],['d',4]]
```



# 문제66 : 블럭탑쌓기

탑을 쌓기 위해 각 크기별로 준비된 블럭들을 정해진 순서에 맞게 쌓아햐 합니다.
순서에 맞게 쌓지 않으면 무너질 수 있습니다.
예를 들면 정해진 순서가 BAC 라면 A 다음 C가 쌓아져야 합니다.
선행으로 쌓아야 하는 블럭이 만족된 경우라면 탑이 무너지지 않습니다.

- B를 쌓지 않아도 A와 C를 쌓을 수 있습니다.
- B 다음 블럭이 C가 될 수 있습니다.

쌓아져 있는 블럭 탑이 순서에 맞게 쌓아져 있는지 확인하세요.

1. 블럭은 알파벳 대문자로 표기합니다.
2. 규칙에 없는 블럭이 사용될 수 있습니다.
3. 중복된 블럭은 존재하지 않습니다.

```python
**입력**
탑 = ["ABCDEF", "BCAD", "ADEFQRX", "BEDFG"]
규칙 = "ABD"

**출력**
["가능","불가능","가능","가능]
```

# 답안

```python
def solution(전체블록, 규칙):
    answer = []
    for 부분블록 in 전체블록:
        answer.append(블록순서체크(부분블록, 규칙))
    return answer

def 블록순서체크(부분블록, 규칙):
    임시변수 = 규칙.index(규칙[0])
    for 문자 in 부분블록:
        if 문자 in 규칙:
            if 임시변수 > 규칙.index(문자):
                return '불가능'
            임시변수 = 규칙.index(문자)
    return '가능'

전체블록 = ['ABCDEF', 'BCAD', 'ADEFQRX', 'BEDFG', 'AEBFDGCH']
규칙 = 'ABCD'

print(solution(전체블록, 규칙))
```



# 문제67 : 민규의 악수

광장에서 모인 사람들과 악수를 하는 행사가 열렸다.
참가자인 민규는 몇명의 사람들과 악수를 한 후 중간에 일이 생겨 집으로 갔다.
이 행사에서 진행된 악수는 총 n번이라고 했을때.

민규는 몇번의 악수를 하고 집으로 돌아갔을까?
이때 민규를 포함한 행사 참가자는 몇명일까?

- 악수는 모두 1대 1로 진행이 된다.
- 민규를 제외한 모든 참가자는 자신을 제외한 참가자와 모두 한번씩 악수를 한다.
- 같은 상대와 중복된 악수는 카운트 하지 않는다.
- 민규를 제외한 참가자는 행사를 모두 마쳤다.

input : n (행사에서 진행된 악수 횟수)
output : [ 민규의 악수횟수 , 행사참가자]

59회의 악수가 행사에서 진행되었다.
이때 민규는 4번의 악수를 하였고 민규를 포함한 참가자는 12명이다.

# 답안

```python
def solution(n):
    people = 0
    total = 0
    while(True):
        total = people*(people-1)/2
        if n<total:
            break
        people+=1
    times = int(people-(total-n)-1)
    return [times,people]
```



# 문제68 : 버스 시간표

학교가 끝난 지원이는 집에 가려고 합니다. 학교 앞에 있는 버스 시간표는 너무 복잡해서 버스 도착시간이 몇 분 남았는지 알려주는 프로그램을 만들고 싶습니다.
버스시간표와 현재 시간이 주어졌을 때 버스 도착 시간이 얼마나 남았는지 알려주는 프로그램을 만들어주세요.

- 버스 시간표와 현재시간이 입력으루 주어집니다.
- 출력 포맷은 "00시00분"입니다.
    만약 1시간 3분이 남았다면 "01시간03분"으로 출력해야 합니다.
- 버스 시간표에 현재 시간보다 이전인 버스가 있다면 "지나갔습니다."라고 출력합니다.

```python
**입력**
["12:30", "13:20", "14:13"]
"12:40"

**출력**
['지나갔습니다', '0시간 40분', '1시간 33분']
```

# 답안

```python
def sol(tb, rt):
    answer = []
    rt = rt.split(':')
    for i in range(len(tb)):
        time = tb[i].split(':')
        time_to_min = ((int(time[0])*60 + int(time[1])) - (int(rt[0])*60+int(rt[1])))
        if time_to_min < 0:
            answer.append("지나갔습니다")
        else:
            a = (time_to_min) // 60
            b = (time_to_min) % 60
            answer.append(str(a).zfill(2)+'시간 '+str(b).zfill(2)+'분')
    return answer

sol(["12:30", "13:20", "14:13"], "12:40")
```



# 문제69 : 골드바흐의 추측

골드바흐의 추측(Goldbach's conjecture)은 오래전부터 알려진 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 개의 소수(Prime number)의 합으로 표시할 수 있다는 것이다. 이때 하나의 소수를 두 번 사용하는 것은 허용한다. - 위키백과

위 설명에서 2보다 큰 모든 짝수를 두 소수의 합으로 나타낸 것을 골드바흐 파티션이라고 합니다.

예)
100 == 47 + 53
56 == 19 + 37

**2보다 큰 짝수 n이 주어졌을 때, 골드바흐 파티션을 출력하는 코드를** 작성하세요. 

* 해당 문제의 출력 형식은 자유롭습니다. 가능하시다면 골드바흐 파티션 모두를 출력하거나, 그 차가 작은 것을 출력하거나 그 차가 큰 것 모두 출력해보세요.

# 답안

```python
#골드바흐의 추측
def cal():
    n=10000*2
    primes=[]    
    a = [False,False] + [True]*(n-1)

    for i in range(2,n+1):
      if a[i]:
        primes.append(i)
        for j in range(2*i, n+1, i):
            a[j] = False
            
    return primes

a = cal()

#골드바흐파티션
n = int(input())
l = []
k = []	

for i in range(2, n//2+1):    
    if i in a and n-i in a:
        l.append(i)
        l.append(n-i)

for i in range(0,len(l)-1,2):
    k.append(l[i+1]-l[i])
    
index = k.index(min(k))*2
print(l[index], l[index+1])
```



# 문제70 : 행렬 곱하기

행렬 2개가 주어졌을 때 곱할 수 있는 행렬인지 확인하고 곱할 수 있다면 그 결과를, 곱할 수 없다면 -1을 출력하는 프로그램을 만들어주세요.

* 라이브러리는 사용을 금지합니다.

```python
**입력**
a = ([1, 2],
     [2, 4])
b = ([1, 0],
     [0, 3])

**출력**
([1,6], [2,12])
```

# 답안

```python
# 해당 함수를 완성해주세요
def sol(a, b):
    c = []
    if len(a) == len(b[0]):
        for i in range(len(a)):
            c.append([0]*len(b[0]))
        for i in range(len(c)):
            for j in range(len(c[i])):
                for k in range(len(a[i])):
                    c[i][j] += a[i][k] * b[k][j]
        return c
    else:
        return -1
```



# 문제71 : 깊이 우선 탐색

**깊이 우선 탐색**이란 목표한 노드를 찾기 위해 가장 우선순위가 높은 노드의 자식으로 깊이 들어 갔다가 목표 노드가 존재하지 않으면 처음 방문한 노드와 연결된 다른 노드부터 그 자식 노드로 파고드는 검색 방법을 말합니다.

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F22aa2540-0fa0-4fc2-8953-4222bf62f824%2FUntitled.png?table=block&id=9cc69554-7c23-4c8e-a4ef-188e9d151b8a&width=480&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

다음과 같이 리스트 형태로 노드들의 연결 관계가 주어진다고 할 때 깊이 우선 탐색으로 이 노드들을 탐색했을 때의 순서를 공백으로 구분하여 출력하는 프로그램을 완성하세요.

1. **빨간색으로 Pass라고 되어 있는 부분을 완성**해주세요.

2. **깊이 우선 탐색을 오른쪽, 왼쪽 둘 다 구현**해보세요.

3. **리스트**로도 구현해보세요.

```python
**1. 데이터**

graph = {'E': set(['D', 'A']),
         'F': set(['D']),
         'A': set(['E', 'C', 'B']),
         'B': set(['A']),
         'C': set(['A']),
         'D': set(['E','F'])}

**2.** **출력
['E', 'A', 'B', 'C', 'D', 'F']

3. 코드**

graph = {
        'A': set(['B', 'C', 'E']),
        'B': set(['A']),
        'C': set(['A']),
        'D': set(['E', 'F']),
        'E': set(['A', 'D']),
        'F': set(['D'])
}

def dfs(graph, start):
    visited = []
    stack = [start]

    while stack:
        n = stack.pop()
        if n not in visited:
            visited.append(n)
            **pass**
    return visited

print(dfs(graph, 'E'))
```

# 답안

```python
graph = {
        'A': set(['B', 'C', 'E']),
        'B': set(['A']),
        'C': set(['A']),
        'D': set(['E', 'F']),
        'E': set(['A', 'D']),
        'F': set(['D'])
}

def dfs(graph, start):
    visited = []
    stack = [start]

    while stack:
        n = stack.pop()
        if n not in visited:
            visited.append(n)
            stack += graph[n] - set(visited)
    return visited

print(dfs(graph, 'E'))

#tree 풀이

tree = {
        'A': ['B', 'C', 'E'],
        'B': ['A'],
        'C': ['A'],
        'D': ['E', 'F'],
        'E': ['A', 'D'],
        'F': ['D']
}

def dfs(data, start):
    visited = []
    stack = [start]

    **pass**

    return visited

print(dfs(tree, 'E'))
```



# 문제72 : 너비 우선 탐색

**너비 우선 탐색**이란 어떤 노드를 방문하여 확인 한 후, 목표한 노드가 아니면 그 노드와 연결된 정점들 중에서 우선순위가 동일한 다른 노드를 찾고 그 순위에 없으면 그 다음 순위 노드를 차례대로 찾는 방법이다.

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fb11e9de9-66f6-4691-8a08-4b84497e4fa6%2FUntitled.png?table=block&id=7dec4b18-1ec1-4101-b13a-7d63be346b15&width=480&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

다음과 같이 입력이 주어질 때 **너비 우선 탐색을 한 순서대로 노드의 인덱스를 공백 구분으로 출력하는 프로그램을 완성해주세요.**

```python
**1. 데이터**

graph = {'E': set(['D', 'A']),
         'F': set(['D']),
         'A': set(['E', 'C', 'B']),
         'B': set(['A']),
         'C': set(['A']),
         'D': set(['E','F'])}

**2. 출력**

['E', 'D', 'A', 'F', 'C', 'B']

**3. 코드**

graph = {'E': set(['D', 'A']),
         'F': set(['D']),
         'A': set(['E', 'C', 'B']),
         'B': set(['A']),
         'C': set(['A']),
         'D': set(['E','F'])}

def bfs(graph, start):
    visited = []
    queue = [start]

    while queue:
        **pass**
        if n not in visited:
            visited.append(n)
            queue += graph[n] - set(visited)
    return visited

print(bfs(graph, 'E'))
```

# 답안

```python
graph = {
        'A': set(['B', 'C', 'E']),
        'B': set(['A']),
        'C': set(['A']),
        'D': set(['E', 'F']),
        'E': set(['A', 'D']),
        'F': set(['D'])
}

def bfs(graph, start):
    visited = []
    queue = [start]

    while queue:
        n = queue.pop(0)
        if n not in visited:
            visited.append(n)
            queue += graph[n] - set(visited)
    return visited

print(bfs(graph, 'E'))
```



# 문제73 : 최단 경로 찾기

다음과 같이 노드의 연결 관계가 그래프 형태로 주어집니다. 그 다음 경로를 구할 두 정점이 공백으로 구분되어 주어질 것입니다. 

두 정점 사이를 이동할 수 있는 최단거리를 출력하는 프로그램을 작성해 주세요. 

이 때 최단 거리란, 정점의 중복 없이 한 정점에서 다른 정점까지 갈 수 있는 가장 적은 간선의 수를 의미합니다.

```python
**데이터**
graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}

**입출력**

입력 : A F
출력 : 2
```

# 답안

```python
graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}

start, end = [i for i in input().split()]
    
queue = [start]
visited = [start]
    
def solution():
    count = -1

    while len(queue)!=0:
        count += 1
        size = len(queue)

        for i in range(size):
            node = queue.pop(0)
            if node == end:
                return count

            for next_node in graph[node]:
                if next_node not in visited:
                    visited.append(next_node)
                    queue.append(next_node)

print(solution())
```



# 문제74 : 최장 경로 찾기

첫 줄에는 다음과 같은 집합 자료형 형태로 노드의 연결 관계가 주어집니다. 
두번째 줄에는 경로를 구할 두 정점의 번호가 공백으로 구분되어 주어집니다. **이 두 정점으로 가기 위한 최대 거리**를 구하고자 합니다. 

최대 거리란, 정점의 중복 없이 한 정점에서 다른 정점까지 경유할 수 있는 가장 많은 간선의 수를 뜻합니다.

```python
**데이터**
graph = {1: [2, 3, 4],
				 2: [1, 3, 4, 5, 6],
				 3: [1, 2, 7],
				 4: [1, 2, 5, 6],
				 5: [2, 4, 6, 7],
				 6: [2, 4, 5, 7],
				 7: [3, 5, 6]}

**입력**
1 7

**출력**
6
```

# 답안

```python
graph = {1: [2, 3, 4],
				 2: [1, 3, 4, 5, 6],
				 3: [1, 2, 7],
				 4: [1, 2, 5, 6],
				 5: [2, 4, 6, 7],
				 6: [2, 4, 5, 7],
				 7: [3, 5, 6]} 

start, end = [int(i) for i in input().split()]
queue = [start]
visited = []

def sol(n, visited):
	if n[-1] == end:
		return len(visited)
	
	if n[-1] in visited:
		return len(visited)
	
	visited.append(n[-1])
	length = 0
	
	for next_node in graph[n[-1]]:
		n.append(next_node)
		length = max(length, sol(n, visited))
		queue.pop(-1)
	return length

print(sol(queue, visited))
```



# 문제75 : 이상한 369

369 게임을 하는데 조금 이상한 규칙이 있습니다. 3이나 6, 9 일 때만 박수를 쳐야합니다. 예를 들어 13, 16과 같이 3과 6, 9 만으로 된 숫자가 아닐 경우엔 박수를 치지 않습니다.
수현이는 박수를 몇 번 쳤는지 확인하고 싶습니다. 36일 때 박수를 쳤다면 박수를 친 횟수는 5번입니다.

n을 입력하면 박수를 몇 번 쳤는지 그 숫자를 출력해주세요.

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F9287d7e8-16a9-43a1-bf51-e7a585b884bc%2F_2019-10-07__2.01.50.png?table=block&id=d350057f-d079-470b-aa75-011847fd81c7&width=890&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

```python
**입력 - 문자로 입력받습니다.**
'93'

**출력**
10
```

| 숫자 | 횟수          | Name |
| ---- | ------------- | ---- |
| 3    | 1             | 1    |
| 6    | 1             | 2    |
| 9    | 1             | 3    |
| 33   | 1*3 + 1       | 4    |
| 36   | 1*3 + 2       | 5    |
| 39   | 1*3 + 3       | 6    |
| 63   | 2*3 + 1       | 7    |
| 66   | 2*3 + 2       | 8    |
| 69   | 2*3 + 3       | 9    |
| 93   | 3*3 + 1       | 10   |
| 96   | 3*3 + 2       | 11   |
| 99   | 3*3 + 3       | 12   |
| 333  | 1*9 + 1*3 + 1 | 13   |

# 답안

```python
def sol(n):
    n = list(str(n))
    answer = 0
    count = 1
    d = {3 : 1, 6 : 2, 9 : 3}
    
    while n:
        answer += d[int(n.pop())] * count
        count *= 3
        
    return answer
```



# 문제76 : 안전한 땅

전쟁이 끝난 후, A나라에서는 폐허가 된 도시를 재건하려고 합니다. 그런데 이 땅은 전쟁의 중심지였으므로 전쟁 중 매립된 지뢰가 아직도 많이 남아 있었습니다. 정부는 가장 먼저 지뢰를 제거하기 위해 수색반을 꾸렸습니다.

수색반은 가장 효율적인 지뢰 제거를 하고 싶습니다. 수색반은 도시를 격자 무늬로 나눠놓고 자신들이 수색할 수 있는 범위 내에 가장 많은 지뢰가 매립된 지역을 가장 먼저 작업하고 싶습니다.

가장 먼저 테스트 케이스의 수를 나타내는 1이상 100 이하의 자연수가 주어집니다.
각 테스트 케이스의 첫 줄에는 수색할 도시의 크기 a와 수색반이 한번에 수색 가능한 범위 b가 주어집니다. (a와 b 모두 정사각형의 가로 또는 세로를 나타냅니다. 예를들어 10이 주어지면 10x10칸의 크기를 나타냅니다.)

그 후 a줄에 걸쳐 도시 내 지뢰가 있는지의 여부가 나타납니다. 
0은 지뢰가 없음 1은 지뢰가 있음을 뜻합니다.

각 테스트 케이스에 대해 수색 가능한 범위 bxb 내에서 찾아낼 수 있는 가장 큰 지뢰의 갯수를 구하세요.

```python
**입력**
1
5 3
1 0 0 1 0
0 1 0 0 1
0 0 0 1 0
0 0 0 0 0
0 0 1 0 0

**출력**
3
```

# 답안

```python
import numpy as np

사각형 = 5
탐색가능지역 = 3

지뢰밭 = [[1, 0, 0, 1, 0],
          [0, 1, 0, 0, 1],
          [0, 0, 0, 1, 0],
          [0, 0, 0, 0, 0],
          [0, 0, 1, 0, 0]]

s = 0
for i in range(사각형 - 탐색가능지역 + 1):
    for j in range(탐색가능지역):
        if np.sum(지뢰밭[i:탐색가능지역+i, j:탐색가능지역+j]) > s: 
            s = np.sum(지뢰밭[i:탐색가능지역+i, j:탐색가능지역+j])
print(s)
```



# 문제77 : 가장 긴 공통 부분 문자열

**가장 긴 공통 부분 문자열(Longest Common Subsequence)**이란 A, B 두 문자열이 주어졌을 때
두 열에 공통으로 들어 있는 요소로 만들 수 있는 가장 긴 부분열을 말합니다.
여기서 부분열이란 다른 문자열에서 몇몇의 문자가 빠져 있어도 순서가 바뀌지 않은 열을 말합니다.

예를 들어 S1 = ['T', 'H', 'E', 'S', 'T', 'R', 'I', 'N', 'G', 'S']  S2 = ['T', 'H', 'I', 'S', 'I', 'S']라는 두 문자열이 있을 때
둘 사이의 부분 공통 문자열의 길이는 ['T', 'H', 'S', 'T', 'I', 'S'] 의 6개가 됩니다.

이처럼 **두 문자열이 주어지면 가장 긴 부분 공통 문자열의 길이를 반환하는 프로그램**을 만들어 주세요.

두 개의 문자열이 한 줄에 하나씩 주어집니다.
문자열은 알파벳 대문자로만 구성되며 그 길이는 100글자가 넘어가지 않습니다.

출력은 이 두 문자열의 가장 긴 부분 공통 문자열의 길이를 반환하면 됩니다.

```python
**- Test Case -**

**입력**
THISISSTRINGS
THISIS

**출력**
6

-

**입력**
THISISSTRINGS
TATHISISKKQQAEW

**출력**
6

-

**입력**
THISISSTRINGS
KIOTHIKESSISKKQQAEW

**출력**
3

-

**입력**
THISISSTRINGS
TKHKIKSIS

**출력**
3
```

# 답안

```python
def sol(strings):
    result = []
    for i in range(1,len(strings)+1):
        for j in range(i):
            result.append(strings[j:j+len(strings)-i+1])
    return result

input1 = input()
input2 = input()
#문자열 나열될 수 있는 모든 경우의수 만들기
list1 = set(sol(input1))
list2 = set(sol(input2))
#경우의 수 교집합
answers = list1.intersection(list2)
# 가장 긴 교집합
answer = max(answers,key=len)
print(len(answer))
```



# 문제78 : 원형테이블

기린은 중국집에서 친구들과 만나기로 하고, 음식을 시켰습니다.
음식이 나오고 한참을 기다렸지만 만나기로 한 친구 2명이 오지 않았어요.

기린은 배가 너무 고파 혼자 음식을 먹기 시작합니다. 원형테이블에는 N개의 음식들이 있습니다.
한개의 음식을 다 먹으면 그 음식의 시계방향으로 K번째 음식을 먹습니다.
하지만 아직 오지 않은 친구들을 위해 2개의 접시를 남겨야 합니다.

**마지막으로 남는 음식은 어떤 접시인가요?**

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fd6e00516-f674-46ab-a9e7-2c82f3d8d2b7%2FUntitled.png?table=block&id=5271f22c-b6ee-48d0-968f-329f027ca40b&width=960&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

```
입력은 2개의 정수로 이루어지며 공백으로 구분되어 입력됩니다.
첫번째 숫자가 음식의 개수 N, 두번째 숫자가 K입니다.
첫번째 가져가는 음식이 K이며 나머지는 첫번째 음식으로부터 시계방향으로 가져갑니다.

**입력**
6 3

****남은 음식들의 번호를 리스트 형태로 출력합니다.
**출력**
[3, 5]
```

# 답안

```python
a = input().split(' ')
n, k = a

def sol(n, k):
    i = 0
    #q에 n만큼의 숫자를 넣어준다
    q = [i for i in range(1,n+1)]

    while len(q) > 2:
        if i > len(q)-1:
        #순환하다 i가 q의 길이보다 클 경우에 len(q)만큼 빼준다.
        #[1,2,3,4,5,6] -> 1다음 4가 빠지고 그 다음은 4+3 = 7(index : 6)이 빠져야 하는데 
        #i(현재 빠져야 할 index)가 len(q)보다 크므로 len(q)즉, 4를 빼준다. 
        #이걸 마지막 2개가 남을 때 까지 반복함
            i -= len(q)
        q.pop(i)
        i += k
        i -= 1
    print(q)
sol(int(n),int(k))
```



# 문제79 : 순회하는 리스트

다음의 값이 주어졌을 때

```
l = [10, 20, 25, 27, 34, 35, 39]
```

n번 순회를 결정합니다. 예를 들어 2번 순회면

```
l = [35, 39, 10, 20, 25, 27, 34]
```

여기서 변하기 전 원소와 변한 후 원소의 값의 차가 가장 작은 값을 출력하는 프로그램을 작성하세요.

예를 들어 2번 순회했을 때 변하기 전의 리스트와 변한 후의 리스트의 값은 아래와 같습니다.

**순회전_리스트 = [10, 20, 25, 27, 34, 35, 39]
순회후_리스트 = [35, 39, 10, 20, 25, 27, 34]
리스트의_차 = [25, 19, 15, 7, 9, 8, 5]**

39와 변한 후의 34 값의 차가 5이므로 리스트의 차 중 최솟값 입니다.
따라서 39와 34의 인덱스인 6과 39와 34를 출력하는 프로그램을 만들어주세요.

```python
l = [10, 20, 25, 27, 34, 35, 39] #기존 입력 값
n = int(input('순회 횟수는 :'))

def rotate(inL, inN):
    
		<빈칸을 채워주세요>

rotate(l, n)
```

```python
**입력**
순회 횟수는 : 2

**출력**
index : 6
value : 39, 34
```

# 답안

```python
def sol(a, t):
    b = a.copy()
    c = []
    for i in range(t):
        b.insert(0,b.pop())
    for i,j in zip(a,b):
        c.append(abs(i-j))
    index = c.index(min(c))
    print("index :",index)
    print("value :",a[index],b[index])

sol(l,turn)
```



# 문제80 : 순열과 조합

**조합**이란 원소들을 조합하여 만들 수 있는 경우의 수이며 원소의 순서는 신경쓰지 않습니다.
**순열**이란 원소의 값이 같더라도 순서가 다르면 서로 다른 원소로 취급하는 선택법입니다.

한글의 자모 24자 중 자음은 총 14개 입니다.
이 중 입력받은 자음을 n개를 선택하여 나올 수 있는 모든 조합과, 조합의 수를 출력하고 싶습니다.

‘한글 맞춤법’의 제2장 제4항에서는 한글의 기본 자모 24자 “ㄱ(기역), ㄴ(니은), ㄷ(디귿), ㄹ(리을), ㅁ(미음), ㅂ(비읍), ㅅ(시옷), ㅇ(이응), ㅈ(지읒), ㅊ(치읓), ㅋ(키읔), ㅌ(티읕), ㅍ(피읖), ㅎ(히읗), ㅏ(아), ㅑ(야), ㅓ(어), ㅕ(여), ㅗ(오), ㅛ(요), ㅜ(우), ㅠ(유), ㅡ(으), ㅣ(이)”를 제시

나올 수 있는 모든 조합을 아래와 같이 출력해주세요.

**<--요구조건-->**

1. 첫 줄에 선택할 한글 자음이 주어집니다.
2. 두번째 줄에 조합의 수가 주어집니다.
3. 주어진 조합의 수에 따라 조합과 조합의 수를 출력해주세요.

```python
**입력**
ㄱ,ㄴ,ㄷ,ㄹ
3

**출력**
['ㄱㄴㄷ', 'ㄱㄴㄹ', 'ㄱㄷㄹ', 'ㄴㄷㄹ']
4
```

# 답안

```python
from itertools import permutations #이 문제에서는 안쓰지만 어떤 것인지 확인해보세요.
from itertools import combinations

import itertools

user_input = input().split(',')
user_input_int = int(input())

#print(list(itertools.combinations(a, 3)))

print(list(map(''.join, combinations(user_input, user_input_int))))
```



# 문제81 : 지뢰찾기

지뢰를 찾는 문제입니다. 다음 그림처럼 깃발 주위에는 지뢰가 사방으로 있습니다. **깃발의 위치를 입력받아 지뢰와 함께 출력해주는 프로그램**을 만드세요.

- 아래 Case 외 예외 사항은 고려하지 않습니다.
    (예를 들어 깃발이 붙어 있을 경우는 고려하지 않습니다.) 
    실력이 되시는 분들은 깃발이 붙어있을 상황까지 고려해주세요

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F63881d59-9470-4b5a-b1a3-dba088316623%2FUntitled.png?table=block&id=c6082b12-5580-4493-aa70-9766f39421a6&width=670&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

```python
**데이터**
flag = [] #지뢰 없이 깃발만 있는 리스트
minesweeper = [] #지뢰를 찾은 리스트
for i in range(5):
    flag.append(input('깃발 값과 함께 입력하세요 :').split(' '))

pass
print(flag)
print(minesweeper)

**입력**
0 1 0 0 0
0 0 0 0 0
0 0 0 1 0
0 0 1 0 0
0 0 0 0 0

**출력**
* f * 0 0
0 * 0 * 0
0 0 * f *
0 * f * 0
0 0 * 0 0
```

# 답안

```python
#첫번째 풀이
value ='''0 1 0 0 0
    0 0 0 0 0
    0 0 0 1 0
    0 0 1 0 0
    0 0 0 0 0'''
    print(value.split('\n'))
    sp = value.split('\n')
    count = 0
    for i in sp:
        sp[count] = i.replace('1', 'f').split(' ')
        count += 1
    print(sp)
    count = 0
    search = 0
    for s in sp:
        for i in s:
            if i == 'f':
                search = s.index(i)
                if search > 0:
                    s[search-1] = '*'
                if search < 4:
                    s[search+1] = '*'
                if count > 0:
                    sp[count-1][search] = '*'
                if count < 4:
                    sp[count+1][search] = '*'
        count += 1
    for i in sp:
        print(i)
#두번째 풀이
inputList = []
    for i in range(5):
        inputList.extend(input().split())
    for i in range(25):
        if inputList[i] == "1":
            inputList[i] = "f"
            if i // 5 != 0:
                inputList[i - 5] = "*"
            if i // 5 != 4:
                inputList[i + 5] = "*"
            if i % 5 != 0:
                inputList[i - 1] = "*"
            if i % 5 != 4:
                inputList[i + 1] = "*"
    for i in range(25):
        if i % 5 != 4:
            print(inputList[i], end = "")
        else:
            print(inputList[i], " ")
```



# 문제82 : 수학 괄호 파싱

수학공식이 제대로 입력이 되었는지 판단하는 코드를 작성하려 합니다. 괄호는 소괄호 밖에 없습니다.

**입출력 예시**

```python
데이터 입력(1), 프로그램 종료(2) : 1
데이터를 입력하세요: 3 + 5
True

데이터 입력(1), 프로그램 종료(2) : 1
데이터를 입력하세요: 5 + 7) * (3 * 5)
False
```

```python
def math(e):
    
		<코드를 작성해주세요>

while 1:
    order = input('데이터 입력(1), 프로그램 종료(2) :')
    if order == '1':
        ex = input('데이터를 입력하세요 :')
        print(math(ex))
    else:
        break
```

# 답안

```python
def sol():
    i = 0
    while i != 2:
        i = int(input("데이터 입력(1), 프로그램 종료(2) :"))
        if i == 2:
            break
        d = list(input("데이터를 입력하세요: "))
        step =0
        for i in d:
            if i =="(":
                step += 1
            elif i==")":
                step -=1

            if step !=0:
                return print(False)
        if step==0:
            return print(True)
sol()
```



# 문제83 : 수학 괄호 파싱 2

수학공식이 제대로 입력이 되었는지 판단하는 코드를 작성하려 합니다.
괄호는 소괄호와 중괄호가 있습니다.

**입출력 예시**

```python
데이터 입력(1), 프로그램 종료(2) : 1
데이터를 입력하세요: 5 + 7 * {(3 * 5)}
True
데이터 입력(1), 프로그램 종료(2) : 1
데이터를 입력하세요: 5 + 7){ * (3 * 5)
False
데이터 입력(1), 프로그램 종료(2) : 2
```

```python
def math(e):
    
		<코드를 작성해주세요>

while 1:
    order = input('데이터 입력(1), 프로그램 종료(2) :')
    if order == '1':
        ex = input('데이터를 입력하세요 :')
        print(math(ex))
    else:
        break
```

# 답안

```python
def math(e):
    m = {
        ')':'(',
        '}':'{',
    }
    stack = []
    for i in e:
        if i in '({':
            stack.append(i)
        elif i in m:
            if len(stack) == 0:
                return False
            else:
                t = m[i]
                if t != stack.pop():
                    return False
    return len(stack) == 0

while 1:
    order = input('데이터 입력(1), 프로그램 종료(2) :')
    if order == '1':
        ex = input('데이터를 입력하세요 :')
        print(math(ex))
    else:
        break
```



# 문제84 : 숫자뽑기

소정이는 어떤 숫자에서 k개의 수를 뽑았을 때 가장 큰 수를 찾는 놀이를 하고 있습니다. 
예를 들어, 숫자 1723에서 두개의 수를 뽑으면 [17,12,13,72,73,23] 을 만들 수 있습니다.
이 중 가장 큰 수는 73입니다.

위 예시처럼 어떤 수 n개에서 k개의 수를 선택하여 만들 수 있는 수 중에서 가장 큰 수를 찾아 주세요.

# 답안

```python
from itertools import permutations

user_input = input()
k = int(input())
l = [i for i in user_input]

print(max(list(map(''.join, permutations(l, k)))))
```



# 문제85 : 숫자 놀이

일정한 규칙을 가지고있는 숫자를 나열하는 놀이를 하는 중입니다.
이전 숫자에서 각 숫자의 갯수를 나타내어 숫자로 만들고 다시 그 숫자를 같은 규칙으로 만들며 나열 합니다.
이 놀이는 1부터 시작합니다.
다음수는 1이 1개 이기때문에 '11'이 되고
 '11'에서 1이 2개이기때문에 그 다음은 '12'가 됩니다.

즉,

1. 1  → (1)
2. 11 → (1이 1개)
3. 12 → (1이 2개)
4. 1121 → (1이 1개 2가 1개)
5. 1321 → (1이 3개 2가 1개)
6. 122131 → (1이 2개 2가 1개 3이 1개)
7. 132231 → (1이 3개 2가 2개 3이 1개)

위와 같이 진행되는 규칙을 통해
진행횟수 N을 입력받으면 해당되는 수를 출력하세요.

```python
**입력**

**출력**
122131
```

# 답안

```python
def solution(n):
    answer='1'
    if n == 1:
        return answer
    for i in range(1,n):
        answer = rule(answer)
    return answer
def rule(n):
    num_l = max([int(i) for i in n])
    d = [str(i)+str(str(n).count(str(i))) for i in range(1,num_l+1)]
    return ''.join(d)
```



# 문제86 : 회전 초밥

쉔은 회전초밥집에 갔습니다.
초밥집에 간 쉔은 각 초밥에 점수를 매기고 낮은 점수의 순서로 초밥을 먹으려 합니다.
이때 n위치에 놓여진 초밥을 쉔은 접시가 몇 번 지나가고 나서 먹을지 출력하세요.

1. 초밥은 놓여진 위치에서 옮겨지지 않습니다.
2. 지나간 초밥은 나머지 초밥이 지나간 후에 다시 돌아옵니다.
3. 초밥은 1개 이상 존재합니다.

예:
A, B, C, D, E 초밥이 있고 각 점수가 1, 1, 3, 2, 5 일 때 3번째(C초밥)을 먹게 되는 순서는
1인 초밥 A와 B를 먹고 다음 2인 D 초밥을 먹어야 됩니다.
A B C D E 의 순서로 접시가 도착하지만 C가 도착했을때 먹지 못하는 상황이 옵니다.
2점을 주었던 D를 먼저 먹어야 C를 먹을 수 있습니다. 
즉, A B C D E **C** , 접시가 5번 지나가고 먹게 된다.

```python
**입력**
point = [1,1,3,2,5]
dish = 3

**출력**
5

**입력**
point = [5,2,3,1,2,5]
dish = 1

**출력**
10

point 각 접시별 점수가 들어있는 배열
dish 먹고자하는 접시의 위치
```

# 답안

```python
# point 각 접시별 점수가 들어있는 배열
# dish 먹고자하는 접시의 위치
def solution(point, dish):
#배열 순서는 0부터 시작, 입력은 1부터시작이기 때문에 -1 해준다.
    dish -=1
    answer = 0
#오름차순으로 정렬
    s = sorted(point)
    while True:
# point 제일 앞의 점수를 추출하여  p에 넣어 놓는다. 즉, 앞에 도착한 접시의 점수!
# pop과 append를 활용해 회전하도록 구현할 예정 !
        p = point.pop(0)

        #현재 s[0]은 point 배열을 에서 가장 작은 값을 가지고 있음!
        #현재 가장 낮은 점수를 가지고 있는 접시가 앞에 도착했다면 먹도록 할것!
        if s[0]==p:
        #앞에 도착한 접시가 선택한 접시라면 먹고 반복문 종료
            if dish == 0:
                break
            #선택한 접시 움직임.          
            dish-=1
            #한 접시를 먹었음으로 하나 줄어듬
            s.pop(0)
        else:
            #접시위 초밥을 먹을 수 있는 조건이 충족되지 않아 그대로 둔다
            # pop했던것을 다시 append.
            point.append(p)
            #접시의 움직임 만약 선택한 접시가 앞에 도착했다면 맨뒤로 보내고,
            #그렇지 않다면 한칸 당긴다.
            dish = len(point)-1 if dish==0 else dish-1
            # 반복 한번당 접시 한번 지나감을 나타냄.
        answer+=1
    return answer

#한글 변수 풀이
def solution(접시점수, 먹을접시위치):
    먹을접시위치 -= 1
    정답 = 0
    정렬된접시점수 = sorted(접시점수)
    while True:
        맨앞접시 = 접시점수.pop(0)
        if 정렬된접시점수[0] == 맨앞접시:
            if 먹을접시위치 == 0:
                break
            먹을접시위치 -= 1
            정렬된접시점수.pop(0)
        else:
            접시점수.append(맨앞접시)
            먹을접시위치 = len(접시점수) - 1 if 먹을접시위치 == 0 else 먹을접시위치 - 1
        정답 += 1
    return 정답
print(solution(접시점수, 먹을접시위치))
```



# 문제87 : 천하 제일 먹기 대회

천하 제일 먹기 대회가 개최되었습니다.
이 대회는 정해진 시간이 끝난 후 음식을 먹은 그릇 개수를 파악한 후 각 선수들의 등수를 매깁니다. 

1. 같은 이름의 선수는 없습니다.
2. 접시의 수가 같은 경우는 없습니다.

**입력 예1)**

```python
손오공 야모챠 메지터 비콜로
70 10 55 40
```

**출력 예1)**

```python
{'손오공': 1, '메지터': 2, '비콜로': 3, '야모챠': 4}
```

**입력 예2)**

```python
["홍길동","엄석대","연개소문","김첨지"]
[2, 1, 10, 0]
```

**출력 예2)**

```python
{'연개소문': 1, '홍길동': 2, '엄석대': 3, '김첨지': 4}
```

# 답안

```python
name = 'A C B D'.split(' ')
point = list(map(int, '70 10 55 40'.split(' ')))

def hojun(x): #이름과 기능을 바꿔서 적용해보세요.
    return x[1]

def sol(name, point):
    d = {}
    z = [[i, j] for i, j in zip(name, point)]
    z = sorted(z, key=hojun, reverse=True)
    
    for i in range(len(z)):
        d[z[i][0]] = i+1
    return d

print(sol(name, point))

#아래 코드를 실행해보세요.
test = 'AA CCCC BBB D'.split(' ')
sorted(test, key=len)
```



# 문제88 : 지식이의 게임개발

지식이는 게임을 만드는 것을 좋아합니다. 하지만 매번 다른 크기의 지도와 장애물을 배치하는데 불편함을 겪고있습니다. 이런 불편함을 해결하기 위해 **지도의 크기와 장애물의 위치, 캐릭터의 위치만 입력하면 게임 지형을 완성해주는 프로그램**을 만들고 싶습니다.  지식이를 위해 게임 지형을 만드는 프로그램을 작성해 주세요

가로:n /세로:m 크기가 주어집니다.
지형의 테두리는 벽으로 이루어져 있습니다.
캐릭터가 있는 좌표가 배열형태로 주어집니다.
장애물이 있는 좌표가 2차원 배열 형태로 주어집니다.
지도는 n x m 크기의 배열이며 배열안의 값은
   -움직일수 있는 공간(0)
   -캐릭터(1)
   -벽(2)
3개로 구분되어 있습니다.

입출력 예시)

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F6eceba36-56af-476e-97bc-7dff8b481979%2FUntitled.png?table=block&id=d624bec2-9ee5-4415-995e-60c15eac21ae&width=670&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

# 답안

```python
def make_map(n,m,char,obj):
    #지도 초기화하기
		#각 지도 가로/세로 두칸 외벽을 포함한 크기만큼 추가하기(각 끝 한칸씩)
    world_map = [[0]*(n+2) for i in range(m+2)]
    #지도 외벽 그리기
    for i in range(len(world_map)):
        for j in range(len(world_map[0])):
            if i==0 or j==len(world_map[0])-1 or j==0 or i ==len(world_map)-1:
                world_map[i][j]=2
#     print(wordl_map)
    #지도에 캐릭터 추가하기/ 외벽으로 인해 좌표에 +1을 해줍니다.
    world_map[char[0]+1][char[1]+1] = 1
    #지도에 장애물 추가하기
    for i in obj:
#         print(i)
        #장애물을 추가하려는 자리에 캐릭터가 있을 시 캐릭터는 그대로둔다
				# 마찬가지 외벽으로 인한 좌표 조정을 해준다.
        world_map[i[0]+1][i[1]+1] = 2 if world_map[i[0]+1][i[1]+1] != 1 else 1
    for i in world_map:
        print(i)
```



# 문제89 : 지식이의 게임개발2

(연계형 문제 - 88번을 먼저 풀고오셔야해요!)
제코베의 도움을 받아 성공적으로 지도를 만들어낸 지식이는 캐릭터의 움직임을 구현했습니다. 
하지만 지도위의 캐릭터위치를 나타내는데 문제가 발생했습니다.
지식이는 지도위에서 캐릭터의 위치를 나타내기위해 다시한번 제코베에 도움을 요청합니다.

지도위에서 캐릭터의 위치를 나타내주세요

1. 지도는 88번 문제의 해답을 사용해주세요
2. 입력값은 지도,캐릭터의 움직임입니다.
3. 캐릭터의 움직임은 {상:1,하:2,좌:3,우:4} 로 정수로 이루어진 배열이 들어갑니다.
4. 벽과 장애물은 통과할 수 없습니다. 
5. 마지막 캐릭터의 위치를 반영한 지도를 보여주고 위치를 반환하는함수를 작성해주세요.

입출력 예시-

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F27c4d5da-d065-4c5f-a0bf-ddbfed658a09%2FUntitled.png?table=block&id=c94fddb1-5154-491e-9c3b-1db1be4bda08&width=770&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

# 답안

```python
def move(world_map, moving):
    x,y = 0,0
    for i,m in enumerate(world_map):
        if 1 in m:
            x,y = m.index(1),i
    world_map[y][x] = 0
    for i in moving:
        if i==1 and world_map[y-1][x]!=2:
            y-=1
            
        elif i==2 and world_map[y+1][x]!=2:
            y+=1
            
        elif i==3 and world_map[y][x-1]!=2:
            x-=1
            
        elif i==4 and world_map[y][x+1]!=2:
            x+=1
    world_map[y][x] = 1
    for i in world_map:
        print(i)
    return [x,y]
```



# 문제90 : 같은 의약성분을 찾아라!

의약품 성분이 총 8개인 약품들이 있습니다. 예를들어 다음 데이터는 총 8개의 성분을 갖습니다.

판콜비 = 'ABCDEFGH'
넥타이레놀 = 'EFGHIJKL'

특정 약품 A의 성분이 공개되었을 때, 이와 유사한 성분을 가진 데이터들의 출력을 구하는 문제입니다.

입력 : 'ABCDEFGH' 4
데이터 : 'EFGHIJKL', 'EFGHIJKM', 'EFGHIJKZ' 등 1만개의 데이터
출력 : 'EFGHIJKL', 'EFGHIJKM', 'EFGHIJKZ' 등 4개의 요소가 같은 약품 전부(4개 이상이 아니며 같은 요소가 4개인 것을 출력해야 합니다.)

* 해당 문제는 시간 제한이 있습니다.
* 제약 데이터의 성분은 중복이 될 수 없습니다.
    (예를 들어 'AAABBBAB'와 같은 데이터는 없습니다.)

```python
import random as r

l = [chr(i) for i in range(65, 91)]
# print(l)
total_medicine = []
medicine = []

# 이해를 돕기 위한 예제
# for i in range(8):
#     medicine.append(r.choice(l))

for i in range(100):
    total_medicine.append(r.sample(l, 8))

#print(total_medicine)

pass
```

# 답안

```python
import random as r

l = [chr(i) for i in range(65, 91)]

total_medicine = []
medicine = []

for i in range(100):
    total_medicine.append(r.sample(l, 8))

user_input = input().split(' ')
result = []

for i in total_medicine:
    if len(set(i) & set(user_input[0])) == int(user_input[1]):
        result.append(i)

print(len(result))
```



# 문제91 : 반평균 등수

한 반에 30명인 학생, 총 7개의 반 점수가 '국어, 영어, 수학, 사회, 과학' 순서로 있는 다중 리스트를 랜덤한 값으로 만들어주시고 아래 값을 모두 출력하세요.

1. 반 점수 모두가 담긴 전교 점수 다중 리스트를 만들어주세요.
2. 반 평균을 구하세요.
3. 반 1등 점수를 구하세요.
4. 전교 평균을 구하세요.

(출력 형식은 상관 없습니다.)

- numpy를 사용해서도 풀어보세요.

```
#아래 코드는 힌트입니다.
import random  as r

score = []
class_score = []
total_score = []

for i in range(5):
    score.append(r.randint(1, 100))

print(score)
```

# 답안

```python
import random as r

total_score = []
class_score = []
student_score = []

for i in range(7):
    class_score = []
    for i in range(30):
        student_score = []
        for i in range(5):
            student_score.append(r.randint(40, 100))
        class_score.append(student_score)
    total_score.append(class_score)
    
total_average = 0
c_average = []
s_average = 0
# print(sum(total_score)) #Error

for c in total_score:
    for s in c:
        s_average += sum(s)/5
    c_average.append(s_average // 30)
    s_average = 0

print(c_average)
print(sum(c_average)//len(c_average))
```



# 문제92 : 키보드 고장

P회사 회계를 처리하던 은정은 커피를 마시다가 키보드에 커피를 쏟고 말았습니다.
휴지로 닦고 말려보았지만 숫자 3, 4, 6이 도통 눌리지 않습니다.
10분 뒤, 모든 직원들에게 월급을 입금해주어야 합니다.
여유 키보드는 없으며, 프로그래밍을 매우 잘하고, 모든 작업을 수작업(?)으로 하고 있습니다.

이에 눌리지 않는 키보드를 누르지 않고 월급 입금을 두 번에 나눠주고 싶습니다.

1. 직원은 2000명이며, 3초 이내 수행을 해야합니다.
2. 입력값의 형식은 csv파일이며 이과장 '3,000,000', 'S은행', '100-0000-0000-000' 형식으로 주어집니다.
3. 출력값의 형식은 csv 파일이며 이과장 '1,500,000', '1,500,000', 'S은행', '100-0000-0000-000' 입니다. 또는 '1,000,000', '2,000,000', 'S은행', '100-0000-0000-000' 도 괜찮습니다.
4. 라이브러리 사용할 수 있습니다.

```python
# 답안

​```python
import csv

f = open('test.csv', 'r', encoding='utf-8')
r = csv.reader(f)
for line in r:
    s1, s2 = '', ''
    for i in line[1].replace(',', ''):
        if i == '3':
            s1 += '1'
            s2 += '2'
        elif i == '4':
            s1 += '2'
            s2 += '2'
        elif i == '6':
            s1 += '1'
            s2 += '5'
        else:
            s1 += i
            s2 += '0'
    print(int(s1), int(s2))
​```

​```
이과장,"333,356,766","S은행",'100-0000-0000-000'
이과장,"5,000,000","S은행",'100-0000-0000-000'
이과장,"3,200,000","S은행",'100-0000-0000-000'
이과장,"3,300,000","S은행",'100-0000-0000-000'
이과장,"5,300,000","S은행",'100-0000-0000-000'
​```def sol(d):
    pass

sol(data)
```



# 문제93 : 페이지 교체 - 선입선출 알고리즘

페이지 교체 알고리즘은 메모리를 관리하는 운영체제에서, 페이지 부재가 발생하여 새로운 페이지를 할당하기 위해 현재 **할당된 페이지 중 어느 것을 교체할지를 결정하는 방법**입니다.
이 알고리즘이 사용되는 시기는 페이지 부재(Page Fault)가 발생해 새로운 페이지를 적재해야 하지만 페이지를 적재할 공간이 없어 이미 적재되어 있는 페이지 중 교체할 페이지를 정할 때 사용됩니다. 빈 페이지가 없는 상황에서 메모리에 적재된 페이지와 적재할 페이지를 교체함으로 페이지 부재 문제를 해결할 수 있습니다.
[(wikipedia)](https://ko.wikipedia.org/wiki/%ED%8E%98%EC%9D%B4%EC%A7%80_%EA%B5%90%EC%B2%B4_%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98)

이 중 선입선출(FIFO) 알고리즘은 가장 먼저 들어와서 가장 오래있었던 페이지를 우선으로 교체시키는 방법을 의미합니다. 아래의 그림을 참고해주세요.

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fc9b05c8b-8159-4cb5-b75a-4f58dea8d5a9%2F_2019-10-23__11.02.04.png?table=block&id=e09c0095-3416-4ff1-8654-b07548e32ba2&width=770&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

메모리의 크기가 i로 주어지고 들어올 페이지들이 n으로 주어졌을 때, 전체 실행시간을 구해주세요.

만약 스택 안에 같은 스케줄이 있다면 **hit** 이라고 하며 실행시간은 **1초** 입니다. 스택 안에 스케줄이 없다면 **miss** 라고 하며 실행시간은 **6초** 입니다.

| 페이지                                                       | 페이지 프레임 | 실행시간 |
| :----------------------------------------------------------- | :------------ | :------- |
| [BCBAEBCE](페이지 9d9f9fdcc64d4214b32cbdc7fad5b0ff/BCBAEBCE 570738b058594d83b10e331c84bde25a.html) | 3             | 38       |
| [ABCABCABC](페이지 9d9f9fdcc64d4214b32cbdc7fad5b0ff/ABCABCABC 2bd89e563a0449eb8beadb83a590e7b3.html) | 3             | 24       |
| [ABCDABEABCDE](페이지 9d9f9fdcc64d4214b32cbdc7fad5b0ff/ABCDABEABCDE cda7e1debc3a4556ac766fffd4caed06.html) | 4             | 62       |
| [ABCEDF](페이지 9d9f9fdcc64d4214b32cbdc7fad5b0ff/ABCEDF 13da9b1c8f78436398161e93fbe5ce6d.html) | 0             | 36       |
| [ABCDABEA](페이지 9d9f9fdcc64d4214b32cbdc7fad5b0ff/ABCDABEA fa235de7dc4141aaa69f29b188da96d0.html) | 3             | 43       |

- 예제 1번을 보면 페이지 프레임의 개수는 3개이고 스케줄은 'BCBAEBCE' 입니다. 6번의 miss를 기록하므로 **6번 * 6초 = 36초**가 되고  2번의 hit을 기록하므로 **2번 * 1초 = 2초**입니다. 2개를 합한 값이 실행시간이므로, 38초가 됩니다.

# 답안

```python
def solution(frame, page):
    page = page.split(' ')
    runTime = 0
    temp = []

    # frame이 0일때, page의 크기만큼 6을 곱해주고 끝낸다
    if frame == 0:
        runTime = len(page) * 6
        return runTime

    
    for i in page:
        if i in temp:
            runTime += 1
        else:
						# 배열이 비었으면 무조건 넣어야 하므로 if문을 사용
            if len(temp) < frame:
                temp.append(i)
            else:
								# 가장 사용되지 않은 첫번째 배열을 제거하고 맨 뒤에 입력값을 저장
                temp = temp[1:] + [i]
            # if문 실행에 상관없이 runTime은 10이 추가된다
            runTime += 6
    
    return runTime

f = int(input())
page = list(map(str,input()))

print(solution(f, page))
```



# 문제94 : 페이지 교체 - LRU 알고리즘

LRU 알고리즘이란 페이지 교체 알고리즘으로써, Least Resently Used의 약자입니다. 즉 페이지 부재가 발생했을 경우 가장 오랫동안 사용되지 않은 페이지를 제거하는 알고리즘입니다.
이 알고리즘의 기본 가설은 가장 오랫동안 이용되지 않은 페이지는 앞으로도 사용할 확률이 적다는 가정하에 페이지 교체가 진행됩니다.
다음 그림을 참고해주세요.

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F422ab369-3222-4587-b739-a43b0e421225%2F_2019-10-23__11.02.10.png?table=block&id=9ffc7fb6-2318-4f76-b26b-5bae4338b30b&width=860&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

메모리의 크기가 i로 주어지고 들어올 페이지들이 n으로 주어졌을 때, 전체 실행시간을 구해주세요.

만약 스택 안에 같은 스케줄이 있다면 **hit** 이라고 하며 실행시간은 **1초** 입니다. 스택 안에 스케줄이 없다면 **miss** 라고 하며 실행시간은 **6초** 입니다.

| 페이지                                                       | 페이지 프레임 | 실행시간 |
| :----------------------------------------------------------- | :------------ | :------- |
| [BCBAEBCE](페이지 1a980f9b6fa24733aa321577cd5727fa/BCBAEBCE ffe35e9b64284764881411fd6a21ac97.html) | 3             | 33       |
| [ABCABCABC](페이지 1a980f9b6fa24733aa321577cd5727fa/ABCABCABC 87977c4cc2f745d295723faaedda1e8a.html) | 3             | 24       |
| [ABCEDF](페이지 1a980f9b6fa24733aa321577cd5727fa/ABCEDF f86b47f8011b4e5089f348df49f29610.html) | 0             | 36       |

- 예제 1번을 보면 페이지 프레임의 개수는 3개이고 스케줄은 'BCBAEBCE' 입니다. 5번의 miss를 기록하므로 **5번 * 6초 = 30초**가 되고  3번의 hit을 기록하므로 **3번 * 1초 = 3초**입니다. 2개를 합한 값이 실행시간이므로, 33초가 됩니다.

# 답안

```python
def sol(frame, page):
    temp = []
    runTime = 0

    if frame == 0:
        runTime = len(page) * 6
        return runTime
    # cacheSize가 0일때, cities의 크기만큼 10을 곱해주고 끝낸다

    for i in page:
        if i in temp:
					  temp.append(temp.pop(0))
            runTime += 1
        else:
            if len(temp) < frame:
                temp.append(i)
                # temp가 비었으면 무조건 넣어야 하므로 if문을 사용함
            else:
                temp = temp[1:] + [i]
                # 가장 사용되지 않은 첫번째 배열을 제거하고 맨 뒤에 입력값을 저장해준다
            runTime += 6
            # if문 실행에 상관없이 runTime은 10이 추가된다
    return runTime
```



# 문제95 : 도장찍기

빈 종이에 stamp 모양으로 생긴 도장을 90*k 도로 회전하며 찍습니다.
도장은 N*N 크기이며 각 도장이 찍히는 부분은 1이상의 자연수와 도장이 찍히지 않는 0으로 이루어져 있습니다.

도장의 크기 N과,
종이에 찍힌 도장 횟수를 표현한 stmp배열과,
얼만큼 회전할 것인지를 알려주는 회전수 k를 입력받았을 때
각 위치에서 몇 번 도장이 찍혔는지 그 결과값을 출력하세요

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F1e83c10e-dd12-4142-bed5-511d0439ebf4%2F_2019-10-30__2.13.33.png?table=block&id=7e558636-14db-4df2-a4e2-a5e1900158f8&width=1420&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F5bea018e-303f-4f96-83e5-fb44e989ecf8%2F_2019-10-30__2.13.36.png?table=block&id=46edddaf-c78c-4507-a683-7a5889ea5651&width=1380&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

```python
## 입력 예시)

도장 = [
[1,1,1,2],
[2,0,0,0],
[1,1,1,1],
[0,0,0,0]
]

회전 = 1
print(solution(도장,회전))

###출력
[[1, 2, 3, 3], [2, 1, 0, 1], [1, 2, 1, 2], [0, 1, 0, 2]]
```

# 답안

```python
# 기본 입력부분입니다 
# N, stmp, k를 입력받습니다.

N = int(input())
stmp = []
for i in range(N):
    stmp.append(list(map(int,input().split(' '))))
k = int(input())

def solution(stmp,n):
    N = len(stmp)
    # 0으로 만들어진 배열 생성 
    # [[0]*N]*N으로 하면 안됨!!!!
    p = [[0] * N for _ in range(N)]
    
    # 회전시키기 전 최초 1번찍어주기
    p = sum_matrix(p,stmp)
    #회전시키며 도장찍기
    for i in range(n):
        stmp = rotate(stmp)
        p=sum_matrix(p,stmp)
    return p

#배열(도장) 회전시키기
def rotate(stmp):
    N = len(stmp)
    rot = [[0] * N for _ in range(N)]
    
    for i in range(N):
        for j in range(N):
            rot[j][N-1-i] = stmp[i][j]
    return rot

#행렬 더하기 즉 도장이 찍히는 정도를 더한다.
def sum_matrix(p,stmp):
    for i in range(len(p)):
        for j in range(len(p[0])):
            p[i][j] = p[i][j]+stmp[i][j]
    return p

print(solution(stmp,k))
```



# 문제96 : 넓은 텃밭 만들기!

수연이는 밭 농사를 시작하기로 마음을 먹었다. 집 앞 텃밭을 만들기로 하고 돌들을 제거하고 있는데 매우 큰 바위는 옮기지 못해 고심하고 있다.

이에 수연이는 다음과 같은 규칙을 정한다.

1. 바위를(바위는 '1'로 표기한다.) 피해 텃밭을 만들되 정사각형 모양으로 텃밭을 만든다.
2. 텃밭은 가장 넓은 텃밭 1개만 만들고 그 크기를 반환한다.
3. 만든 텃밭은 모두 '#'으로 처리한다.

```python
<입출력 예시>

**입력**

0 0 0 0 0
0 1 0 0 0
0 1 0 0 0
0 0 1 0 0
0 0 0 1 0

**출력**

3 X 3

0 0 # # #
0 1 # # #
0 1 # # #
0 0 1 0 0
0 0 0 1 0

**입력**

0 0 0 1 0
0 0 0 0 0
0 0 1 0 0
0 0 1 0 0
0 0 0 1 0

**출력**

2 X 2

# # 0 1 0
# # 0 0 0
1 0 1 0 0
0 0 1 0 0
1 0 0 1 0

########## 문제 ###########
텃밭 = [] #입력받은 텃밭 리스트
가꾼텃밭 = [] #텃밭을 가꾼 후 저장된 리스트
for i in range(5):
    텃밭.append(input('텃밭을 입력하세요 :').split(' '))

<코드를 작성해주세요>

print(가꾼텃밭)
```

# 답안

```python
텃밭 = [[0, 0, 0, 0, 0],
        [0, 1, 0, 0, 0],
        [0, 1, 0, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 0, 0, 1, 0]]

#역전된 상태의 텃밭
# 텃밭 = [[1, 1, 1, 1, 1],
#         [1, 0, 1, 1, 1],
#         [1, 0, 1, 1, 1],
#         [1, 1, 0, 1, 1],
#         [1, 1, 1, 0, 1]]

#역전된 상태의 텃밭의 합
# 텃밭 = [[1, 1, 1, 1, 1],
#         [1, 0, 1, 2, 2],
#         [1, 0, 1, 2, 3],
#         [1, 1, 0, 1, 2],
#         [1, 2, 1, 0, 1]]

def solution(텃밭):
    넓이 = len(텃밭[0])
    높이 = len(텃밭)
    텃밭합 = [[0] * 넓이 for i in range(len(텃밭))]
    for i in range(0, 높이):
        for j in range(0, 넓이):
            if 텃밭[i][j] == 0:
                텃밭합[i][j] = 1
            else:
                텃밭합[i][j] = 0
    
    for i in range(1, 높이):
        for j in range(1, 넓이):
            if 텃밭합[i][j] == 1:
                텃밭합[i][j] = min(텃밭합[i-1][j-1], min(텃밭합[i-1][j], 텃밭합[i][j-1])) + 1

    maxValue = 0
    x = 0
    y = 0
    for i in range(0, 높이):
        for j in range(0, 넓이):
            if maxValue < 텃밭합[i][j]:
                maxValue = 텃밭합[i][j]
                x = i
                y = j
                
    print(maxValue, x, y)
    print(maxValue, 'X', maxValue)
    
    for i in range(x - (maxValue - 1), x + 1):
        for j in range(y - (maxValue - 1), y + 1):
            텃밭[i][j] = '#'

    return 텃밭
    
solution(텃밭)
```



# 문제97 : 택배배달

n명의 택배 배달원은 쌓인 택배를 배달해야 합니다.
각 택배는 접수된 순서로 배달이 되며 택배 마다 거리가 주어집니다. 
거리1당 1의 시간이 걸린다고 가정하였을 때 모든 택배가 배달 완료될 시간을 구하세요.

1. 모든 택배의 배송 시간 1 이상이며 배달지에 도착하고 돌아오는 왕복시간입니다.
2. 택배는 물류창고에서 출발합니다.
3. 배달을 완료하면 다시 물류창고로 돌아가 택배를 받습니다.
4. 물류창고로 돌아가 택배를 받으면 배달을 시작합니다.
5. 택배를 상차 할 때 시간은 걸리지 않습니다.

입력은 배달원의 수와 택배를 배달하는 배달 시간이 주어집니다.

ex) 배달원이 3명이고 각 거리가 [1,2,1,3,3,3]인 순서로 들어오는 경우

```python
def solution(n,l):
	<코드 작성>

배달원 = 3
배달시간 = [1,2,1,3,3,3]

print(solution(배달원,배달시간))
# 출력값 = 5
```

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F59202204-06ad-4f4b-a4cb-f4e7381ad22f%2F_2019-11-27__11.37.52.png?table=block&id=f9de8581-519c-4ab4-affe-cd281adb8ce1&width=2740&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

# 답안

```python
def sol(n,l):
# n:택배원 수, l:택배들
    answer = 0
		#택배원 수 만큼의 배열 생성
    man = [0]*n
    #모든 택배가 상차 되었을 경우 종료
    while sum(l)!=0:
				#택배원 수 만큼 반복
        for j in range(len(man)):
						# 택배원이 배달하고있는 택배의 잔여거리가 0인경우(배송완료인경우) 택배상차
            if man[j] == 0 and l:
                man[j]+=l.pop(0)
				#택배원들 배송거리 -1 처리
        man = list(map(lambda x : x-1,man))
				# 1회 반복단 1의 시간증가
        answer+=1
		# 남은 택배 잔여거리중 가장 많은 시간이 남은 택배를 더해줌
    answer+=max(man)
    return answer

-동영상 강좌 풀이 Code-

def solution(택배원의수, 택배거리):
    time = 0
    택배원택배거리 = [0] * 택배원의수
    while 택배거리:
        for i in range(택배원의수):
            if 택배원택배거리[i] == 0 and 택배거리:
                택배원택배거리[i] = 택배거리.pop(0)
        택배원택배거리 = list(map(lambda x: x-1, 택배원택배거리))
        time += 1
        print('------------')
        print(택배원택배거리, time)
    print('-----end while------')
    print(택배원택배거리, time)
    time += max(택배원택배거리)
    return time

배달원 = 3
택배 = [1,2,1,3,3,3]
택배원택배거리 = [0, 0, 0]

print(solution(배달원,택배))
```



# 문제98 : 청길이의 패션 대회

패션의 선도주자 청길이는 패션의 발전을 위해 패션쇼를 방문해 유니크한 아이템을 조사하기로 하였습니다.
청길이는 입장하는 사람들의 패션에서 처음 보는 아이템 만을 기록합니다. 이때 청길이의 기록에서 아래 규칙에 맞게 배열로 출력해주세요.

    1. 청길이는 각 옷의 종류를 정수로 기록해 놓습니다.
         ex)입력은  "1번: 3,1 2번: 4 3번: 2,1,3 4번: 2,1,3,4" 형태의 문자열 입니다.
    2. 기록은 청길이가 번호 순서로 유니크한 옷의 번호를 적습니다.
    3. 유니크한 옷은 기록된 순서로 추출되고 출력됩니다.
         ex)출력은 [3,1,4,2] 입니다.

입출력 예시)

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F11be57fc-c7e9-4903-805f-ca6a4a6f8540%2FUntitled.png?table=block&id=0398cf1f-4440-4ed0-9635-ca0ab867bf77&width=1290&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

# 정답

```python
import re

def solution(i):
	#먼저 번호로 자릅니다.
	idx = re.split("[0-9]번: ",i)
	#잘라낸 문자열에 맨 앞이 "", 공백문자열이들어간 배열을 없애줍니다 
	idx = idx[1:]
	for i in range(len(idx)):
			#띄어쓰기를 없애주고 , 단위로 잘라줘요
	    idx[i] = idx[i].replace(" ","").split(",")
	    for j in range(len(idx[i])):
	        idx[i][j] = int(idx[i][j])
	answer = []
	for i in idx:
	    for j in i:
	        if j in answer:
	            pass
	        else:
	            answer.append(j)
	return answer

i = "1번: 3,1 2번: 4 3번: 2,1,3 4번: 2,1,3,4"
solution(i)

- 동영상 강좌 풀이 Code - 
import re

def solution(s):
    answer = []
    l = re.split('[0-9]번: ', s)[1:]
    for i in range(len(l)):
        l[i] = list(map(int, l[i].replace(' ', '').split(',')))
    for i in l:
        for j in i:
            if j in answer:
                pass
            else:
                answer.append(j)
    return answer

i = '1번: 3,1 2번: 4 3번: 2,1,3 4번: 2,1,3,4'
solution(i)
```

# 문제99 : 토끼들의 행진

토끼들이 징검다리를 건너려고 합니다. 하지만 돌이 부실해서 몇번 건너지 못할것 같습니다.
대기중인 토끼들의 통과 여부를 배열에 담아 출력해주세요

1. 각 돌들이 얼마나 버틸수 있는지 배열로 주어집니다.

2. 각 토끼가 착지할때 마다 돌의 내구도는 1씩 줄어듭니다.
    ex) [1,2,1,4] 각 돌마다 1마리 2마리 1마리 4마리의 착지를 버틸 수 있습니다.

3. 토끼들은 점프력이 각자 다릅니다. 
    ex)[2,1] 첫번째 토끼는 2칸씩 두번째 토끼는 1칸씩 점프합니다.

4. 각 토끼들은 순서로 다리를 건넙니다.

```python
**입력**
돌의내구도 = [1, 2, 1, 4]
토끼의점프력 = [2, 1]

**출력**
['pass', 'pass']

**입력**
돌의내구도 = [1, 2, 1, 4, 5, 2]
토끼의점프력 = [2, 1, 3, 1]

**출력**
['pass', 'pass', 'fail', 'fail']
```

# 답안

```python
def doong(l,k):
    answer = ["pass" for i in range(len(k))]
    for i in range(len(k)):
        p = 0
        while p<len(l)-1:
            p += k[i]
            l[p-1]-=1
            if l[p-1]<0:
                answer[i] = "fail"
            
    print(answer)
```



# 문제100 : 퍼즐게임

N x M으로 이루어진 아래와 같은 공간에 퍼즐이 쌓여져 있습니다.

퍼즐을 맞추기 위해서는 반드시 맨 오른쪽 줄로 이동시켜 줘야 합니다.
만약 종류가 같은 퍼즐이 연속될 시에 점수가 추가되며 그 퍼즐은 사라집니다.

점수는 다음과 같습니다.

- 파란색 공 : 1점
- 빨간색 공 : 2점
- 노란색 공 : 3점
- 초록색 공 : 4점
- 주황색 공 : 5점
    점수는 공의 개수만큼 추가됩니다. 예를 들어 빨간색 공이 2개 연속되어 없어졌을 경우 2*2 = 4점입니다.

게임 플레이어는 게임이 시작되면 어떤 퍼즐을 이동할 것인지 모두 작성합니다. 만약 비어있는 곳을 선택하게 된다면 점수가 1점 감소하며 그대로 진행합니다.
위 규칙에 맞는 점수를 리턴하는 함수를 작성하세요.

예를 들어 입력이 
퍼즐 판 : [[0, 0, 0, 0], [0, 1, 0, 3], [2, 5, 0, 1], [2, 4, 4, 1], [5, 1, 1, 1]]
조작 : [1, 1, 1, 1, 3, 3, 3] 
일 경우,

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F7487d3c5-ad1d-466e-b932-df338b013f89%2F1.png?table=block&id=2ab1a22b-1d2a-4b64-b976-5cbf31394815&width=2880&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

![](https://www.notion.so/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fd58aa687-70cc-48d0-8189-cd6664be74f7%2F2.png?table=block&id=16f237c9-b69d-4ffa-8dfd-cea2c8fed376&width=2870&userId=b90e76a1-2716-4668-8a32-32dd70150234&cache=v2)

총 점수는 2점으로 2를 출력해야 합니다.

```python
**입력**
퍼즐판 = [[0,0,0,0][0,1,0,3][2,5,0,1][2,4,4,1][5,1,1,1]]
조작 = [1,1,1,1,3,3,3]

**출력**
2
```

# 답안

```python
def solution(plate, moves):
    stack=[0]
    point = 0
    while moves:
        m = moves.pop(0)
        for i in range(len(plate)):
            if plate[i][m-1]!=0:
                if stack[len(stack)-1] == plate[i][m-1]:
                    point+= plate[i][m-1]*2
                    plate[i][m-1] = 0
                    stack.pop()
                else:
                    stack.append(plate[i][m-1])
                plate[i][m-1] = 0
                break
            else:
                if  i==len(plate)-1 and plate[i][m-1]==0:
                    point-=1

    return point
```

