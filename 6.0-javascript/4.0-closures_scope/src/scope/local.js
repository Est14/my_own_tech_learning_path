const helloWorld = () => {
    const hello = 'Hello world!'   // This varible works as a local varible
    console.log(hello)
}
// helloWorld()

var scope = 'I\'m Global'

const funtionScope = () => {
    var scope = 'I\'m local'
    console.log(scope)
    const func = () => scope
    console.log(func())
}

funtionScope()
console.log(scope)

