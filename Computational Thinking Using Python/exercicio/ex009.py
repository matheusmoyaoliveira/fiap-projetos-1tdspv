# Dados o preço de um produto e um percentual de desconto, escreva um algoritmo que calcula e mostra o valor do desconto e o novo preço do produto dado o percentual. E se, ao invés de um desconto, fosse um aumento. O que muda no seu algoritmo?

preco = float(input('Digite o preço do produto: R$'))

desconto = int(input('Digite a porcentagem de desconto: '))
aumento = int(input('Agora digite a porcentagem de aumento: '))

formulades = preco - (preco * desconto / 100)
formulaau = preco + (preco * aumento / 100)

print(f'O preço {preco:.2f}R$ com desconto de {desconto}%, fica no total de {formulades}.')
print(f'O preço {preco:.2f}R$ com aumento de {aumento}%, fica no total de {formulaau}.')