import sys

N, M = map(int, sys.stdin.readline().split())
books = []

for i in range(M):
    cnt = int(sys.stdin.readline())
    stack = list(map(int, sys.stdin.readline().split()))
    books.append(stack)

for stack in books:
    not_able = False
    for i in range(len(stack)-1):
        if stack[i] < stack[i+1]:
            not_able = True
            break
    if not_able:
        print("No")
        break
if not not_able:
    print("Yes")