x = int(input())
y = int(input())

cont = 0

for i in range(x, y+1):

    if i % 4 == 0 and i % 100 != 0 or i % 400 == 0:
        cont += 1
        print(i)

print(f'bissextos: {cont}')




