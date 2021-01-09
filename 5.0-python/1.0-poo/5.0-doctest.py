import doctest
def areaTriangulo(base, altura):
    """Calcula el area de un triangulo 
    multiplicando base x altura / 2

    >>> areaTriangulo(10, 16)
    80.0
    """

    return (base * altura) / 2


if __name__ == "__main__":
    result = areaTriangulo(10, 16)
    # print(result)
    doctest.testmod()
