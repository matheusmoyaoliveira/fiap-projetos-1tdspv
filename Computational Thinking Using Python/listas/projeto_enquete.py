def menu() -> int:
    print("SISTEMA ENQUETE")
    print("1) cadastra pergunta")
    print("2) visualiza perguntas")
    print("3) apaga pergunta")
    print("4) sair")
    return int(input("Opção: "))

#INICIO PROGRAMA (main)
opcao = 0
while opcao != 4:
    opcao = menu()
    if opcao == 1:
        print("cadastra pergunta")
    elif opcao == 2:
        print("visualiza perguntas")
    elif opcao == 3:
        print("apaga pergunta")
    elif opcao == 4:
        print("Saindo...")