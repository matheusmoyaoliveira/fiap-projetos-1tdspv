n = int(input("Digite um número inteiro positivo: "))

divisor = 1

print(f"Os divisores de {n} são:")

while divisor <= n:
    if n % divisor == 0:
        print(divisor)
    divisor += 1
