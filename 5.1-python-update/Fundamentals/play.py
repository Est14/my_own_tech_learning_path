import random


def run():
    print("Welcome To Play Guest The Number")
    NUMBER_ = random.randint(1, 101)
    print('Please enter a number between 1 and 100: ', end='')
    while True:
        number = int(input())
        if number == NUMBER_:
            print(f'Congrats the number is: {number}')
            break
        elif number < NUMBER_:
            print('The number is Higer: ', end='')
        elif number > NUMBER_:
            print('The number is Lower: ', end='')
    

if __name__ == '__main__':
    run()