# As casas de São Paulo estão recebendo o carnê do IPTU com duas opções de pagamento: à vista ou em 10 vezes. Sua tarefa é desenvolver um programa/algoritmo onde o usuário informa (digita) o valor total à vista e o valor de cada parcela. Seu programa imprime o desconto em percentual dado pela prefeitura para pagamento à vista

valor_total = float(input("Digite o valor total à vista: "))
valor_parcela = float(input("Digite o valor de cada parcela: "))


desconto = (valor_total - (valor_parcela * 10)) / valor_total * 100

print(f'O desconto é de {desconto:.1f}%')

