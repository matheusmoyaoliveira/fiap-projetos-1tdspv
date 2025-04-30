cont = 1
fatorial = 1
n = int(input('Digite um número inteiro: '))

while cont <= n:
    fatorial = fatorial * cont
    cont += 1


print(f'O fatorial de {n} é: {fatorial}')