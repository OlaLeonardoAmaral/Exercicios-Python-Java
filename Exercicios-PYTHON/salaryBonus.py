vendedor = str(input())
salario = float(input())
totalVendas = float(input())

bonus = totalVendas * 0.15 + salario

print(f'TOTAL = R$ {bonus:.2f}')
