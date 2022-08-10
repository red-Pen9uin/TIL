import sys
input = sys.stdin.readline

if __name__ == "__main__":
    cnt = int(input())
    store = list(map(int, input().split()))
    next_milk = 0
    milk_cnt = 0

    for milk in store:
        if milk == next_milk:
            milk_cnt += 1
            next_milk = (next_milk+1)%3

    print(milk_cnt)