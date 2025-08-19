lista = [3, 13, 45, 32, 75, 28, 55]

lista2 = [5, 7, 13, 18, 23, 29, 33, 36, 38]

def verifica(lista: list):

    for i in range(len(lista) - 1):
        if lista[i] > lista[i+1]:
            return "Lista não está ordenada"
    return "Lista está ordenada"

print(verifica(lista2))