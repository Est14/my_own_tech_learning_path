const userObject = {
    [`id_${Math.round(Math.random()*100+5)}`]: 'Valor Aleatorio'
}


const users = ['Pipe', 'Ivan', 'Daniela', 'Esteban', 'Miguel']

users.forEach((user, index) => userObject[`id_${index}`] = user)

console.log(userObject);