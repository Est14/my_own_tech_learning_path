const fs = require('fs');

// This is asyncronus code
fs.writeFile('./text.txt', 'Hello Esteban', (err) =>{
    if (err){
        console.log(`Error: ${err}`)
    }else{
        console.log('File created')
    }
})


fs.readFile('./text.txt', (err, data)=>{
    if (err){
        console.log(err)
    }
    if (data){
        console.log(data.toString())
    }

})
console.log('Last Line')
