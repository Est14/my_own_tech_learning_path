
var esteban = {
    nombre: 'Esteban',
    apellido: 'Martinez',
    altura: 1.73,
    cantidadDeLibros: 78
}

var martin = {
    nombre: 'Martin',
    apellido: 'Gomez',
    altura: 1.85,
    cantidadDeLibros: 132
}

var ivan = {
    nombre: 'Ivan',
    apellido: 'Barros',
    altura: 1.73,
    cantidadDeLibros: 182
}

var people = [esteban, martin]

people[0].nombre
people[0]['nombre']


// Filter array 

const istall = person => person.altura >= 1.73

var tallPersons = people.filter(istall)  // The function filter has another function as a parameter 


// Transfor an array

const isShort = person => ({     // This is another way to return an object
    ...person,
    altura: person.altura * 100
})

var shortPerson = people.map(isShort)  // The function map has another function as a parameter


// Reduce an array
const reducer = (acum, person) => acum + person.cantidadDeLibros

var totalBooks = people.reduce(reducer, 0)
