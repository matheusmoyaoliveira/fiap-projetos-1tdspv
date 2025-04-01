valor = float(input('Qual o valor normal da etiqueta? R$ '))
codigo = int(input('Agora digite o código de acordo com a condição de pagamento que deseja\n \n'
'1: A vista em dinheiro ou cheque, recebe 10% de desconto\n'
'2: A vista no cartão de crédito, recebe 5% de desconto\n'
'3: Em duas vezes, preço normal de etiqueta sem juros\n'
'4: Em quatro vezes, preço normal de etiqueta mais juros de 7%\n \n'))

if codigo == 1:
    desconto = valor * 10 / 100
    novo_valor = valor - desconto
    print(f'você escolheu a opção 1: A vista em dinheiro ou cheque, recebe 10% de desconto.\nCom isso o valor da etiqueta fica R$ {novo_valor:,.2f}')

elif codigo == 2:
    desconto = valor * 5 / 100
    novo_valor = valor - desconto
    print(f'você escolheu a opção 2: A vista no cartão de crédito, recebe 5% de desconto.\nCom isso o valor da etiqueta fica R$ {novo_valor:,.2f}')

elif codigo == 3:
    print(f'você escolheu a opção 3: Em duas vezes, preço normal de etiqueta sem juros.\nCom isso o valor da etiqueta fica R$ {valor:,.2f}')

elif codigo == 4:
    juros = valor * 7 / 100
    novo_valor = valor + juros
    print(f'você escolheu a opção 4: Em quatro vezes, preço normal de etiqueta mais juros de 7%.\nCom isso o valor da etiqueta fica R$ {novo_valor:,.2f}')


