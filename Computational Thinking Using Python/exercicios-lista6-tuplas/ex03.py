def maior_numero():
    tupla = (1, 3, 9, 20, 40, 57, 94)
    maior_n = tupla[0]

    for numero in tupla:
        if numero > maior_n:
            maior_n = numero

    return maior_n

print(maior_numero())


