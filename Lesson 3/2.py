a = int(input('Введите число a - '))
b = int(input('Введите число b - '))
if a < b:
    for i in range(a, b + 1):
        print(i)
else:
    for i in range(a, b - 1, -1):
        print(i)