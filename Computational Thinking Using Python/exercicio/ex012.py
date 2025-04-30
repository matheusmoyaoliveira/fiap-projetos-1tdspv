rm = 0

rm = int(input('Digite seu RM: '))

rm1 = rm // 10
rest1 = rm1 % 10
rm2 = rm1 // 10
rest2 = rm1 % 10
rm3 = rm2 // 10
rest3 = rm2 % 10
rm4 = rm3 // 10
rest4 = rm3 % 10
rm5 = rm4 // 10
rest5 = rm4 % 10
rm6 = rm5 // 10
rest6 = rm5 % 10

soma = rest1 + rest2 + rest3 + rest4 + rest5 + rest6

print(soma)