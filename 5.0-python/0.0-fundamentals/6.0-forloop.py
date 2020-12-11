
def power_Number(base_number, pow_number):
    result = 1

    for i in range(pow_number):  
        result = result * base_number
    return result

if __name__ == "__main__":
    print(power_Number(5,3))