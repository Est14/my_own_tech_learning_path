
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

var santi = {
    nombre: 'Dario',
    apellido: 'Juarez',
    altura: 1.71,
    cantidadDeLibros: 90
}

var vicky = {
    nombre: 'Vicky',
    apellido: 'Zapata',
    altura: 1.56,
    cantidadDeLibros: 91
}

var paula = {
    nombre: 'Paula',
    apellido: 'Barros',
    altura: 1.76,
    cantidadDeLibros: 182
}

var ivan = {
    nombre: 'Ivan',
    apellido: 'Barros',
    altura: 1.73,
    cantidadDeLibros: 182
}

var people = [esteban, martin, santi, vicky, paula]

people[0].nombre
people[0]['nombre']


// Add an element in array

people.push(ivan)  // This method adds a new element to the end of the array


// remove the last element 

people.pop()  // This method removes the last element from the end of the array


// remove the first element 

people.shift()  // This method remove the first element from the start of the array


// Add an element to the beginning

people.unshift(ivan)



// Add an element in wherever place

var names = ['esteban','carlos','laura','vaneza'];

names.join();
names.splice(2,0,'ivan');





// Filter array 

const istall = person => person.altura >= 1.73

var tallPersons = people.filter(istall)  // The function filter has another function as a parameter 


// Transfor an array

const isShort = person => ({     // This is another way to return an object
    ...person,
    altura: person.altura * 100
})

var shortPerson = people.map(isShort)  // The function map has another function as a parameter



// Iter an array 

for (var i = 0; i < people.length; i++) {
    console.log(`${people[i].nombre} is ${people[i].altura} meters tall`)
}


// Reduce an array
const reducer = (acum, person) => acum + person.cantidadDeLibros

var totalBooks = people.reduce(reducer, 0)
