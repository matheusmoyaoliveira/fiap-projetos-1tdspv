import random

sorteador = random.randint(1, 1001)

sort = int(input('Digite um número:'))
tentativas = 0

while sort != sorteador:
    if sort < sorteador:
        tentativas += 1
        print('O número sorteado é maior.')
        sort = int(input('Digite outro número maior: '))
    elif sort > sorteador:
        tentativas += 1
        print('O número sorteado é menor.')
        sort = int(input('Digite outro número menor: '))
    elif sort == sorteador:
        print(f'Parabéns você acertou com {tentativas} tentativas')
        