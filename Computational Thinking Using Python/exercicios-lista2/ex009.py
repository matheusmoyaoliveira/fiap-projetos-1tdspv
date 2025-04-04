import math

print('Equação de 2º Grau: ax2 + bx + c = 0')

a = int(input('Coeficiente A: '))

if a == 0:
    print('Se o coeficiente a = 0, então não é uma equação de 2º Grau...')
else:
    b = int(input('Coeficiente B: '))
    c = int(input('Coeficiente C: '))
    delta = b * b - (4 * a * c)

    if delta < 0:
        print('Se delta é = 0, as raízes não são reais.')
    elif delta == 0:
        raiz = -b / (2*a)
        print(f'delta = 0, raiz = {raiz}')
    else:
        raiz1 = (-b + math.sqrt(delta) ) / (2*a)
        raiz2 = (-b - math.sqrt(delta) ) / (2*a)
        print('Raizes: ',raiz1,' e ',raiz2)
