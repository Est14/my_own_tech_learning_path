def merge_sort(list):

    if len(list) > 1:
        #1) dividir la lista en sub_lista
        middle = len(list) // 2
        left = list[:middle]
        rigth = list[middle:]

        # Llamada recursia
        merge_sort(left)
        merge_sort(rigth)

        #2) iteradores de sublistas
        i = 0
        j = 0
        k = 0

        while i < len(left) and j < len(rigth):
            if left[i] < rigth[j]:
                list[k] = left[i]
                i += 1
            else:
                list[k] = rigth[j]
                j += 1
            
            k +=1

        while i < len(left):
            list[k] = left[i]
            i += 1
            k +=1

        while j < len(rigth):
            list[k] = rigth[j]
            j += 1
            k += 1


    return list

    

    




if __name__ == '__main__':
    numbers = [6,8,5,8,77,22,54,8,5,8,5,84,8,181,0]
    ol_munbers = merge_sort(numbers)
    print(ol_munbers)