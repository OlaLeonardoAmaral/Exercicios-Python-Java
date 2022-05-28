x = int(input())
y = int(input())

if x < y:
    min = x
    max = y
else:
    min = y
    max = x

i = min + 1
soma = 0

for i in range(i, max):
    if i % 2 != 0:
        soma += i

print(soma)




