class Person{

    constructor(name, lastName, tall){
        this.name = name
        this.lastName = lastName
        this.tall = tall
    }

    hello(fn){
        var {name, lastName} = this
        console.log(`Hello my name is ${name} ${lastName}`)
        if (fn){
            fn(name, lastName)
        }
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

    hello(fn){
        var {name, lastName} = this
        console.log(`Hello my name is ${name} ${lastName} and I am a Developer`)
        if (fn){
            fn(name, lastName, true)
        }
    }

}

function response(name, lastName, isDev){
    console.log(`hello ${name} ${lastName}, whats Up`)
    if (isDev){
        console.log('Great I don\'t know that you\'re a developer, me too')
    }
}


esteban = new Person('Esteban', 'Martinez', 1.73)
jose = new Developer('Jose', 'Martinez', 1.72)
