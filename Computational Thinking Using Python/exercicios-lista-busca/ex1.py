def busca_linear(a, x):
    for i in range(len(a)):
        if a[i] == x:
            return i
    return -1

def busca_binaria(a_ordenado, x):
    esq = 0
    dir = len(a_ordenado) - 1
    while esq <= dir:
        meio = (esq + dir) // 2
        if a_ordenado[meio] == x:
            return meio
        elif x < a_ordenado[meio]:
            dir = meio - 1
        else:
            esq = meio + 1
    return -1
