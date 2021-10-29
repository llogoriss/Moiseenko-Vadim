# -*- coding: utf-8 -*-
def twrp():
    stroka = input("Введите строку - ")
    symbol = input("Введите символ для удаления - ")
    print(stroka.replace(symbol, ""))
    return "Конец"
print(twrp())