soma = 0
alunos = int(input('Digite o número de alunos da turma: '))
for c in range(1, alunos+1):
    nota = float(input(f'Digite a nota do aluno {c}: '))
    soma += nota  

media = soma / alunos

print(f'A média dos alunos é {media}')