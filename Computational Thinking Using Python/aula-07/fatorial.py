n = int(input('Informe n: '))


def fatoria(n):
    while n >= 1:
        prod = prod * n
        n = n - 1
    return prod

print(n)
