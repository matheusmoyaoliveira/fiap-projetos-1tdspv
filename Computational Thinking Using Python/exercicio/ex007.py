# Sua tarefa é desenvolver um algoritmo que recebe um número inteiro de 0 a 99 e imprime o dígito das dezenas e o dígito das unidades desse número. Dica: usando papel e lápis faça a divisão inteira do número por 10 mas não coloque vírgula e nem acrescente 0 na divisão.

#recebendo o número
n1 = int(input('Digite um número inteiro: '))

result1 = (n1 // 10)
result2 = (n1 % 10)


print(f'Você digitou o número {result1:.0f}, {result2:.0f}')