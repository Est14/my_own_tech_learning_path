class Areas:

    """ Esta clase calcula las areas de diferentes figuras geometricas
    """

    def areaCuadrado(self, lado):
        """Calcula el area de un cuadrado
        elevando al cuadrado el lado pasodo por parametro
        """

        return f'El area del cuadro es: {lado * lado}'

    def areaRectangulo(self, lado1, lado2):
        """Calcula el area de un rectangulo
        multiplicando los lados pasados por parametro
        """

        return f'El area del rectangulo es: {lado1 * lado2}'


if __name__ == "__main__": 

    # De esta forma imprimimos la documentacion de la funcion
    print(Areas.areaRectangulo.__doc__)

    # Esta es otra forma de imprimir la documentacion
    # help(Areas.areaRectangulo)

    # Esto nos ofree una ayuda general de la clase
    help(Areas)
