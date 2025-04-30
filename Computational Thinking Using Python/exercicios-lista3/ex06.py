qtd_pes = 20
cont = 1
nota = int(input('Nota: '))
maior = nota
menor = nota

conta_baixa = 0
conta_media = 0
conta_alta = 0

while cont < qtd_pes:
    nota = int(input('Nota: '))
    if nota > maior:
        maior = nota

    if nota < menor:
        menor = nota

    if nota <= 20:
        conta_baixa += 1
    elif nota <= 50:
        conta_media += 1
    else:
        conta_alta += 1

    cont = cont + 1

print(f'Maior nota {maior}, menor nota {menor}')

print(f'Até 20 = {(conta_baixa / qtd_pes) * 100}%')
print(f'De 21 até 50 = {(conta_media / qtd_pes) * 100}%')
print(f'Acima de 50 = {(conta_alta / qtd_pes) * 100}%')