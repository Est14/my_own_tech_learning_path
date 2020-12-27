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
    this.raza = null
    }

    description(){
        console.log(`Type: Dog\nName: ${this.name}\nGender: ${this.gender}\nAge: ${this.age}`)
    }

    // Un metodo static es el que se puede llamar si instanciar la clase
    static whatYouAre(){
        console.log('I am a kind of domestic animal')
    }

    // Defniendo getters and setters
    // Getter
    get getRaza(){
        return this.raza
    }

    // Setter
    set setRaza(raza){
        this.raza = raza
    }

}


const dog = new Dog('Firulais','male', 5)
const dog1 = new Dog('Lazy','female', 3)
const cat = new Animal('Simon','male')
const parrot = new Animal('bernardo','male')

console.log('\n')
Dog.whatYouAre() // Aqui llamamos a nuestro metodo static
dog.description()
console.log('---------------------')
cat.description()
console.log('---------------------')
dog1.description()
console.log('---------------------')
parrot.description()

// Jacascript maneja los setter y getters como atributo no como metodos
dog.setRaza = 'Pastor Aleman'
console.log(dog.getRaza)
