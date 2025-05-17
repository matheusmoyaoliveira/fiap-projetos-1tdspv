import math

def desvio_padrao():
    dados = (10.0, 12.5, 9.0, 14.2, 11.0)
    media = sum(dados) / len(dados)
    soma_diferencas = 0

    for numero in dados:
        valor = (numero - media) ** 2
        soma_diferencas += valor

    desvio = math.sqrt(soma_diferencas / (len(dados) - 1))
    return desvio 

print(desvio_padrao())

