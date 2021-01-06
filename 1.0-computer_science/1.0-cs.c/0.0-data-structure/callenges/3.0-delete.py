def deleteElement(array, elem):
    size = len(array)
    new_array = []
    for i in range(size):
        if elem == array[i]:
            continue
        new_array.append(array[i])
    return new_array

if __name__ == "__main__":
    array = [1, 2, 3, 4, 5]
    element = 5
    print(array)
    print(deleteElement(array, element))
