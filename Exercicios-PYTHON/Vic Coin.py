valorVc = 2.50
qtdVc = float(input())
soma = 0.0

while qtdVc >= 0:
    soma = soma + qtdVc
    qtdVc = float(input())

totalReal = soma * valorVc

print(f'VC$ {soma:.2f}')
print(f'R$ {totalReal:.2f}')
