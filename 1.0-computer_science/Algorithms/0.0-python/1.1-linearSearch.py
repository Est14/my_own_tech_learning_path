def linearSearch(arr=[], target=0):

    for i in arr:
        if i == target:
            return True
    
    return False

arr = [-2, 3, 4, 7, 8, 9, 11, 13]
target = 7
print(linearSearch(arr, target))
