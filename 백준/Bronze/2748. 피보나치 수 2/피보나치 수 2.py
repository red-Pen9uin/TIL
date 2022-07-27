# 작성자: red-Pen9uin

import sys
input = sys.stdin.readline

if __name__ == "__main__":
    cnt = int(input())
    fibo = [0]*(cnt+1)
    fibo[1] = 1

    for i in range(2,cnt+1):
        fibo[i] = fibo[i-2] + fibo[i-1]
    
    print(fibo[cnt])