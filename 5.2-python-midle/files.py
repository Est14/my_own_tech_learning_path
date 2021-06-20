#!/usr/bin/python3
def  read(file):
    numbers = []
    with open(file, 'r', encoding='utf-8') as f:
        for line in f:
            numbers.append(int(line))
    print(numbers)

def write(file):
    names = ['Esteban', 'Ivan', 'Karen', 'Jose', 'Paula']
    with open(file, 'w', encoding='utf-8') as f:
        for name in names:
            f.write(name)
            f.write('\n')

def run():
    file = './files/numbers.txt'
    file_2 = './files/names.txt'
    read(file)
    write(file_2)


if __name__ == '__main__':
    run()