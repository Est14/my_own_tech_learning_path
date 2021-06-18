function sum(num1, num2){
    return num1 + num2;
}
function calc(num1, num2, call){
    return call(num1, num2);
}
console.log(calc(2,3,sum));

// another callback

function date(call){
    console.log(new Date);
    setTimeout(() =>{
        let date = new Date;
        call(date);
    }, 3000)
    console.log("Estoy despues del call pero como se demora le quite el turno ;)");
}

function printDay(date){
    console.log(date);
}

date(printDay);
