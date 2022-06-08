import sys
input = sys.stdin.readline


for _ in range(3):
    cnt = int(input())
    sum = 0
    for i in range(cnt):
        sum += int(input())

    if sum == 0:
        sum = 0
    elif sum > 0:
        sum = "+"
    elif sum < 0:
        sum = "-"
    print(f"{sum}")