# -*- coding: utf-8 -*-
def c():
    n1 = 1
    n = int(input('Введите число n: '))
    for i in range(1, n + 1):
        n1 *= i
    print('Итог:', n1)
print(c())