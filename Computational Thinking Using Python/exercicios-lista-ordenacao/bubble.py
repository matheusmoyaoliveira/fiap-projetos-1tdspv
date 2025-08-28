lista = [5, 1, 4, 2, 8]

troquei = bool

def bubble(lista: list):
    n = len(lista)

    for i in range(n-1):
        troquei = False

        for j in range(0, n-2-i):
            if lista[j] > lista[j+1]:
                temp = lista[j]
                lista[j] = lista[j+1]
                lista[j+1] = temp
                
                troquei = True
                
        print(lista)

        if not troquei:
            break
    
    return lista

bubble(lista)