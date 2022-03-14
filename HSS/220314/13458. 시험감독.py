import sys
sys.stdin = open('1.txt')

N = int(input())
A = list(map(int, input().split()))
B, C = map(int, input().split())
watcher = N  # 총감독관은 미리 더해둠

for i in range(N):
    tmp = A[i] - B
    if tmp > 0:
        watcher += (tmp)//C
        if (tmp)%C:
            watcher += 1
print(watcher)