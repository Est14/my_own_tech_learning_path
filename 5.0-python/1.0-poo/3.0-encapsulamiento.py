#!/usr/bin/python3
"""
Documentation for a car class
"""

class Car:


    def __init__(self, colour='White'):
        # Encasuamos en python cuando ponemmos __ al atributo 
        # De esta manera ya no es accesible desde afuera de la clase
        self.__engine = 'V8'
        self.__chasis_Long = 7
        self.__chasis_width = 3
        self.__tires = 4
        self.doors = 4
        self.__running = False

    
    def features(self):
        print('\nCar\'s features:')
        print(
        f'Motor: {self.__engine}\nChasis: {self.__chasis_Long} x {self.__chasis_width}\nTires {self.__tires}\nDoor: {self.doors} ')

    
    def run(self, runnig=False):

        if runnig:
            print('The car is running')
        else:
            print('The csr is stop')


if __name__ == "__main__":
    car = Car()
    car.features()
    car_2 = Car()
    car_2.doors = 2
    car_2.__engine = 'V7'
    car_2.features()
