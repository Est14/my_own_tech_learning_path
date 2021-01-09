import doctest

def compruebaMail(mail):

    """La funcion compruebaMail evalua un mail
    recibido en busca de la @. Si tiene una @ es correcto
    si tiene más de una @ es incorrecto, si no tiene @ es incorrecto
    si tiene una @ al comienzo o al fina es incorrecto.

    >>> compruebaMail(estebanp@gmail.com)
    True
    >>> compruebaMail(estebanpgmail.com)
    False
    >>> compruebaMail(@estebanpgmail.com)
    False
    >>> compruebaMail(estebanpgmail.com@)

    """

    arroba = mail.count('@')

    if (arroba != 1 or '@' == mail[len(mail) - 1] or '@' == mail[0]): 
        return  False

    else:
        return True


if __name__ == "__main__":
    doctest.testmod()