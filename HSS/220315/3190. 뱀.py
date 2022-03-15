import sys
sys.stdin = open('1.txt')

from collections import deque

N = int(input())
K = int(input())
Map = [ [0]*N for _ in range(N) ]
move_list = [0] * 10002

for _ in range(K):
    r, c = map(int, input().split())
    Map[r-1][c-1] = 2

L = int(input())
for _ in range(L):
    t, m = map(str, input().split())
    move_list[int(t)] = m

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
snake = deque()
snake.append([0, 0])
direct = 0

def isIn(x, y):
    if x<0 or y<0 or x>=N or y>=N:
        return False
    return True

def snake_move():
    global snake
    global direct

    x, y = snake[-1][0], snake[-1][1]
    nx, ny = x + dx[direct], y + dy[direct]

    # 1. 벽이나 자기 몸인지 check후
    if isIn(nx, ny) and ([nx, ny] not in snake):
        # 1-1. 머리 이동
        snake.append([nx, ny])
        # 2. 사과 있는지 확인
        if Map[ny][nx] == 2:
            Map[ny][nx] = 0
        else:
            # 2-2. 사과 없으면 꼬리 비우기
            snake.popleft()
    # 1-2. 이동 불가능하면 return 1
    else:
        return 1

    #3. return 0
    return 0

def time_flow ():
    global direct

    for time in range(0, 10001):
        if move_list[time] == 'D':
            direct = (direct + 1) % 4
        elif move_list[time] == 'L':
            direct = (direct - 1) % 4
        if snake_move():
            return time + 1 # 0초에서 시작해서 1 더해줌
    return 10001

print(time_flow())


