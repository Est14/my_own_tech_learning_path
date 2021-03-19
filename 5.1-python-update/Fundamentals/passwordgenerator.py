import random

def password_generator():

    mayus = ['A', 'B', 'C', 'E', 'Z', 'I', 'H']
    minus = ['s', 'j', 'f', 'g', 'r']
    simbols = ['#', '%', '$', '!', '/', '&']
    numbers = ['0', '1','2','3','4','5','6','7','8','9']

    characters = mayus + minus + simbols + numbers

    password = []

    for i in range(15):
        password.append(random.choice(characters))

    return ''.join(password)

def run():
    password = password_generator()

    print(f'Your new password is: {password}')


if __name__ == '__main__':
    run()