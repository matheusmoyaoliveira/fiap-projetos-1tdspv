# O RM de um aluno da FIAP é composto por 5 dígitos. Sua tarefa é escrever um algoritmo que recebe um RM e retorna a somatória de todos os dígitos do RM. Por exemplo, suponha que o aluno tenha o RM 56395, seu algoritmo deverá imprimir como saída 28 = 5 + 6 + 3 + 9 + 5. Dica: realize várias divisões e restos de divisões por 10.
<<<<<<< HEAD
=======

rm = 0

rm = int(input('Digite seu RM: '))

rm1 = rm // 10
rest1 = rm1 % 10
rm2 = rm1 // 10
rest2 = rm1 % 10
rm3 = rm2 // 10
rest3 = rm2 % 10
rm4 = rm3 // 10
rest4 = rm3 % 10
rm5 = rm4 // 10
rest5 = rm4 % 10
rm6 = rm5 // 10
rest6 = rm5 % 10

soma = rest1 + rest2 + rest3 + rest4 + rest5 + rest6

print(soma)
>>>>>>> 56a625e927eac895771825447558379fba6ef66e
