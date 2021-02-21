#!/usr/bin/python3


class Dog:
    """One of the objects to be retruned"""

    def speak(self):
        return 'Woof!'

    def __str__(self):
        return "Dog"

class DogFactory:
    """Concrete Factory"""

    def get_pet(self):
        """Return a Dog object"""
        return Dog()

    def get_food(self):
        """Return a food object"""
        return 'Dog Food!'

class PetStore:
    """Petstore houses our Abstract Factory"""

    def __init__(self, pet_factory=None):
        """pet_factory is our abstract fatory"""
        self._pet_factory = pet_factory

    def show_pet(self):
        """Utility method to display the objects returned by the DogFactory"""
        pet = self._pet_factory.get_pet()
        pet_food = self._pet_factory.get_food()

        print(f'Our pet is: {pet}')
        print(f'Our pet says hello by {pet.speak()}')
        print(f'Its food is: {pet_food}')

# Create a croncrete factory
factory = DogFactory()

#Created a pet store
shop = PetStore(factory)

shop.show_pet()