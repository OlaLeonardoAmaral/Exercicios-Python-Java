a = input()
b = input()
c = input()

if a == 'vertebrado':
    if b == 'ave':
        if c == 'carnivoro':
            print('aguia')
        else:
            print('pomba')

    elif b == 'mamifero':
        if c == 'herbivoro':
            print('vaca')
        else:
            print('homem')

if a == 'invertebrado':
    if b == 'inseto':
        if c == 'herbivoro':
            print('lagarta')
        else:
            print('pulga')

    elif b == 'anelideo':
        if c == 'onivoro':
            print('minhoca')
        else:
            print('sanguessuga')
