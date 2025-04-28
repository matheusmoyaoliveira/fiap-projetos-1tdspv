f = 50

print('Fahrenheit | Celsius')
print('-' * 21)

while f <= 150:
    celsius = 5 / 9 * (f - 32)
    print(f'{f:<10} | {celsius:.2f}')
    f += 1



