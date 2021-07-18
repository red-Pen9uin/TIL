[TOC]

---



# *Python*

## Python의 특징

- 무료(Open Sourse)
- 쉽고 간결하다
- 데이터 분석에 유용한 라이브러리가 많다
  - 그리고 R에 비해 범용적인 언어
- 현재 가장 인기있는 언어
- **하위호환성이 없음**
  -  **2.x 버전과 3.x 버전이 호환성이 없음**
  - 2.x와 3.x 버전의 내용을 잘 구분해야함

```python
# python language spec

# 1. 주석
#	1줄 주석과 여러줄 주석이 있어요!
#	1줄 주석 : #
#	여러줄 주석: ''' '''

'''
이렇게 표현할 수 있다
'''

# 변수의 생성과 삭제
a = 100		# 변수의 선언, 명시적인 자료형 선언이 따로 없음
print(a)
del a		# 변수의 삭제
print(a)	# Error 발생

```
> NameError                                 Traceback (most recent call last)
> <ipython-input-9-52ccb8a119c5> in <module>
>    3 print(a)
>    4 del a
> ----> 5 print(a)  # Error 발생
>    
>    NameError: name 'a' is not defined

---



# *Data type*

1. *Numeric*
   - 정수(*int*), 실수(*float*), 복소수(*complex*)
2. *Sequence*
   - *list, tuple, dictionary*
3. *Text sequence*
4. *Mapping*
5. *Set*
6. *Bool*

---




## 1. Numeric Data Type

- ==정수, 실수, 복소수==가 여기에 해당
- ***int, float, complex***

```python
# 정수(int), 실수(float), 복소수(complex)
a = 123
b = 3.141592
c = 3.14E2		# 지수표현
d = a + 3j		#i 대신 J나 j를 이용해 복소수 표현
				#complex(3, -4) 처럼 구분해 표현 가능
print(d.real)
print(d.imag)	#실수부와 허수부를 따로 불러낼 수 있음

print(d.conjugate())	#켤레복소수의 표현
abs(d)					#복소수의 크기
```

- *type()*
  - 해당 데이터가 어떤 class의 instance 인지 알려주는 함수

```python
# type()   # 해당 데이터가 어떤 class의 instance인지를 알려주는 함수
print(type(a))   # <class 'int'>
print(type(b))   # <class 'float'>

result = 3 / 4  
print(result)   # 0.75

result = 3 ** 4
print(result)   # 81

result = 10 % 3
print(result)   # 1

result = 10 // 3
print(result)   # 3
```
> <class 'int'>
> <class 'float'>
> 0.75
> 81
> 1
> 3

---



## 2. Sequence Data Type

### *a. list*

- **==임의의 데이터를 순서대로 저장하는 집합 자료형==**
- index를 이용해서 위치를 지정할 수 있다
  - index는 `0`부터 시작
- list의 literal 표현 : ``[ ]`` (대괄호)
  - 빈 리스트와 중첩리스트를 허용

```python
a = list()		# empty list를 생성하는 가장 일반적인 형태
a = []			# literal 표현은 대괄호( [] )
a = [1, 2, 3]	# ','를 기준으로 요소들을 나열.
				# [ 1 2 3 ]과는 완전 다른 개념

a = [1, 3.14, '홍길동', True]
a = [1, 3.14, ['Hello', 5], 100]	#중첩 리스트 허용
```
- indexing 
  - 숫자 index는 `0`부터 시작
  - 마이너스 인덱싱을 지원하며, 이 경우 `-1`부터 시작

```python
print(a)    # [1, 3.14, ['Hello', 5], 100]
print(a[0]) # 1
print(a[3]) # 100
a[3] = 200

print(a)      # [1, 3.14, ['Hello', 5], 200]
print(a[-2])  # ['Hello', 5]
print(a[-2][1]) # 5
```
- slicing : 슬라이싱을 한 결과는 원본과 같은 데이터 타입을 가진다

