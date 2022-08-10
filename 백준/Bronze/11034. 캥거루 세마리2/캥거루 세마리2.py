import sys
input = sys.stdin.readline

if __name__ == "__main__":
    while True:
        kang = list(map(int, input().split()))
        kang.sort()

        try:
            answer = max((kang[1] - kang[0]), (kang[2] - kang[1]))
            answer -= 1

            print(answer)
        except:
            exit()