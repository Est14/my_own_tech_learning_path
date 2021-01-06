
from typing import DefaultDict

try:
    number = int(input('Enter a number: '))
    print(number)
except ValueError as rr:
    print(rr)
except ZeroDivisionError:
    print('Divided by 0')