```python
print(a)		# [1, 3.14, ['Hello', 5], 200]
print(a[0:2])   # 0부터 2까지(앞은 inclusive 뒤는 exclusive)
                # 앞은 포함, 뒤는 불포함
                # [1, 3.14]
print(a[0:1])   # [1]
print(a[2:])    # [['Hello', 5], 200]]
				# 2번요소에서 끝까지
print(a[:3])    # [1, 3.14, ['Hello', 5]]
				# 처음부터 3번 요소까지
print(a[:])     # [1, 3.14, ['Hello', 5], 200]
				# 처음부터 끝까지
```


#### 기본 연산 / 연산자 overloading

```python
# 기본 연산
a = [1, 2, 3]
b = [4, 5, 6]

result = a + b  # 연산자 overloading ( 연결의 의미로 변한다 )
				# list에서 +는 concatenation 기호
print(result)   # [1, 2, 3, 4, 5, 6]

result = a * 3  # a + a + a
print(result)   # [1, 2, 3, 1, 2, 3, 1, 2, 3]

a = [1, 2, 3]

# print(a[0] + 'Hello')   # 1 + 'Hello' => '1' + 'Hello' => '1Hello'
# 파이썬은 자동형변환이 일어나지 않는다!
# 명시적 형변환을 필요로 함
print(str(a[0]) + 'Hello')  # 1Hello
                
a = [1, 2, 3]
# a.append(4)  # append()는 리스트 마지막에 요소를 추가하는 함수
#              # 함수는 2가지 형태로 사용이 되는데
#              # 원본이 바뀌는 경우가 있고 결과값이 리턴되는 경우가 있어요!
# print(a)     # [1, 2, 3, 4]  
```



#### 자주 사용하는 메소드

- 함수는 2가지 형태로 사용, 함수에 따라 처리 결과가 달라짐
  - 원본이 바뀌는 경우: ==결과값을 리턴하지 않을 수 있음==
    - 보통 리턴값이 없는 편인듯
  - 결과값이 리턴되는 경우: ==원본이 바뀌지 않음==

```python
result = a.append(4)
print(result)  # None

# append
# 원본변화, 리스트의 마지막에 새 요소 추가
a = [1, 2, 3]
a.append([4, 5, 6])  # [1, 2, 3, [4, 5, 6]]
print(a)

# extend
# 원본변화, 리스트의 확장
# 원본 리스트에 붙여서 확장
a = [1, 2, 3]
a.extend([4, 5, 6])  # [1, 2, 3, 4, 5, 6] 
print(a)            

# sort
# 원본변화, 리스트의 정렬
# 오름차순을 기본으로 함
a = [3, 7, 10, 1, 2, 8, 4]
result = a.sort() # 의미없는 형태
a.sort()   # 맞는 형태
print(a)   # [1, 2, 3, 4, 7, 8, 10]

# reverse
# 원본변화, 리스트의 정렬
# 내림차순을 기본으로 함
a.reverse()
print(a)   # [10, 8, 7, 4, 3, 2, 1]
```



### *b. tuple*

- list와 상당히 유사
- 여러가지 데이터를 순차적으로 저장하는 집합 자료형
- **tuple은 ==read only==**
  - tuple의 요소는 변경이 불가능
- tuple의 literal 표현 : ``( )`` (소괄호)
  - 생략 가능하나, 특별한 경우가 아닐 시 잡아주는 것이 좋다

