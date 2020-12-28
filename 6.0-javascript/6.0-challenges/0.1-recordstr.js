function recStr(arr, num){

        if (!(typeof arr === 'string'))
            return 'No ingreso una cadena de caracteres'

        if (!(typeof num === 'number'))
            return 'Ingresa un valor numerico'

        let new_arr = []

        for (let i = 0; i < num; i ++){
            new_arr[i] = arr[i]
        }
        return new_arr.join('')
}

console.log(recStr('Hola Mundo', 4))
console.log(recStr('Hello', 'd'))
