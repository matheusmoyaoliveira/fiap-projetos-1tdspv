lista = [8, 3, 5, 4, 9, 1, 2]
pior = [9,8,7,6,5,4,3]
melhor = [1, 2, 3, 4, ]

def insertion(lista: list):

    for i in range(1, len(lista)):

        key = lista[i]

        j = i - 1

        while j >= 0 and lista[j] < key: # Resposta, trocar o sinal de > para <
            lista[j+1] = lista[j]
            j -= 1

        lista[j+1] = key
        print(lista)

    return lista
        
insertion(lista)