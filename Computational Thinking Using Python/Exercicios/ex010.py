# Usain Bolt é o recordista mundial dos 100 metros rasos com o tempo de 9,58 segundos. Escreva um algoritmo que calcula a velocidade média em m/s e em km/h de um corredor, seu algoritmo recebe como dados de entrada a distância em metros e o tempo em segundos.

distancia = float(input('Digite a distância em metro: '))
tempo = float(input('Digite o tempo em segundos: '))

velocidadems = distancia / tempo
velocidadekm = velocidadems * 3.6

print(f'A velocidade média em m/s é {velocidadems:.2f} e a velocidade média em km/h é {velocidadekm:.2f}.')