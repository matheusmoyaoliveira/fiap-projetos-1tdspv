def menu() -> int:
    opcao = -1
    while opcao != 5:
        o = '''
        1) Converta a frase para maiúscula
        2) Converta a frase para minúscula
        3) Substitua a letra a pela letra o
        4) Conte a quantidade de vogais
        5) Sair'''
        print(o)
        opcao = int(input('Escolha: '))


if opcao == 1:
    print(texto.upper())
elif opcao == 2:
    print(texto.lower)
elif opcao == 3:
    print(texto.replace('a', 'o'))
elif opcao == 4:
    print('Fazer como exercicio!')
elif opcao != 5:
    print('Opção inválida!')





texto = input('Digite uma frase: ')

