matriz = []

i = 0
for i in range(4):
    matriz.append([0] * 5)


x = 1
for i in range(4):
    j = 0
    while j < 5:
        matriz[i][j] = x
        x += 1
        j += 1

def aumento_for(matriz, valor):
    for i in range(len(matriz)):
        for j in range(len(matriz[i])):
            matriz[i][j] = matriz[i][j] + valor

def aumento_while(matriz, valor):
    i = 0
    while i < len(matriz):
        j = 0
        while j < len(matriz[i]):
            matriz[i][j] = matriz[i][j] + valor
            j += 1
        i += 1

def soma (matA, matB):
    resp = []
    lin = len(matA)
    col = len(matA[0])
    i = 0
    while i < lin:
        resp.append([0] * col)
        j = 0
        while j < col:
            resp[i][j] = matA[i][j] + matB[i][j]
            j += 1
        i += 1


for lin in matriz:
    print(aumento_while)