gols_a = int(input('Gols do time A: '))
gols_b = int(input('Gols do time B: '))

if gols_a > gols_b:
    print(f'Time A ganhou {gols_a} x {gols_b}')
elif gols_a < gols_b:
    print(f'Time B ganhou {gols_b} x {gols_a}')
else:
    print(f'Empatou em {gols_a} x {gols_b}')
