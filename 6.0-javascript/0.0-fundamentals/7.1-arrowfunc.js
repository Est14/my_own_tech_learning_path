var esteban = {
    name: 'Esteban',
    lastName: 'Martinez',
    age: 28,
}

var ivan = {
    name: 'Ivan',
    lastName: 'Martinez',
    age: 16,
}


const ADULT = 18

function overAge(person){
    return person.age >= ADULT
}

const overAge = person => person.age >= ADULT  // The same but  an anonime function and arrow function
const overAge = ({ age }) => age >= ADULT  // The same but unstructured


function printAge(person){
    if (overAge(person)){
        console.log(`${person.name} is ${person.age} years old, is adult`)
    }else{
        console.log(`${person.name} is ${person.age} years old, is a minor`)
    }
}

printAge(esteban)
printAge(ivan)