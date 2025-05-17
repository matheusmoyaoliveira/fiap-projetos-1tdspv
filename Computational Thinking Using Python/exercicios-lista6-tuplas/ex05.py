def maior_string():
    tupla = ("café", "programação", "sol", "universidade")
    maior_s = tupla[0]

    for string in tupla:
        if len(string) > len(maior_s):
            maior_s = string

    return maior_s

print(maior_string())