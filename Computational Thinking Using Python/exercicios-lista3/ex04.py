cont = 1
real = 0
real_p = 0
real_n = 0
qtd = int(input('Digite a quantidade de numeros reais: '))

while cont <= qtd:
    real = int(input('Digite um número real: '))
    cont += 1

    if real % 2 == 0:
        real_p += 1
    
    if real % 2 == 1:
        real_n += 1

print(f'A qauntidade de números reais POSITIVOS é: {real_p}')
print(f'A qauntidade de números reais NEGATIVOS é: {real_n}')
