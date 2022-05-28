import math

valor1 = input().split()
x1 = float(valor1[0])
y1 = float(valor1[1])

valor2 = input().split()
x2 = float(valor2[0])
y2 = float(valor2[1])

calc = math.sqrt((math.pow(x2 - x1, 2)) + (math.pow(y2 - y1, 2)))

print(f'{calc:.4f}')
