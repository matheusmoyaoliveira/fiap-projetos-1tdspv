import oracledb

def get_conexao():
    con = oracledb.connect(user="rm562822", 
                           password="130997", 
                           dsn="oracle.fiap.com.br:1521/orcl",
                           )
    return con

def salva_pessoa(pessoa: dict):
    with get_conexao() as con:
        with con.cursor() as cur:
            sql = "INSERT INTO empresa(nome, telefone, documento, url) VALUES(:nome, :telefone, :documento, :url) returning id into :id" 

            carros = pessoa["veiculos"]
            pessoa.pop("veiculos")
            new_id = cur.var(oracledb.NUMBER)
            pessoa["id"] = new_id
            cur.execute(sql, pessoa)
            pessoa["id"] = new_id.getvalue()[0]
        con.commit()

def salva_veiculo(veiculo: dict):
    with get_conexao() as con:
        with con.cursor() as cur:
            sql = "INSERT INTO carro(modelo, montadora, ano, placa, proprietario_id) VALUES(:modelo, :montadora, :ano, :placa, :proprietario_id) returning id into :id" 

            
            new_id = cur.var(oracledb.NUMBER)
            veiculo["id"] = new_id
            cur.execute(sql, veiculo)
            veiculo["id"] = new_id.getvalue()[0]
        con.commit()