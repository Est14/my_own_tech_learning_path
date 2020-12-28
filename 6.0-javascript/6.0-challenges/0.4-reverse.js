function reverse(str){

        if (typeof str === 'string'){
            let arr = []
            for (let i = str.length - 1; i => 0; i--){
                arr.push(str[i])
            }
            return arr.join()
        }

        return 'Please introduce a string';
}

console.log(reverse('Hello world!'))
