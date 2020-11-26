
def select_sort(number):

    for i in range(len(number)):
        print(number)
        for j in range(i+1, len(number)):
            if number[i] > number[j]:
                temp = number[i]
                number[i] = number[j]
                number[j] = temp
    return number

if __name__ == '__main__':
    numbers = [6,8,5,8,77,22,54,8,5,8,5,84,8,181,0]
    ol_munbers = select_sort(numbers)
    