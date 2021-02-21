#!/usr/bin/python3


class Dog:
    """A simple Dog class"""

    def __init__(self, name):
        self.name = name

    def speak(self):
        return 'Woof!'


class Cat:
    """A simple Cat class"""

    def __init__(self, name):
        self.name = name

    def speak(self):
        return 'Meow!'


def get_pet(pet='dog'):
    """The factory method """
    pets = {'dog':Dog('Firulais'), 'cat': Cat('Simon')}
    return pets[pet]


d = get_pet('dog')
c = get_pet('cat')

print(f'{d.name} say {d.speak()}')
print(f'{c.name} say {c.speak()}')
