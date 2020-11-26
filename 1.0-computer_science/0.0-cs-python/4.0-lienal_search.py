import random

def lineal_search(list, objetive):
    math = False 

    for element in list:
        if element == objetive:
            math = True 
            break

    return math


if __name__ == '__main__':
    size_of_list =  int(input('What size will the list be?: '))
    objetive = int(input('What number do you want find?: '))
    list = [random.randint(0, 100) for i in range(size_of_list)]
    find = lineal_search(list, objetive)
    print(list)
    print(f'The numbers {objetive} {"is" if find else "is not"} in the list')
