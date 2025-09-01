def busca_binaria_intervalo(A, esq, dir, x):
    while esq <= dir:
        meio = (esq + dir) // 2
        if A[meio] == x: return meio
        elif x < A[meio]: dir = meio - 1
        else: esq = meio + 1
    return -1

def pares_soma_binaria(A_ordenado, x):
    achou = False
    for i in range(0, len(A_ordenado) - 1):
        y = x - A_ordenado[i]
        pos = busca_binaria_intervalo(A_ordenado, i+1, len(A_ordenado)-1, y)
        if pos != -1:
            print(f"{A_ordenado[i]} e {A_ordenado[pos]}")
            achou = True
    if not achou:
        print("Nenhum par")
