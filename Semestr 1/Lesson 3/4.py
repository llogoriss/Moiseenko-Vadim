# -*- coding: utf-8 -*-
def c():
    s = 0
    n = int(input('Введите число N - '))
    for i in range(n):
        a = int(input('Введите число - '))
        s += a
    print('Сумма всех чисел равна', s)
    return 'Конец'
print(c())