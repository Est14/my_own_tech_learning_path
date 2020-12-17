const person = () => {
    let name = 'Name'

    return {
        getName: () => {  // With this function an protect my variable name
            return name
        },

        setName: (value) => {
            name = value   // This is another varible called the same way
        }
    }
}

const newPerson = person()
console.log(newPerson.getName())
newPerson.name = 'Jousmo'
console.log(newPerson.name)
console.log(newPerson.getName())
