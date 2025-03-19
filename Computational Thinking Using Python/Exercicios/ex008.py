# Uma pessoa tem em seu guarda roupa x camisas, y calças e z pares de sapato. Escreva um algoritmo que calcula de quantas maneiras diferentes ele pode se vestir. Seu algoritmo deverá ler o número de camisas, o número de calças e o número de pares de sapato.

x = int(input('Digite o número de camisetas: '))
y = int(input('Digite o número de calças: '))
z = int(input('Digite o número de pares de sapato: '))

result = x * y * z

print(f'Da para se vestir de {result} maneiras.')
