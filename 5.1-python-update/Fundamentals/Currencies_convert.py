def print_result(convert_currency):
     return f'Usted tiene: *** $ {round(convert_currency, 2)} USD ***'


def convert_currency(user_option = 0, amount = 0):

    if user_option == 1:
        dollar_change = 3550
        convert_pesos_to_dollar = amount / dollar_change
        return print_result(convert_pesos_to_dollar)
        

    elif user_option == 2:
        dollar_change = 72
        convert_pesos_to_dollar = amount / dollar_change
        return print_result(convert_pesos_to_dollar)

    elif user_option == 3:
        dollar_change = 40
        convert_pesos_to_dollar = amount / dollar_change
        return print_result(convert_pesos_to_dollar)

    elif user_option == 0:
        pass



if __name__ == "__main__":
    print("""
        Bienvenido al conversor de modenas

        Elgia una de las moneda a convertir:

        1 - Pesos Colombianos
        2 - Pesos Argentinos
        3 - Pesos Mexicanos

    """)
    user_selection = int(input())
    amount = float(input('Ingrese la cantida: '))
    convert_currency(user_selection, amount)
