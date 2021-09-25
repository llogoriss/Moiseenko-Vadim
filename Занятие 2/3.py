# -*- coding: utf-8 -*-
n=int(input('Введите число прошедших минут:'))
n=n%(24*60)
h=n//60
m=n%60
print(h,m)