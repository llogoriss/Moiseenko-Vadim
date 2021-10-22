# -*- coding: utf-8 -*-
def c():
    sum = 0
    n = int(input('Введите число N: '))
    for i in range (1, n + 1):
        sum += i**3
    print(sum)
print(c())