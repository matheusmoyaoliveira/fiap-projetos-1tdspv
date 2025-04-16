soma = 0
num = int(input('Digite um número: '))

while num != 0:
    if num % 2 == 0:
        soma = soma + num
    num = int(input('Digite um número: '))
print(soma)
