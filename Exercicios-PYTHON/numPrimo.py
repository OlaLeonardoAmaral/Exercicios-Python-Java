x = int(input())
y = int(input())
cont = 0

for i in range(x, y+1):
    tot = 0
    for j in range(1, i+1):
        if i % j == 0:
            tot += 1

    if tot == 2:
        print(i)
        cont += 1

print(f'primos: {cont}')



