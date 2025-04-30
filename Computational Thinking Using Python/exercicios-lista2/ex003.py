time_a = str(input('Digite o nome do Time A: '))
time_b = str(input('Digite o nome do Time B: '))

gols_a = int(input('Quantos gols o Time A fez? '))
gols_b = int(input('Quantos gols o Time B fez? '))

if gols_a > gols_b:
    print(f'{time_a} ganhou a partida.')
elif gols_a < gols_b:
    print(f'{time_b} ganhou a partida.')
else:
    print('EMPATE !')