ano = int(input('Ano: '))

if ano % 400 == 0:
    print(f'O ano {ano} é bissexto')
elif ano % 100 == 0:
    print(f'Não é bissexto')
elif ano % 4 == 0:
    print(f'{ano} é bissexto')
else:
    print(f'Não é bissexto')