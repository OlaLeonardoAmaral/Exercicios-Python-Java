valores = input().split()
a = float(valores[0])
b = float(valores[1])
c = float(valores[2])

triangulo = a * c / 2.0
circulo = 3.14159 * c * c
trapezio = (a + b) / 2.0 * c
quadrado = b * b
retangulo = a * b

print(f'TRIANGULO: {triangulo:.3f}')
print(f'CIRCULO: {circulo:.3f}')
print(f'TRAPEZIO: {trapezio:.3f}')
print(f'QUADRADO: {quadrado:.3f}')
print(f'RETANGULO: {retangulo:.3f}')
