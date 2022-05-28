x = int(input())
soma = 0
count = 0

while x >= 0:
    count += 1
    soma += x
    x = int(input())

media = soma / count
print(f'{media:.2f}')


