const numbers = [1, 5, 10, 15];

// Create a new array with the new condition per each element
const doubles = numbers.map(function(x) {
   return x * 2;
});



const numbers = [1, 4, 9];
const roots = numbers.map(function(num) {
    return Math.sqrt(num);
});



const kconstray = [{clave:1, valor:10},
    {clave:2, valor:20},
    {clave:3, valor: 30}];

const reformattedArray = kconstray.map(function(obj){
const rObj = {};
rObj[obj.clave] = obj.valor;
return rObj;
});
