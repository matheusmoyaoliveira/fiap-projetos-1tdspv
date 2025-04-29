n = int(input('Digite um número: '))

soma_divisores = 0
divisor = 1

while divisor < n:
    if n % divisor == 0:
        soma_divisores = soma_divisores + divisor
    divisor += 1
        
if soma_divisores == n:
    print(f'Esse número {n} é perfeito')
else:
    print(f'O número {n} não é perfeito')
