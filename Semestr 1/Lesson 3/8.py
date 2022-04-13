# -*- coding: utf-8 -*-
def c():
    n = int(input('Введите число n: '))
    x = ""
    for i in range(1, n + 1):
        x = x + str(i)
        print(x)
    return 'Конец'
print(c())