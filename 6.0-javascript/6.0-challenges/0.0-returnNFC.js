
const returnNumberOfChar = (arr = '') => (arr == '' || typeof arr != 'string') 
? 'La cadena indresada no es valida'  : arr.length
   

console.log(returnNumberOfChar('Hola Mundo'))
console.log(returnNumberOfChar(1))
console.log(returnNumberOfChar())
