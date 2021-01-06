class Animal{

    constructor(name, gender){
        this.name = name
        this.gender = gender

    }

    description(){
        console.log(`Name: ${this.name}\ngender: ${this.gender}`)
    }
}

// Herencia
class Dog extends Animal{

    constructor(name, gender, age){
    super(name, gender)
    this.age = age
    }

    description(){
        console.log(`Type: Dog\nName: ${this.name}\nGender: ${this.gender}\nAge: ${this.age}`)
    }  
}


const dog = new Dog('Firulais','male', 5)
const dog1 = new Dog('Lazy','female', 3)
const cat = new Animal('Simon','male')
const parrot = new Animal('bernardo','male')

console.log('\n')
dog.description()
console.log('---------------------')
cat.description()
console.log('---------------------')
dog1.description()
console.log('---------------------')
parrot.description()
