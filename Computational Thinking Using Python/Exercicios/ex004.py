# Escreva um algoritmo em Python que recebe dois números inteiros e exibe: a soma desses dois números, a multiplicação, a divisão inteira e o resto da divisão inteira.

n1 = int(input('Digite um número inteiro: '))
n2 = int(input('Digite o segundo número inteiro: '))

soma = n1 + n2
mult = n1 * n2
di = n1 // n2
rd = n1 % n2

print('Soma = ', soma)
print('Multiplicação = ', mult)
print('Divisão inteira = ', di)
print('Resto da divisão = ', rd)