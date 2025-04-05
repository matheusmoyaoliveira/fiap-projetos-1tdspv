m1 = float(input('Digite a sua 1º média: '))
m2 = float(input('Digite a sua 2º média: '))
aula = float(input('Quantas aulas teve nesse ano? '))

mf = 0.4 * m1 + 0.6 * m2 

aula = (aula * 70) / 100

faltas = float(aula / 10)


if mf < 4 and faltas > 5:
    print('Você está reprovado.')
elif mf >= 5 and mf <= 6:
    print('Você está de exame')
elif mf > 7 and faltas < 5:
    print('Você passou! Parabéns.')