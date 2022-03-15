import sys
sys.stdin = open("1.txt")

N = int(input())
A = list(map(int, input().split()))
cnt = list(map(int, input().split()))
max_val = -99999999999
min_val = 99999999999

def calc(op_list):
    global max_val
    global min_val
    res = A[0]
    for i in range(N-1):
        if op_list[i] == 0:
            res += A[i+1]
        elif op_list[i] == 1:
            res -= A[i+1]
        elif op_list[i] == 2:
            res = res * A[i+1]
        elif op_list[i] == 3:
            if res < 0:
                res = res // A[i+1] + 1
            else:
                res = res // A[i + 1]


    max_val = max(max_val, res)
    min_val = min(min_val, res)
    return res

def align(cnt, op_list):
    if sum(cnt) == 0:
        calc(op_list)
    else:
        for i in range(4):
            if cnt[i] > 0:
                cnt[i] -= 1
                op_list.append(i)
                align(cnt, op_list)
                cnt[i] += 1
                op_list.pop()

align(cnt, [])

print(max_val)
print(min_val)
