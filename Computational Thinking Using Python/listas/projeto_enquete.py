def menu() -> int:
    print("SISTEMA ENQUETE")
    print("1) cadastra pergunta")
    print("2) visualiza perguntas")
    print("3) apaga pergunta")
    print("4) aplica perguntas")
    print("5) sair")
    return int(input("Opção: "))

def cadastra_pergunta(lista: list):
    num = int(input("Número: "))
    enum = input("Enunciado: ")
    tipo = input("Tipo: ")
    alternativas = None
    if tipo != 'aberta':
        #coletar as alternativas
        alternativas = []
        i = 1
        aux = input(f"alt {i}: ")
        while aux != "":
            alternativas.append(aux)
            i = i + 1
            aux = input(f"alt {i}: ")
    
    lista.append(num)
    lista.append(enum)
    lista.append(tipo)
    lista.append(alternativas)

def monta_alternativas(opcoes: list) -> str:
    resp = ""
    opcoes = "abcdefghijk"
    i = 0
    while i < len(opcoes):
        resp = resp + f"\t{opcoes[i]}) {opcoes[i]}\n"
        i = i + 1
    return resp 

def aplica_enquete(perguntas: list, respostas: list):
    i = 0
    while i < len(perguntas):
        print(f"{perguntas[i]}) {perguntas[i+1]}")
        if perguntas[i+2] != 'aberta':
            info = monta_alternativas(perguntas[i+3])
            print(info)
        
        resp = input("Resp: ")
        respostas.append(resp)
        i = i + 4


lista = []
respostas = []
opcao = 0
while opcao != 5:
    opcao = menu()
    if opcao == 1:
        cadastra_pergunta(lista)
    elif opcao == 2:
        print(lista)
    elif opcao == 3:
        print("apaga pergunta")
    elif opcao == 4:
        aplica_enquete(lista, resposta)
    elif opcao == 5:
