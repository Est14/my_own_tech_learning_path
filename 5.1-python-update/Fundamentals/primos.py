def numeros_primos(number):

    for i in range(number+1):

        if i == 2 or  i == 3 or  i == 5 or  i == 7:
            print(i)
        
        elif i == 1 or i % 2 == 0 or i % 3 == 0 or i % 5 == 0 or i % 7 == 0:
            continue

        else:
            print(i)

def run():
    print('Encuentra los numeros primos')
    number = int(input('Ingrese un nummero: '))
    print(f'Estos son los numeros primos hasta {number}')
    numeros_primos(number)


if __name__ == '__main__':
    run()
