soma = 0
cont = 1

cont0_5 = 0
acima5 = 0

qtd = int(input('Digite o número de alunos da turma: '))

while cont <= qtd:
    nota = float(input(f'Digite a nota do aluno {cont}: '))
    cont += 1
    soma += nota 

    if 0 <= nota < 5:
        cont0_5 += 1
        

    if nota > 5:
        acima5 += 1  
        

media = soma / qtd

print(f'A média dos alunos é {media:.2f}')
print(f'Os alunos que tiraram nota entre 0 e 5 foram {cont0_5}')
print(f'Os alunos que tiraram nota acima de 5 foram {acima5}')