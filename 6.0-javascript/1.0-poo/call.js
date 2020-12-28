function hello(callback){
    console.log('Hola como estas')
    if (callback)
        callback()
}
function returnHello(){
    console.log('Estoy bien gracias')
}

hello(returnHello);
