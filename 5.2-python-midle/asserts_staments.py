#!/usr/bin/python3
def divisors(num):
        divisors_1 = []
        for i in range(1, num + 1):
            if num % i == 0:
                divisors_1.append(i)
        return divisors_1

def run():
    
    num = input('Input a number: ')

    # Afirmo que num es un numero si no imprie esto
    assert num.isnumeric(), "Debes ingresar un numero"
    assert int(num) > 0, "Debes ingresar un entero positivo mayor a 0"
    print(divisors(int(num)))


if __name__ == '__main__':
    run()
