from ex1 import busca_binaria, busca_linear

lista = [15, 3, 9, 56, 75, 80, 37, 69]

x = int(input("Digite o número que gostaria de achar: "))

busca = input("Digite o tipo de busca que gostaria de usar (Linear/Binaria): ").strip().lower()

if busca == 'Linear':
    pos = busca_linear(lista, x)
else:
    lista_ordenada = [3, 9, 15, 37, 56, 69, 75, 80]
    pos = busca_binaria(lista_ordenada, x)
    
if pos == -1:
    print("Não encontrado")
else:
    print(f"Encontrado na posição {pos}")