tupla = [('Joao', 25), ('ana', 30), ('Ana', 18), ('Beatriz', 22), ('joao', 20)]

def insertion(tupla: tuple):

    for i in range(1, len(tupla)):

        key = tupla[i]

        j = i - 1

        while j >= 0 and (
            tupla[j][0].lower() > key[0].lower() or
            (tupla[j][0].lower() == key[0].lower() and tupla[j][1] > key[1])
            ):
                print(
                        f"[DEBUG] Comparando: {tupla[j]}  com  {key}  |  "
                        f"nomes: {tupla[j][0].lower()} vs {key[0].lower()}  |  "
                        f"idades: {tupla[j][1]} vs {key[1]}\n"
                )

                tupla[j+1] = tupla[j]
                j -= 1

        tupla[j+1] = key
        print(tupla)

    return tupla

print(f"\n RESULTADO: {insertion(tupla)}")