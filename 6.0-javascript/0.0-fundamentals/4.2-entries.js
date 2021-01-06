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
let matrix = Object.entries(esteban)
console.log(matrix)
