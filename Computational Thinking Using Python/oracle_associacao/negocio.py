import banco

def cadastra_empresa(empresa: dict):
    veiculos = empresa['veiculos']
    banco.salva_pessoa(empresa)
    for veiculo in veiculos:
        veiculo['proprietario_id'] = empresa['id']
        banco.salva_veiculo(veiculo)
    
if __name__ == "__main__":
    dado = {
        "nome": "Localiza Aluguel de Carros",
        "documento": "85.728.082/0001-82",
        "telefone": "(11) 82343-9202",
        "url": "www.localiza.com",
        "veiculos": [
            {"placa": "GWR-2I38", "montadora": "FIAT", "modelo": "Pulse", "ano": 2023},
            {"placa": "HRT-0E65", "montadora": "Honda", "modelo": "HRV", "ano": 2024},
            {"placa": "CHK-5F72", "montadora": "GM", "modelo": "Onix", "ano": 2021}  
        ]
    }

    cadastra_empresa(dado)