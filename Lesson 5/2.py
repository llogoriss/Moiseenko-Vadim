# -*- coding: utf-8 -*-
def lin():
    i = 2
    n = int(input("Введите число больше 2 - "))
    while n % i != 0:
        i += 1
    print(i)
    return "Конец"
print(lin())