def searchArray(array, elemt):
    size = len(array)
    for i in range (size):
        if (array[i] == elemt):
            return f'The element is in array in the position: {i}'
    return 'The element is not in array'


if __name__ == "__main__":
    array = [1, 2, 3, 4, 5]
    element = 4
    print(searchArray(array, element))