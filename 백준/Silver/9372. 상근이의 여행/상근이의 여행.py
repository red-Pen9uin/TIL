import sys

if __name__ == "__main__" :
    cases = int(sys.stdin.readline())

    for i in range(cases):
        n, m = map(int, sys.stdin.readline().split())
        for j in range(m):
            a, b = map(int, sys.stdin.readline().split())
        print(n - 1)