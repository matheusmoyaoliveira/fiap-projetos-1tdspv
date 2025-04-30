# Uma disciplina da faculdade possui 3 tipos de avaliações: NAC, AM e PS. A média da disciplina é calculada de forma ponderada, onde a NAC tem peso 2, o AM peso 3 e a PS peso 5. Escreva um algoritmo que calcula a média da disciplina, seu algoritmo deverá receber as três notas (NAC, AM e PS) e deverá imprimir o valor da média.

nac = float(input('Digite a nota da primeira avaliação: '))
am = float(input('Digite a nota da segunda avaliação: '))
ps = float(input('Digite a nota da terceira avaliação: '))

media = (2 * nac + 3 * am + 5 * ps) / 10

print(f'A sua média vai ser {media:.1f}')