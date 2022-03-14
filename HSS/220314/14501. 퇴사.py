import sys
sys.stdin = open('1.txt')

N = int(input())
T = []
P = []
Max_Pay = 0

for t, p in [ list(map(int, input().split())) for _ in range(N) ]:
    T.append(t)
    P.append(p)

def consulting(day, pay):
    global Max_Pay
    if day == N:
        Max_Pay = max(Max_Pay, pay)
    elif day > N:
        return
    else:
        consulting(day+T[day], pay+P[day])
        consulting(day+1, pay)

consulting(0, 0)
print(Max_Pay)