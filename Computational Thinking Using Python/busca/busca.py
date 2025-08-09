def busca(lista: list, valor: float) -> int:
    i = 0
    while i < len(lista) and lista[i] != valor:
        i += 1

    if i == len(lista):
        return -1
    else:
        return i
    
def busca_for(lista: list, valor: float) -> int:
    for i in range(len(lista)):
        if lista[i] == valor:
            return i
        
    return -1    

def buscaBinaria(vet, x):
    inicio = 0
    fim = len(vet) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if vet[meio] > x:
            fim = meio - 1
        elif vet[meio] < x:
            inicio = meio + 1
        else:
            return meio
    return -1
