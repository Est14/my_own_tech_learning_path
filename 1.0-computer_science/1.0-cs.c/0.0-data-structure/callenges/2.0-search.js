function searchArray(array, elem){
    var size = 0;
    while (array[size] != undefined) size += 1;
    for (var i = 0; i < size; i++)
        if (array[i] === elem) return `The element is in the array in the position: ${i}`;
    return 'The element is not in the array';
}

var array = [1, 2, 3, 4, 5];
var elem = 4;
console.log(searchArray(array, elem));
