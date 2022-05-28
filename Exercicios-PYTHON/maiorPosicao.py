maior = 0
posicao = 0

for i in range(1, 100):
    n = int(input())
    if n > maior:
        maior = n
        posicao = i

print(maior)
print(posicao)
