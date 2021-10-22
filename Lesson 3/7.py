# -*- coding: utf-8 -*-
def c():
    fact = 1
    fact_sum = 0
    n = int(input('Введите число n: '))
    for i in range(1, n + 1):
        fact *= i
        fact_sum += fact
    print('Итог: ', fact_sum)
print(c())