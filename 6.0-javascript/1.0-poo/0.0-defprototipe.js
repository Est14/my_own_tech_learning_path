
class Person{

    constructor(name, lastName, tall){
        this.name = name
        this.lastName = lastName
        this.tall = tall
    }

    hello(){
        console.log(`Hello my name is ${this.name} ${this.lastName}`)
    }

    isTall() {
        if (this.tall >= 1.8){
            console.log(`${this.name} is tall`)
        }else{
            console.log(`${this.name} is short`)
        }
    }

}

class Developer extends Person {

    constructor(name, lastName, tall){
        super(name, lastName, tall)
    }

    hello(){
        console.log(`Hello my name is ${this.name} ${this.lastName} and I am a Developer`)
    }

}

esteban = new Person('Esteban', 'Martinez', 1.73)
jose = new Person('Jose', 'Martinez', 1.72)
migue = new Person('Miguel', 'Otalora', 1.8)
dayana = new Person('Dayana', 'Lyton', 1.85)