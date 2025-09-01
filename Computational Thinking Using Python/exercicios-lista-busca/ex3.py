def sem_repeticao(A):
    b = []
    for a in A:
        existe = False
        for j in range(len(b)):
            if b[j] == a:
                existe = True
                break
        if existe == False:
            b.append(a)
    return b
