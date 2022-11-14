hour, min = map(int, input().split())
cook = int(input())

hour += cook//60
cook %= 60
min += cook

if min >= 60:
    hour += min//60
    min %= 60
if hour >= 24:
    hour %= 24

print(str(hour) + " " + str(min))