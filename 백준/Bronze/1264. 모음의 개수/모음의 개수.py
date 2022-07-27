# 작성자: red-Pen9uin

if __name__ == "__main__":
    # vowel = ['a', 'e', 'i', 'o', 'u']
    vowel = ['A', 'E', 'I', 'O', 'U']

    while True:
        sentence = input()
        cnt = 0
        if sentence == "#":
            break

        sentence = sentence.upper()
        # sentence = list(sentence)
        # print(sentence)
        for i in sentence:
            if i in vowel:
                cnt += 1
        
        print(cnt)