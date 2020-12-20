#!/usr/bin/node
function printArray(array){
    for (var i = 0; i < array.length; i++){
        console.log(array[i]);
    }
}

var array = ['Esteban', 12, 50.5, true]
printArray(array)