idade = int(input('Qual a sua idade nadadador? '))
if idade >= 5 and idade <= 7:
    print('Você está na categoria: INFANTIL')
elif idade >= 8 and idade <= 10:
    print('Você está na categoria: JUVENIL')
elif idade >= 11 and idade <= 15:
    print('Você está na categoria: ADOLESCENTE')
elif idade >= 16 and idade <= 30:
    print('Você está na categoria: ADULTO')
else:
    print('Você está na categoria: SENIOR')