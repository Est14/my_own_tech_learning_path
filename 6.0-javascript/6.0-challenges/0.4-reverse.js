function reverse(str){

        if (typeof str === 'string'){
            let arr = []
            for (let i =  0; i < str.length; i++){
                arr.push(str[str.length - (i + 1)])
            }
            return arr.join('')
        }

        return 'Please introduce a string';
}

console.log(reverse('Hola mundo'))
