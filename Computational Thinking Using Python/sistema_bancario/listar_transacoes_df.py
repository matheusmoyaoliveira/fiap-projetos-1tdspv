import pandas as pd
from banco import listar_transacoes

id_conta = int(input("Digite o ID da conta: "))
dados = listar_transacoes(id_conta)

df = pd.DataFrame(dados, columns=["ID", "Valor", "Data", "Contraparte", "Tipo"])
print(df)