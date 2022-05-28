divida = int(input())
pagamentomes = int(input())

pagamento = 0

if divida < pagamentomes:
    print('pagamento: 1')
    print(f'antes = {divida}')
    print('depois = 0')
    print('-' * 5)

else:
    while divida != 0 and divida > 1:
        pagamento += 1
        print(f'pagamento: {pagamento}')
        print(f'antes = {divida}')
        divida -= pagamentomes
        print(f'depois = {divida}')
        print('-' * 5)
        if divida < pagamentomes and divida != 0:
            pagamento += 1
            print(f'pagamento: {pagamento}')
            print(f'antes = {divida}')
            divida = 0
            print(f'depois = {divida}')
            print('-' * 5)

