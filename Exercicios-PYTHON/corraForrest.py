lista = []
valor = int(input())
cont = 0
calc = 0

while valor > 0:
    cont += 1
    calc += valor
    lista.append(valor)
    valor = int(input())

media = calc / cont
print(f'MEDIA: {media:.2f}')

for v in lista:
    if v < media:
        print(v)
