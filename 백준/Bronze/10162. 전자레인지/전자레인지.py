# 작성자: red-Pen9uin
import sys
input = sys.stdin.readline

if __name__ == "__main__":
    MIN = 60
    SEC = 1
    A = 5*MIN
    B = 1*MIN
    C = 10*SEC

    T = int(input())
    if T%C != 0:
        print(-1)
    else:
        cnt = []
        cnt.append(T//A)
        T = T%A
        cnt.append(T//B)
        T = T%B
        cnt.append(T//C)
        T = T%C

        if T != 0:
            print(-1)
        else:
            print(*cnt)