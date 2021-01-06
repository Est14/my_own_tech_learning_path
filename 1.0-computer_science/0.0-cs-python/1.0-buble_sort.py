

def bublesort(list):

    size_list = len(list)

    for i in range(size_list):
        for j in range(0, size_list -i -1):
            if list[j] > list[j+1]:
                list[j], list[j+1] = list[j+1], list[j]
    return list


if __name__ == '__main__':
    numbers = [6,8,5,8,77,22,54,8,5,8,5,84,8,181,0]
    ol_munbers = bublesort(numbers)
    print(ol_munbers)