def arrInsetElemt(array, elem, ixd):
    new_array = []
    for i in range(len(array)):
        if i == ixd:
            new_array.append(elem)
        else:
            new_array.append(array[i])
        if i == 0:
            new_array.append(array[i])
    return new_array

if __name__ == "__main__":
    array = [1, 2, 3, 4, 5]
    element = 100
    idx = 3
    print(array)
    print(arrInsetElemt(array, element, idx))
