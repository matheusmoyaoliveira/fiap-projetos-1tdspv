# Neste mês, João recebeu um aumento no salário, porém ele não sabe calcular o percentual de aumento. Você deverá escrever um algoritmo que recebe 2 números reais representando os salários antes e depois do aumento e deverá calcular e exibir o percentual de aumento que João obteve.

salario_antigo = float(input('Digite o valor do salário antigo: R$ '))
novo_salario = float(input('Digite o valor do novo salário: R$ '))

aumento = (100 * novo_salario / salario_antigo) - 100

print(f'O aumento do seu salário foi de {aumento:.0f}%')