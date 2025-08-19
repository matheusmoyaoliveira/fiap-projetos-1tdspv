lista = ["João", "Ana", "Carlos", "Beatriz", "Daniel"]

def insertion(lista: list):

    for i in range(1, len(lista)):

        key = lista[i]

        j = i - 1

        while j >= 0 and lista[j].lower() < key.lower():
            lista[j+1] = lista[j]
            j -= 1

        lista[j+1] = key
        print(lista)

    return lista
        
insertion(lista)