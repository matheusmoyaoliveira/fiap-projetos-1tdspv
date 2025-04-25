soma = 0
cont = 1
qtd = int(input('Digite o número de alunos da turma: '))
while cont <= qtd:
    nota = float(input(f'Digite a nota do aluno {cont}: '))
    cont += 1
    soma += nota  

media = soma / qtd

print(f'A média dos alunos é {media:.2f}')