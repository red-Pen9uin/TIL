# 작성자: red-Pen9uin

import sys
input = sys.stdin.readline

if __name__ == "__main__":
    NUM_OF_STUDENT = 5
    score = [0]*NUM_OF_STUDENT
    for i in range(0, len(score)):
        score[i] = int(input())
        if score[i] < 40:
            score[i] = 40
    score = int(sum(score) / NUM_OF_STUDENT)
    print(score)
    