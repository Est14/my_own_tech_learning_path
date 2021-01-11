class Moto:

    def __init__(self, type='Moto'):
        self.type = type

    def desplazamiento(self):
        print(f'Soy una {self.type} y me desplazo en 2 ruedas')

class Carro:

    def __init__(self, type='Carro'):
        self.type = type

    def desplazamiento(self):
        print(f'Soy una {self.type} y me desplazo en 4 ruedas')


""" Se suponde que esto es polimorfimos,
El poder cambiar de forma """

def desplazamiento(vehiculo):
    vehiculo.desplazamiento()



if __name__ == "__main__":

    moto = Moto()
    carro = Carro()

    desplazamiento(moto)
    desplazamiento(carro)