```python

# list와 상당히 유사
# 여러가지 데이터를 순차적으로 저장하는 집합 자료형
# tuple은 read only
a = tuple()
# list는 대괄호 [], tuple은 소괄호 ()
a = ()  # 요소가 없는 tuple
a = (1, 2, 3) 
# 원래 소괄호는 (1 + 3) * 4

a = (1)		# 이 경우 연산자우선순위를 위한 괄호인지,
			# 단일요소의 튜플인지 알 수 없음
			# 결론적으로는 숫자1을 가리킴, 튜플이 아님!
        
a = (1,)	# 요소가 1개인 tuple
			# type() 을 이용해 자료형/클래스 확인 가능
print(type(a))  # <class 'tuple'>

a = 1, 2, 3		# tuple은 ()를 생략할 수 있다
				# 특별한 경우 아닐 시 그냥 괄호를 잡아주는 것이 좋다
print(type(a)) # <class 'tuple'>
```



#### 연산, 인덱싱, 메소드

```python
# 나머지는 list와 유사하다
# indexing, slicing 다 가능

a = (1, 2, (3, 4), [5, 6], 7)

print(a[1])  # 2
# a[1] = 3		# 허용하지 않는다. tuple의 요소는 변경이 불가능.
a[3][0] = 100	# 가능
# a[3] = 100	# 불가능!! 

a = (1, 2, 3)
b = 4, 5, 6

print(a + b)	# (1, 2, 3, 4, 5, 6)
				# list와 똑같이 concat

a = [1, 2, 3]
b = tuple(a)	#튜플화
print(b)		# (1, 2, 3)

a = (4, 5, 6)
result = list(a)	#리스트화
print(result)		# [4, 5, 6]
```



### *c. range*

- 영역, 범위를 나타내는 데이터타입
- 반복문에서 많이 사용
- **==시작, 끝, 증감==** 을 이용해 만들어진다
  - 끝값은 포함되지 않는다
  - **==의미표현일 뿐, 모든 값이 메모리를 차지하진 않는다==**
  - 적은 메모리공간으로 큰 범위 표현 가능

```python
a = range(1,10,1)	# range(1, 10)
					# 1부터 9까지 1씩 증가하는 range
					# 리스트로 표현 시 [1,2,3,4,5,6,7,8,9]
	  				# =>메모리 공간을 요소들이 하나하나 차지
        			# 의미는 똑같으나 range는 시작, 끝, 증감을 통해 표현하므로 메모리 절약
print(a)	# range(1, 10) -> [1,2,3,4,5,6,7,8,9]

a = range(10)   # 초기값과 증감이 빠진 경우
				# 초기값은 0, 증감은 1이 기본
print(a)	# range(0, 10)-> [0,1,2,3,4,5,6,7,8,9]
print(a[1])     # 1
print(a[:3])    # range(0, 3)
				# 원본이 range 이므로 슬라이싱 결과도 range

a = range(3,100, 10) 
print(a[1])     # 13

# 추가적인 연산자 in
# 포함관계 검사
# 특정 요소가 연속형 자료형 안에 포함이 되는지 되지 않는지를 판별
# 있으면 True 없으면 False
# python의 bool타입은 첫글자가 대문자로 시작
print(7 in range(10))   # True
print(range(1,20,3)[-1]) # 19
```
> range(1, 10)
> range(0, 10)
> 1
> range(0, 3)
> 13
> True
> 19

---



## 3. Text Sequence Data Type

- 대표적인 예시가 문자열. 우리가 흔희 문자열 이라고 부르는 것들을 Text Sequence Data Type
- ***==str class==*** 이용
- 다른 언어(Java와 C++)는 문자와 문자열을 구분

  -  'a', "a"
  -  'ab'(X) "ab"(O)
- python은 ==문자의 개념 없이 모두 문자열로 취급==
- str의 literal 표현 : ``' '``, ``" "`` (작은 따옴표, 큰 따옴표 / Single or Double quotation mark)
  - 둘다 가능

```python
# 다른 언어는(Java와 C++) 문자와 문자열을 구분
#                        'a', "a"
#                        'ab'(X) "ab"(O)
# 'Hello' , "Hello"
# list안에 각 요소가 문자로 구성된 거.
```



