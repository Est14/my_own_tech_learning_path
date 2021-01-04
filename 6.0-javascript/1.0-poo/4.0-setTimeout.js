
console.log('Este codigo antecede al setTimeout')
setTimeout(() =>{
 console.log('Esto es un setTimeout que se ejecuta cada x tiempo solo una vez.')
}, 2000)

setInterval(() =>{
    console.log('Esto es un setIntervel, se ejectua cada x tiempo y no parar')
}, 1000)
