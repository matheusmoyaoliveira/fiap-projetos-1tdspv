dia = int(input('Dia: '))
mes = int(input('Mês: '))

if dia < 1 or dia > 31 or mes < 1 or mes > 12:
    print('Isso não é uma data válida.')
elif mes == 2 and dia > 28:
    print(f'No mês {mes} é uma data inválida')
elif dia == 31 and (mes == 4 or mes == 6 or mes == 9 or mes == 11):
    print(f'No mês {mes} não tem dia 31')
else:
    print('Data válida!')


