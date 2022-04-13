# -*- coding: utf-8 -*-
def twrp():
    c=input()
    print(c[:c.find('h')] + c[c.rfind('h') + 1:])
    return "Конец"
print(twrp())