strWs = (str, char) => {


    if (typeof str === 'string'){
        let arrN = str.split(' ')
        return arrN
       
    }
    return 'Por favor introduzca un string'
}

console.log(strWs('hola que tal', ',' ))
console.log(strWs(['estas bien'], ',' ))
