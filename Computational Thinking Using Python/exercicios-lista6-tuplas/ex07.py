def dupla_nome():
    nomes = ("Ana", "Bia", "Celi", "Diana", "Eva", "Fabia")

    for i in range(len(nomes) - 1):
        for j in range(i + 1, len(nomes)):
            print(f'{nomes[i]} e {nomes[j]}')

dupla_nome()
