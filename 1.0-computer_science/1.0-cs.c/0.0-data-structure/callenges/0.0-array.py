#!/usr/bin/python3
def printArray(array):
    for i in array:
        print('{} '.format(i), end='')


if __name__ == "__main__":
    array = ['Sofia', 12, 50.0, True]
    printArray(array)
