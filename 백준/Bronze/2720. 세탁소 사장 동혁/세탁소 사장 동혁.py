import sys
input = sys.stdin.readline

if __name__ == "__main__":
    cases = int(input())
    
    for i in range(0, cases):
        changes = int(input())

        coins = []
        quater = 25
        dime = 10
        nickel = 5
        penny = 1

        coins.append(changes//quater)
        changes %= quater
        coins.append(changes//dime)
        changes %= dime
        coins.append(changes//nickel)
        changes %= nickel
        coins.append(changes//penny)

        print(*coins)