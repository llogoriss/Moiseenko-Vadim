# -*- coding: utf-8 -*-
def c():
    n = int(input("Введите количество чисел - "))
    a = 0
    b = 1
    sum = 1
    for i in range(2, n):
        k = b
        b = a + b
        a = k
        sum += b
    print("Ответ:")
    return sum
print(c())