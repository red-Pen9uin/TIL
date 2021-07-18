[TOC]



## *함수(function) , 객체지향(Object Oriented)에 대한 이야기*

- 과거에는 함수기반의 언어가 많았다
  - 대표적으로 C 언어, 내가 구현해야 하는 내용을 기능으로 세분화

- 구조적 프로그래밍, 절차지향 프로그래밍, Top down방식 프로그래밍
- ***Divide and Conquer!***
  - 장점 : 분석과 설계가 비교적 간단
    - 프로그램 작성기간이 짧아진다
    - 인력과 돈이 작게 들어요!
  - 단점 : 프로그램의 유지보수가 힘들다
    - ==프로그램의 유지보수가 많이 필요한 세상이 되었음==
- ***==--> 객체지향으로 넘어가게 된다==***

---



# *Fuction*

- 함수 = ==특정 역할을 수행하는 코드 집합을 하나의 단위로 묶어놓은 것==
- 크게 2가지 분류 존재
  - 내장함수( *len()* )
  - 사용자 정의 함수(==*User define function*==)
- ***User define function***
  - 함수를 정의할 때 쓰는 keyword : `def`
    - 함수명은 가독성이 있어야 함. 대문자로 시작하지 않고, 여러 단어를 언더스코어(`_`)로 연결시키는 관습을 따른다.
  - 가변 인자를 주고싶은 경우, 인자의 이름 앞에 ``*``를 붙인다.
    - ***tuple*** 형태의 입력데이터로 설정 가능

```python
def my_sum(*a):    # *는 tuple형태로 입력데이터를 받아요!
    print('입력받은 값은 {} 입니다.'.format(a))
    result = 0
    for tmp in a:
        result += tmp
    return result

print(my_sum)	# 함수의 메모리 주소 리턴
my_result = my_sum(10,20,30,40)	# 가변 인자를 주고싶을 경우
print(my_result)
```


## 함수의 호출(*call*)

- 그 결과로 원본이 변하는 경우
- 그 결과로 원본은 변화하지 않고 함수가 적용된 결과가 만들어져 리턴되는 경우

```python
a = [3,7,2,6,10,0]
a.sort()  # 함수를 사용하기 위해서 호출(call)
          # 원본이 변화
print(a)

a = [1, 2, 3]
result = a.append(4)  # 인자를 넘겨줘요(함수에 전달해요)
print(result)  # None
print(a)
```



![image-20210714175411633](04_Python Function/image-20210714175411633.png)


- 파이썬은 모든 '이름'을 포인터 변수처럼 사용
  - 함수의 이름은 함수의 내용이 저장된 주소를 가리킴
  - 변수는 함수의 인자로 사용될 수 있음
  - 따라서 함수를 다른 함수의 인자로 사용할 수도 있음
    - 이 특징을 가지고 있는 함수를 일급함수(first-class function) 이라고 한다

```python
a = 100
print(a)  # 100
# a라는 변수가 가지고 있는 주소값을 찍고 싶어요!
print(id(a))   # 140703410269696(100이라는 정수값이 저장된 메모리 주소값)

# 메모리 주소를 정수값으로 표현한 것
# 메모리를 직접 access를 할 수 없도록 hexa integer로 converting한 값.
# 정확히 주소값을 나타내진 않음

a = [1, 2, 3]  # 1783259816392 
print(id(a))
b = [1, 2, 3]  
print(id(b))   # 1783259120200

def my_sum(a,b):
    print("안녕하세요")
    result = a + b
    return result

def my_test(hoho):
    hoho(10,20)
    
my_test(my_sum)
```



## python의 비교연산

```python
print( a == b )  # True, 두개의 내용이 같은가
print( a is b )  # False, 같은 메모리 주소를 가리키고 있는가, 완전히 동일한가(메모리를 공유하는가)

a = 50
b = 50

print (a is b) # True
# 숫자는 워낙 많이 사용되서 256까지는 객체를 1개만 만들어서 공유

a = 256
b = 256
print (a is b) # True

a = 257
b = 257
print (a is b) # False
```



## 함수의 return 값에 관하여

- python의 함수는 return 값을 여러개 사용할 수 있는게 아니다!
- a, b 형태는 소괄호가 없는 ***tuple***의 형태이므로, ***==tuple을 return하는 것==***


```python
# python의 함수는 return값을 여러개 사용할 수 있어요! (X)

def my_program(a,b):
    result1 = a + b
    result2 = a * b
    return result1, result2

a,b = my_program(10,20)
```


## default parameter의 사용 가능

- 가장 오른쪽 끝에 있는 parameter에만 사용 가능

```python
# python의 함수는  default parameter를 사용할 수 있어요!

def my_sum(a,b,c=True):
    if c:
        print(a+b)
    else:
        print(a*b)

# my_sum(10,20,True)  
my_sum(10,20)    # default parameter가 있는 경우 맨 마지막 입력인자를 생략 가능
```



## Mutable, Immutable

- python 함수는 입력인자에 대해 **mutable(가변의)**, **immutable(불변의)**의 개념이 존재
  - *call-by-value, call-by-reference*의 개념
  - 숫자, 문자열, *tuple* => ***immutable***
    - 값을 복사해온다 / tuple은 원래 변형 불가능
  - *list* => ***mutable***
    - 주소값을 복사해온다

```python
def my_func(tmp_number, tmp_list):
    tmp_number += 10
    tmp_list.append(100)

data_x = 10
data_list = [1,2,3]

print('현재 data_x : {}, data_list : {}'.format(data_x, data_list))
my_func(data_x, data_list)
print('현재 data_x : {}, data_list : {}'.format(data_x, data_list))
```


## *local variable vs global variable*

-  `global` 선언을 통해 지역 내에서 전역변수의 사용 선언 가능
- 전역변수를 많이 사용할 경우 코드가 복잡해지므로 사용을 지양할 것

```python
tmp2 = 100

def my_func(x):
    tmp = 100
    # global tmp2 # 이 선언을 이용해 전역변수의 사용 가능
    tmp += x
    return tmp

print(my_func(100))
print(tmp)
```



## python의 내장함수?

- 사용을 조금 더 편리하게 도와주는 함수들
- initializer를 포함하고 있음
  - 파일의 이름을 한 함수들, class 이름의 함수들, ...

```python
# type()
# id()
# print()
# len()
# int() : 인자로 들어오는 것을 정수로 바꾼다

a = 3.141592
print(int(a))
print(str(a))
# float()
# list()
# tuple()
# set()
# dict()

a = 'this is a sample text'
my_list = a.split()
print(my_list)   # ['this', 'is', 'a', 'sample', 'text']

for (idx,tmp) in enumerate(my_list):
    print((idx, tmp)) # 0 this
    
    
my_list = [3,6,8,1,2,7]
# my_list.sort()
# print(my_list)  # [1, 2, 3, 6, 7, 8]
print(sorted(my_list))  # [1, 2, 3, 6, 7, 8]
```

