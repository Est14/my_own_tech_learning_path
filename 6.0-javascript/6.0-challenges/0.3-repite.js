function repiteStr(str, num){

    if (typeof str === 'string' && typeof num === 'number' ){
       let arr = []
       for (let i = 0; i < num; i++){
           if (i + 1 === num){
                arr.push(str)
           }else{
            arr.push(str + ' ')
           } 
       }
        return arr.join('');
    }
    return 'Por favor introduzca un string'
}

console.log(repiteStr('Hello', 5))
