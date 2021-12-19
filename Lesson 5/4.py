# -*- coding: utf-8 -*-

def lin():
    x = int(input("Введите первое число - "))
    y = int(input("Введите второе число - "))
    a = 1
    while x < y:
        x *= 1.1
        a+=1
    print(a)
    return "Конец"
print(lin())