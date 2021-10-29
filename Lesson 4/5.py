# -*- coding: utf-8 -*-
def twrp():
    s=input()
    if s.count('f')==1:
        print(s.find('f'))
    elif s.count('f')>=2:
        print(s.find('f'), s.rfind('f'))
    return "Конец"
print(twrp())