num = int(input('Digite um número: '))

pali = ''
original = num

while num != 0:
    digito = num % 10
    num = num // 10
    pali = f'{pali}{digito}'
    


digito = ''

if str(original) == pali:
    print(f'O número: {original} é Palindromo: {pali}')
else:
    print(f'Esse número: {original} não é Palindromo: {pali}')

