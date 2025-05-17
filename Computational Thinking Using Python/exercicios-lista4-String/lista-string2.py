frase = 'Manga'
formando_frase = ''
for i in range(len(frase)):
    formando_frase += frase[1]
    if i < len(frase) - 1:
        formando_frase += ' '
print(formando_frase)