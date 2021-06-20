#!/usr/bin/python3
def divisors(num):
        divisors_1 = []
        for i in range(1, num + 1):
            if num % i == 0:
                divisors_1.append(i)
        return divisors_1

def run():
    try:
        num = int(input('Input a number: '))
        if num < 1:
            raise TypeError
        print(divisors(num))
    except ValueError:
        print('Input just a integer')
    except  TypeError:
        print('Only positive numbers diferent to 0 accepted')



if __name__ == '__main__':
    run()
