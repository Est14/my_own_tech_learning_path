def binarySearch(arr=[], target=0):
    low = 0
    high = len(arr) - 1


    while low <= high:

        mid = (low + high) // 2

        if arr[mid] == target:
            return mid
        
        elif arr[mid] < target:
            low = mid + 1
            
        else:
            high = mid - 1

    return -1

        
arr = [-2, 3, 4, 7, 8, 9, 11, 13]
target = 6
print(binarySearch(arr, target))
