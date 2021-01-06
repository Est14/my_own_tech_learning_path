var esteban = {
    name: 'Esteban',
    lastName: 'Martinez',
    age: 28,
    engineer: true,
    newspaperman: false,
    data_science: true,
    doctor: false,
    student: true,
    fireman: false
}

var ivan = {
    name: 'Ivan',
    lastName: 'Martinez',
    age: 16,
    engineer: true,
    newspaperman: false,
    data_science: false,
    doctor: false,
    student: true,
    fireman: false
}


function printProfessions(person){

    console.log(`${person.name} is: `)

    if (person.engineer){
        console.log('Engineer')
    }

    if (person.newspaperman){
        console.log('newspaperman')
    }

    if (person.data_science){
        console.log('Data Scientics')
    }

    if (person.doctor){
        console.log('Doctor')
    } else {
        console.log('He\'s not a Doctor')
    }

    if (person.student){
        console.log('Student')
    }

    if (person.fireman){
        console.log('Fireman')
    }
}

printProfessions(esteban)

const ADULT = 18

function overAge(person){
    return person.age >= ADULT
}


function printAge(person){
    if (overAge(person)){
        console.log(`${person.name} is ${person.age} years old, is adult`)
    }else{
        console.log(`${person.name} is ${person.age} years old, is a minor`)
    }
}

printAge(esteban)
printAge(ivan)