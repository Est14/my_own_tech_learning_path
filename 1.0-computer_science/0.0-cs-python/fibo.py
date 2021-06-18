print('-'* 40)
print('Welcome to Fibo challenge')
print('Insert the amount of fibo range do you want: ', end='')
amount = int(input())

i =  0
j =  0
k = 0

while i < amount:
    print('{}'.format(j + k), end=' ')
    j += 1


    i += 1
    
print()