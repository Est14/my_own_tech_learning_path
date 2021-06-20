import math

def run():
    my_dic = {x: x**3 for x in range(1,101)}
    my_dic_2 = {x: math.sqrt(x) for x in range(1, 1001)}

    print(my_dic_2)

if __name__ == '__main__':
    run()