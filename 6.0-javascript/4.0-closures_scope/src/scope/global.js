var hello = 'Hello'                 // This is the way to assign a Global varible
let world = 'Hello World'          // This is a global varible too but the diferent is it's unmutable
const helloWorld = 'Hello world!'  // This is a global varible too but the diferent is it's unmutable

const anotherFuntion = () => {
        console.log(hello)
        console.log(world)
        console.log(helloWorld)
}

anotherFuntion()