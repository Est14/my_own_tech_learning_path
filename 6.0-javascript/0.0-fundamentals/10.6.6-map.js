var numbers = [1, 5, 10, 15];

// Create a new array with the new condition per each element
var doubles = numbers.map(function(x) {
   return x * 2;
});



var numbers = [1, 4, 9];
var roots = numbers.map(function(num) {
    return Math.sqrt(num);
});



var kvArray = [{clave:1, valor:10},
    {clave:2, valor:20},
    {clave:3, valor: 30}];

var reformattedArray = kvArray.map(function(obj){
var rObj = {};
rObj[obj.clave] = obj.valor;
return rObj;
});
