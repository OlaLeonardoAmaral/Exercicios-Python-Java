n = int(input())
y = int(input())

if n < y or n == y:
    for i in range(n, y+1):
        for j in range(1, 10 + 1):
            print(f'{i} x {j} = {i * j}')
        print('----------')
else:
    print('Nenhuma tabuada no intervalo!')


