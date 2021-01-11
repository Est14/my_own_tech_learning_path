class Vehiculo:

    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.encendido = False

    def encender(self):
        self.encendido = True

    def apagar(self):
        self.encendido = False

    def info(self):

        print(f'Marca: {self.marca}\nModelo: {self.modelo}')
        if self.encendido:
                print(f'Estado: Encendido')
        else:
            print(f'Estado: Apagado')


class Moto(Vehiculo):

    def __init__(self, marca, modelo, color):
        super().__init__(marca, modelo)
        self.color = color

    def info(self):
        super().info()
        print(f'Color: {self.color}')


if __name__ == "__main__":

    moto = Moto('Yamaha', 'CBR', 'Rojo')
    moto.info()
    print(isinstance(moto, Moto))
    