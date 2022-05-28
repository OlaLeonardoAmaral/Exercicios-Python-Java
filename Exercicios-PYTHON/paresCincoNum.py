n1 = int(input())
n2 = int(input())
n3 = int(input())
n4 = int(input())
n5 = int(input())

vet = [n1, n2, n3, n4, n5]
count = 0

for i in range(0, 5):
    if vet[i] % 2 == 0:
        count += 1

print(count, 'valores pares')
