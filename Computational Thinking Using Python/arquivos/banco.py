import oracledb

def get_conexao():
    return oracledb.connect(user="rm562822", password="130997", dsn="oracle.fiap.com.br/orcl")

def recupera_pelo_nome(nome: str) -> dict:
    """se o time nao existir no banco, você deverá retornar None caso contrário, retorne um
    dicionário contendo todas aunas presentes na tabela time"""

def insere_time(time: dict):
    """realiza a inserção do time na tabela do banco de dados não esqueça de pegar o id
    gerado pelo banco de dados."""

def atualiza_time(time: dict):
    """atualiza os times que participaram"""