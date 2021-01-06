
def quicksort(numbers_list):

    left_list = []
    rigth_list = []
    pivot_number = numbers_list[0]

    for i in range(1, len(numbers_list)):

        if numbers_list[i] < pivot_number:
            left_list.append(numbers_list[i])

        else:
            rigth_list.append(numbers_list[i])


    return left_list, pivot_number, rigth_list
  

def run(numbers_list):

    if len(numbers_list) < 2:
        return numbers_list
    
    left_list,  pivot_number, rigth_list = quicksort(numbers_list)

    return run(left_list) + [pivot_number] + run(rigth_list)

    
if __name__ == '__main__':
    numbers_list = [22, 55,1, 0, 7, 7, 33, 11, 73, 22, 37, 28]
    print(run(numbers_list))
    