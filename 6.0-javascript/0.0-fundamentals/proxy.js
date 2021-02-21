const persona = {
    nombre:"",
    apellido:"",
    edad:0
}

const manejador = {
    set(obj, prop, valor){
        if (Object.keys(obj).indexOf(prop) === -1){
            return console.error(
                `La propiedad ${prop} no esta permitida en el obj persona`);
        }
        if(
            prop === 'nombre' || prop === 'apellido'
        ){
            return console.log('Solo acepta letras');
        }
        obj[prop] = valor
    }
}
const ivan = new Proxy(persona, manejador)
ivan.nombre = 'Ivan'
ivan.apellido = 'Martinez'
ivan.edad = 17
ivan.twitter = '@ivan16'

console.log(ivan);