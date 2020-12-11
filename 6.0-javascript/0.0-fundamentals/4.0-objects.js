var esteban = {
    name: 'Esteban',
    lastName: 'Martinez',
    age: 28
}

var jose = {
    name: 'Jose',
    lastName: 'Martinez',
    age: 27
}

function printNameInUpperCase(persona){
    var name  = persona.name.toUpperCase()
    console.log(name)
}

// Another way to write this pice of code
function printNameInUpperCase(persona){
    console.log(persona.name.toUpperCase())
}

// Another way to write this pice of code
function printNameInUpperCase({name}){
    console.log(name.toUpperCase())
}

// Another way to write this pice of code
function printNameInUpperCase(persona){
    var {name} = persona.toUpperCase()
    console.log(name)
}

printNameInUpperCase(jose)
printNameInUpperCase(esteban)


// Challenge

function printNameAndAge(person){
    var {name} = person
    var {age} = person
    console.log(`Hello my name is ${name} and I am ${age} years old`)
}

printNameAndAge(jose)


// Referen passing !! This is super important 

function happyBirthDay(person){

    return {
        ...person,
        age: person.age + 1
    }
}

