n = int(input("Digite um número inteiro positivo: "))

divisor = 1
contador = 0

while divisor <= n:
    if n % divisor == 0:
        contador += 1
    divisor += 1

if contador == 2:
    print(f"{n} é um número primo.")
else:
    print(f"{n} não é um número primo.")
