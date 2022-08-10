import sys
input = sys.stdin.readline

if __name__ == "__main__":
    num1, num2 = input().split()

    min_num = []
    max_num = []

    min_num.append(num1.replace('6', '5'))
    min_num.append(num2.replace('6', '5'))
    max_num.append(num1.replace('5', '6'))
    max_num.append(num2.replace('5', '6'))

    min_num = map(int, min_num)
    max_num = map(int, max_num)

    print(f"{sum(min_num)} {sum(max_num)}")