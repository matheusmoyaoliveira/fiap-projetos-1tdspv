# Multiplicador de horas extras:
m = 1.5

# Horas de Trabalho Regular por mes:
Horario_de_Trabalho_Regular = int(input('quantas horas trabalha por mês?: '))

# número de horas extras por mês
n = int(input('Quantas horas extras você trabalhou este mês?: '))

# Pagamento regular por hora
Pagamento_regular_por_hora = float(input('Quanto é o seu salário por hora?: '))

# Pagamento de horas extras
Pagamento_de_horas_extras= m * Pagamento_regular_por_hora

# Pagamento de hora extra
Pagamento_de_hora_extra = n * Pagamento_de_horas_extras

# Pagamento Regular
Pagamento_Regular = Horario_de_Trabalho_Regular * Pagamento_regular_por_hora

# Pagamento total
Pagamento_total = Pagamento_Regular + Pagamento_de_hora_extra


print(f'Pagamento de horas extras: R$ {Pagamento_de_horas_extras:,.2f} por hora ')
print(f'Pagamento total de horas extras: R$ {Pagamento_de_hora_extra:,.2f} por mês ')
print(f'Pagamento Regular Total: R$ {Pagamento_Regular:,.2f} Por Mês ')
print(f'Pagamento Total: R$ {Pagamento_total:,.2f} por mês ')
