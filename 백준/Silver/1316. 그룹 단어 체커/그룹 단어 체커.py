import sys

words = int(sys.stdin.readline())
group_words = 0

for _ in range(words):
    is_group = True
    word = sys.stdin.readline().strip()
    now = word[0]
    alph = set(now)

    for a in word:
        if now!=a:
            if not a in alph:
                alph.add(now)
                now = a
            else:
                is_group = False
                break
    # print(is_group)
    if is_group:
        group_words += 1

print(group_words)