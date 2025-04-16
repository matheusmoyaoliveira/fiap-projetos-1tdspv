# Escreva um algoritmo que recebe o nome de uma pessoa e seu ano de nascimento. Seu algoritmo deverá mostrar na tela o nome da pessoa e a idade que ele tem ou terá até o fim de 2024. Por exemplo, supondo que a pessoa informe o ano de nascimento como 1986 seu programa deverá imprimir: Fulano de tal tem (ou terá) 34 anos

from datetime import date
ano = date.today().year

nome = input('Digite seu nome: ')
dtn = int(input('Digite o ano do seu nascimento: '))

soma = ano - dtn
print(soma)