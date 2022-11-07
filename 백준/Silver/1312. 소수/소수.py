A, B, N = map(int, input().split())

# if a==0:
#     print(0)
# else:
#     result = float(a/b)
#     print(result)
#     for i in range(n):
#         result *= 10
#         result %= 10
#         print(result)

#     print(int(result))

for i in range(N) :
    A = (A%B)*10
    result = A//B
print(result)