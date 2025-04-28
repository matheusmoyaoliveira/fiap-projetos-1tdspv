mes = 0
d = int(input('Digite o valor inicial: '))
j = int(input('Digite a taxa de juros mensal em %: '))
t = int(input('Digite o tempo em meses: '))

j = j / 100
valor_final = d

while mes < t:
    valor_final = valor_final * (1 + j)
    mes += 1



print(f'Após {t} meses, o valor final será: R$ {valor_final:.2f}')


