function returnNumberOfChar(arr){

    if (typeof arr === 'string'){
        for (var i = 0; i < arr.length; i++){
        }
        return i;
    }
    console.log('Por favor introduzca un string')    
}

console.log(returnNumberOfChar('Hola Mundo'))
console.log(returnNumberOfChar(1))