- 머신러닝, 딥러닝에서 데이터 대부분이 문자열로 나오는것도 많고 데이터의 정제를 열심히, 잘 빨리 해야하므로 문자열 핸들링이 중요하다.
```python
# 문자열  handling은 잘 해야 한다!!
a = 'Hello'
b = 'world'
print(a + b)	# Helloworld
				# list, tuple처럼 concat

# slicing 지원
a = 'This is a Sample Text'
print(a[5])  # i
print(type(a))  # <class 'str'>
print(a[2:6]) # 'is i'
```

> Helloworld
> i
> <class 'str'>
> is i



- 문자열은 문자열을 제어하기 위한 정말 많은 함수를 제공

```python
a = 'This is a Sample Text'

print(a.upper())	# THIS IS A SAMPLE TEXT
print(a)			# This is a Sample Text
```

> THIS IS A SAMPLE TEXT
> This is a Sample Text

```python
a = 'cocacola'

# 문자열의 길이
print(len(a))  # 8
# 해당 문자가 가장 처음 나오는 위치의 index값
print(a.index('a'))   # 3

a = 'this is a sample text'

# 문자열을 공백으로 분할해서 각각 리스트에 넣어서 리턴
result = a.split() 
print(result)   # ['this', 'is', 'a', 'sample', 'text']

a = 'a,b,c,d,e'
result = a.split(',')  # 문자열을 특정기준으로 분할해서 각각 리스트에 넣어서 리턴
print(result)   # ['a', 'b', 'c', 'd', 'e']
```

>8
>3
>['this', 'is', 'a', 'sample', 'text']
>['a', 'b', 'c', 'd', 'e']



#### 문자열 포맷팅( *format()* )

```python
apple = 10
banana = 8

text = '철수는 사과를 {}개 가지고 있고 영희는 바나나를 {}개 가지고 있어요'
print(text.format(apple, banana))
# 철수는 사과를 5개 가지고 있고 영희는 바나나를 7개 가지고 있어요

print('포도를 {}송이 주세요!'.format(100))  # 포도를 100송이 주세요!
```
> THIS IS A SAMPLE TEXT
> This is a Sample Text
> 철수는 사과를 10개 가지고 있고 영희는 바나나를 8개 가지고 있어요
> 포도를 100송이 주세요!

---



## 4. Mapping Data Type

- Hash map....?
- 주로 사용되는 클래스 - `dict class`
- dictionary는 ==key와 value의 쌍==으로 데이터를 저장
  - 데이터 저장에 대한 ==순서가 존재하지 않는다==
  - 중요한 것은 위치가 아닌 key
    - 최신 버전은 dict에서도 순서를 부여하긴 하나, 거기까진 생각하지 않을 것
- dict의 literal 표현 : ``{ key:values, }`` (중괄호)
```python
# python data type - Mapping data type
# 사용되는 클래스 - dict class

# 'name' : '홍길동', '주소' : '서울', '나이' : 30
# 이렇게 생긴 데이터 표현 방법을 json이라고 한다...? 나중에 이야기할 것
a = { 'name' : '홍길동', '주소' : '서울', '나이' : 30 } 
print(type(a))  # <class 'dict'>
```

- ==key 값을 index 처럼 활용 가능==
- key 값을 이용한 indexing
  - ==순서가 존재하지 않으므로, slicing을 지원하지 않는다==
- 키값은 반드시 수정이 안되는 값으로 사용되어야 한다
  - 키값에 list는 사용할 수 없다!!
  - tuple은 키값으로 사용할 수 있다
  - ==일반적으로 문자열을 키값으로 이용==

```python
print(a['나이'])  # 30
a['나이'] = 50
print(a['나이'])  # 50

a['취미'] = '기타'
print(a)   # {'name': '홍길동', '주소': '서울', '나이': 50, '취미': '기타'}

a = { 'name' : '홍길동', '주소' : '서울', '나이' : 30 }
print(a)

# tuple은 키값으로 사용할 수 있다
a = { (10,20) : 'Hello' }
```

