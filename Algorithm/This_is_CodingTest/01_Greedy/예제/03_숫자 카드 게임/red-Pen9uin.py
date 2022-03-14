# 작성자: red-Pen9uin
# Classification: Greedy
# 02_큰 수의 법칙
# 수행 결과:  KB /  ms
"""
입력
N M
1 2 3 .. N
1 2 3 .. N
...
M줄


출력
규칙을 이용해 고를 수 있는 가장 큰 수 출력

"""
# import sys

def solve(N, M, K, num):
	num.sort()
	
	first = num[-1]
	second = num[-2]
	
	ans = 0

	while True:
		for i in range(0, K):
			if M == 0:
				break
			ans += first
			M -= 1
			
		if M==0:
			break
		else:
			ans += second
			M -= 1
		
	print(ans)


if __name__ == "__main__":
	# N, M, K = map(int, sys.stdin.readline().split())
	# num = list(map(int, sys.stdin.readline().split()))
	N, M, K = map(int, input().split())
	num = list(map(int, input().split()))
	
	solve(N, M, K, num)
