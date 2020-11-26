import random

def binary_search(list, start, end, objetive, counter = 0):

    counter += 1
    if start > end:
        return False, counter
    
    middle = (start + end) // 2
    
    if list[middle] == objetive:
        return True, counter

    elif list[middle] < objetive:
        return binary_search(list, middle+1, end, objetive, counter=counter)

    else:
        return binary_search(list, start, middle-1, objetive, counter=counter)


if __name__ == '__main__':
    size_of_list =  int(input('What size will the list be?: '))
    objetive = int(input('What number do you want find?: '))
    list = sorted([random.randint(0, 1000) for i in range(size_of_list)])
    find, counter = binary_search(list, 0, len(list), objetive, counter=0)
    print(f'The number of iterations were {counter}')
    print(f'The numbers {objetive} {"is" if find else "is not"} in the list')