# -*- coding: utf-8 -*-
def twrp():
    c=input()
    print(c[(len(c)+1)//2:]+c[:(len(c)+1)//2])
    return "Конец"
print(twrp())