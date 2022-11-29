import sys

N = int(sys.stdin.readline())
stack = []

for _ in range(N):
    cmd, __ = sys.stdin.readline().split('\n')
    try:
        cmd, num = cmd.split()
    except:
        pass
    # print(f"cmd is... {cmd}")

    if cmd == "push":
        stack.append(num)

    elif cmd == "pop":
        if len(stack) > 0:
            print(stack.pop())
        else:
            print(-1)

    elif cmd == "size":
        print(len(stack))
        
    elif cmd == "empty":
        if len(stack) > 0:
            print(0)
        else:
            print(1)

    elif cmd == "top":
        if len(stack) > 0:
            print(stack[-1])
        else:
            print(-1)
    else:
        print("WHAT THE?")