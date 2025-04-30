# Entrada de dados
media1 = float(input("Digite a média do 1º semestre: "))
media2 = float(input("Digite a média do 2º semestre: "))
total_aulas = int(input("Digite o total de aulas: "))
aulas_assistidas = int(input("Digite o número de aulas assistidas: "))

# Cálculo da média ponderada
media_final = (media1 * 4 + media2 * 6) / 10

# Cálculo da frequência
frequencia = (aulas_assistidas / total_aulas) * 100

# Exibe média e frequência
print(f"\nMédia final: {media_final:.2f}")
print(f"Frequência: {frequencia:.1f}%")

# Decisão 
if frequencia <= 70:
    print("Resultado: Reprovado por falta.")
elif media_final >= 7:
    print("Resultado: Aprovado.")
elif media_final < 4:
    print("Resultado: Reprovado.")
else:
    print("Resultado: Exame.")
