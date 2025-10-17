import oracledb

def consulta_viacep(cep):
    end = {
        'logradouro': 'Av Paulista',
        'bairro': 'Bela Vista',
        'cidade': 'São Paulo',
        'cep': cep
    }
    return end

def get_conexao():
    return oracledb.connect(user="rm562822", password="130997", dsn="oracle.fiap.com.br/orcl")

def insere_cliente(cliente):
    with get_conexao() as con:
        with con.cursor() as cur:
            sql = "inserto into cliente(nome, telefone, documento) values (:nome, :telefone, :documento) returning id into :id"

            new_var = cur.var(oracledb.NUMBER)
            cliente['id'] = new_var

            cur.execute(sql, cliente)
            cliente['id'] = new_var.getvalue()[0]
        con.commit()

def insere_endereco(endereco, id_cliente):
    with get_conexao() as con:
        with con.cursor() as cur:
            sql = "inserto into endereco(logradouro, bairro, cep, cidade, pessoa_id) values (:logradouro, :bairro, :cep, :cidade, :pessoa_id)"

            endereco['pessoa_id'] = id_cliente
            cur.execute(sql, endereco)
        con.commit()

def insere_conta(cliente: dict):
    with get_conexao() as con:
        with con.cursor() as cur:
            sql = "select sq_numero.nextval from dual;"
            cur.execute(sql)
            registro = cur.fetchone()
            id_conta = registro[0]
            print(f"Conta: {id_conta}")

            sql = "inserto into cliente(tipo, numero, senha, saldo, cliente_id) values ('corrente', :id_conta, 'admin', 0, :cliente_id)"

            info = {"id_conta": id_conta, "cliente_id": cliente['id']}
            cur.execute(sql, info)
        con.commit()