[TOC]



# *Control Statement*

- python의 control statement (제어문)
- block을 표현하기 위해서 =={}를 사용하지 않는다==
  - 대신 ==indentation(들여쓰기-space기준 4칸)을 이용==

---



## 조건문 *if*

```python
a = 40

# if a > 50:
#     print('a는 50보다 커요!')
#     print('호호호')
# else:
#     print('a는 50보다 작아요!')
#     print('하하하')

if a > 50:
    print('a는 50보다 커요!')
elif a > 30:
    print('a는 30보다 커요!')
else:
    print('a는 30보다 작아요!')

# 논리식 => 3 > 5 => False
a = 100

if a > 5:
    print('aa')
    print('bb')
elif a > 2:
    print('haha')
else:
    print('cc')
    print('dd')
```
> a는 30보다 커요!



## 반복문 *for, while*

- for문은 반복하는 횟수를 알고 있거나 정해져있을때
  - range와 많이 사용한다
  - 크게 2가지 형태로 사용
    - `for ~ in range`
    - `for ~ in list, tuple, dict`

```python
# myList = [1,2,3,4,5]

# for tmp in myList:
#     print(tmp)

# range의 값을 가져와 tmp에 저장 후 반복수행
mySum = 0
for tmp in range(100):
    mySum += tmp
print('결과 : {}'.format(mySum))

# a = [1, 2, 3, 4]
a = { 'name' : '홍길동', '주소' : '서울', '나이' : 30 }

for aaa in a:
    print('key : {}, value : {}'.format(aaa,a[aaa]))
```

- 예제 1

```python
# list comprehension

myList = [1, 2, 3, 4, 5, 6, 7, 8, 9]

# 위의 리스트에서 각각의 요소에 x2를 해서 새로운 list를 만들어 보아요!
result = list()
for a in myList:
    result.append(a*2)
    
print(result)    # [2, 4, 6, 8, 10, 12, 14, 16, 18]
```

- 예제 2

```python
myList_1 = [tmp * 2 for tmp in myList]
print(myList_1)  # [2, 4, 6, 8, 10, 12, 14, 16, 18]

# 위의 리스트에서 요소의 값이 짝수인것을 찾아서 해당 요소에 x2를 해서 
# 새로운 list를 만들어 보아요!
myList_2 = [tmp * 2 for tmp in myList if tmp % 2 == 0]
print(myList_2)
```
---



## 반복문 *while*

- while은 조건에 따라서 반복을 결정할때

```python
idx = 0

while idx < 10:
    print('haha')
    idx += 1
    if idx > 5:
        break   # break : 가장 인접한 루프를 탈출하는 keyword
        
for tmp in range(10):
    pass
    
```




# *예제*

## 문제 1

```python
# 문제 1.
# 10보다 작은 자연수 중에서 3 또는 5의 배수는
# 3,5,6,9가 존재해요! 이것들의 합은 23입니다.

# 1000보다 작은 자연수 중에서 3 또는 5의 배수들을
# 구해서 모두 합하면 얼마인가요?
#####################################
sum = 0

for a in range(1,1000):
    tmp = a
    if tmp%5==0 or tmp%3==0:
        sum = sum+tmp
        
print(sum)
```

> 233168

``# 1번문제 정답 : 233168``



## 문제 2

```python
# 문제 2.
# 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 
# 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.

# 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
# 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?

num1 = 1
num2 = 1
num3 = 0
sum = 0

while True :
    num3 = num1+num2
    num1 = num2
    num2 = num3
#    print(num1, num2, num3)
    if num3>4000000:
        break
    if num3%2==0:
        sum = sum+num3
        
print(sum)
```

> 4613732

``# 2번문제 정답 : 4613732``



## 문제 3

```python
# 문제 3.
# 알파벳 대소문자로 된 문자열이 주어지면, 
# 이 문자열에서 가장 많이 사용된 알파벳이 
# 무엇인지 출력하는 프로그램을 작성하시오. 
# 단, 대소문자는 구별하지 않아요. 만약 동률이 존재하는 경우 
# 알파벳 순으로 제일 앞에 있는
# 문자를 출력하세요.

# 문자열) "This is a sample Program mississippi river"
# 문자열) "abcdabcdababccddcd"

import operator

string = "This is a sample Program mississippi river"
string = string.lower()
result = {}

for i in range(0, len(string)):
    index = string[i]
    cnt = string.count(index)
    result[index] = cnt

itemm = result.items()
itemm = sorted(itemm)
sitem = sorted(itemm, key=operator.itemgetter(1), reverse=True)

print(result)
print(sitem)
```

> i: 7

``# 3번문제 정답 : ``

``"This is a sample Program mississippi river" => i``

``"abcdabcdababccddcd" => c``