import banco

def cadastra_empresa(empresa: dict):
    veiculos = empresa['veiculos']
    banco.salva_pessoa(empresa)
    for veiculo in veiculos:
        veiculo['proprietario_id'] = empresa['id']
        banco.salva_veiculo(veiculo)
    
if __name__ == "__main__":
    dado = {
        "nome": "HERTZ",
        "documento": "55.728.082/0001-82",
        "telefone": "(11) 72343-9202",
        "url": "www.hertz.com",
        "veiculos": [
            {"placa": "HWR-2I38", "montadora": "Audi", "modelo": "Q3", "ano": 2020},
            {"placa": "KJR-0E65", "montadora": "BMW", "modelo": "325i", "ano": 2023},
            {"placa": "EHK-5F90", "montadora": "Mercedes", "modelo": "C160", "ano": 2025}  
        ]
    }

    cadastra_empresa(dado)

    resultados = banco.consulta_tudo()
    for info in resultados:
        print(info)