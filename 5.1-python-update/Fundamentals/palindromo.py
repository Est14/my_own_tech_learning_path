def palidrome(string):
    copy_string = string.lower().replace(' ', '')
    
    if copy_string == copy_string[::-1]:
        return True
    else:
        return False



if __name__ == '__main__':
    word = input('Digite una palabra: ')
    print(palidrome(word))