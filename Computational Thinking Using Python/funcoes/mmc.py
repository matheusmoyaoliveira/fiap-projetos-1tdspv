def mmc(a: int, b: int) -> int:
    multiplo = a
    while multiplo % b != 0:
        multiplo += a
    return multiplo

resposta = mmc(36, 20)
print(resposta)