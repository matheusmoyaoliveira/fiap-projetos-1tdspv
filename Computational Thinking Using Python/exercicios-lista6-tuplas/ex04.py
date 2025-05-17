def numero_real():
    tupla = (1, 3, 9, 20, 40, 57, 94)

    soma = 0
    quantidade = 0

    for numero in tupla:
        soma += numero
        quantidade += 1

    media = soma / quantidade

    return media

print(numero_real())