string = input()
curr = string[0]
flip = 0
for i in string:
    if i == curr:
        continue
    else:
        flip += 1
        curr = i
print((flip+1)//2)