const esteban = {
    name: 'Esteban',
    lastName: 'Martinez',
    hobbies: ['Learn new programing enguage', 'Whact movies', 'Travel', 'Listen music'],
    personalData: {
        email: 'esteban.tvop@gmail.com',
        cel: 3173823509,
        addres: 'Calle bonita Pensilvania'
    },
    profeccion: 'Software engineer',
    hello: function (){
        console.log(`Hello my name is ${this.name}`)
    }
}


console.log(`Hello my name is: ${esteban.name} my favorite hobby is ${esteban.hobbies[2]}
 my phone number is: ${esteban.personalData.cel} and I'm ${esteban.profeccion}`)

esteban.hello();

// Get keys of  object
let keys = Object.keys(esteban)
console.log(keys)
// Get values of object
let values = Object.values(esteban)
console.log(values)
