math = {}
sum = (num1, num2) => num1 + num2
sus = (num1, num2) => num1 - num2
mul = (num1, num2) => num1 * num2
div = (num1, num2) => {

    if(num2 === 0){
        console.log('Zero Division Error')
        return null
    }else{
        return num1 / num2
    }
}

math.sum = sum
math.sus = sus 
math.mul = mul 
math.div = div 

module.exports = math