#### dictionary와 관련된 메소드 3개

- keys()
  - dict_keys: list와 비슷한 하위클래스
- values()
  - dict_values: list와 비슷한 하위클래스
- items()
  - dict_items: list와 비슷한 하위클래스
  - 튜플로 만들어서 리스트에 넣는다
    - 이렇게 하면 인덱스를 이용한 순차처리가 가능

```python
# dictionary와 관련된 함수 3개
# keys()
a = { 'name' : '홍길동', '주소' : '서울', '나이' : 30 }
print(a.keys())   # dict_keys(['name', '주소', '나이'])
                  # ['name', '주소', '나이']
print(a.values()) # dict_values(['홍길동', '서울', 30])
print(a.items())  # dict_items([('name', '홍길동'), ('주소', '서울'), ('나이', 30)])

```
> {'name': '홍길동', '주소': '서울', '나이': 30}
> dict_keys(['name', '주소', '나이'])
> dict_values(['홍길동', '서울', 30])
> dict_items([('name', '홍길동'), ('주소', '서울'), ('나이', 30)])

---



## 5. Set Type

- 사용되는 class : `set`
- 주머니처럼 생각하면 된다
  - key와 value의 개념 없이 데이터(value)만 저장
  - 순서가 없으며 중복저장을 허용하지 않는다
    - 순서는 없으나 정렬되어 보인다..
  - 알아서 걸러준다. unique 한 값을 뽑기 유용?
- set의 literal 표현 : ``{ }`` (중괄호)
  - dict와 유사. 어떻게 저장하느냐에 따라 set, dict가 결정되는 것

```python
a = {1, 2, 3}
print(type(a))   # <class 'set'>

a = [1, 2, 1, 2, 3, 3, 5]
result = set(a)
print(result)   # {1, 2, 3, 5}
```

#### set의 연산
-  집합연산(합집합, 교집합, 차집합)
```
a = set([1,8,3,4])
b = set([3,4,5,6])

print(a | b)   # {1, 2, 3, 4, 5, 6}  합집합(union)
print(a & b)   # {3, 4}  교집합(intersection)
print(a - b)   # {1, 2}  차집합(difference)
```
> <class 'set'>
> {1, 2, 3, 5}
> {1, 3, 4, 5, 6, 8}
> {3, 4}
> {8, 1}

---



## 6. Bool Type

- ==True, False==
  - 연산자는 *and, or, not*
- 다음의 경우는 False로 간주
  - 빈 *str*( '', "" )은 논리값으로 ***False***로 간주
  - 빈 *list*( [] )는 논리값으로 ***False***간주
  - 빈 *tuple*( () )는 논리값으로 ***False*** 간주
  - 빈 *dictionary*( {} )는 논리값으로 ***False*** 간주
  - 숫자 *0*은 ***False***간주 *(0 이외의 다른 숫자는 **True**)*
  - *None*도 ***False***로 간주

```python
a = True
b = False
print(a)
print(a and b)   # and 연산은 피 연산자 2개가 둘 다 True 인 경우만 결과값이 True
print(a or b)   # and 연산은 피 연산자 2개가 둘 다 False 인 경우만 결과값이 False
print(not a)
```
> True
> False
> True
> False

---




## 7. Built-in Data Type
- python의 built-in data type
  - 그 외: 타 module 이식 시 사용가능한 data type들이 있음
  - 날짜연산에 사용되는 data class는 나중에 나올때 다시 소개


# 그 외 -*print()*
- print()는 인자로 들어오는 데이터를 ==문자열로 변환해서 출력==하는 함수
- 기본적인 print함수는 출력후 line feed(한줄을 띄움)을 수행

```python
a = 100
print(a)
print('Hello')

print('Hello', end=' ')
print('World')
```
> 100
> Hello
> Hello World
