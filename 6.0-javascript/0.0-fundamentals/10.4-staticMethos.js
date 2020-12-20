let fruits = ['Mango', 'Watermelon', 'Pine-apple', 'Orange', 'Mango']
let newArray = new Array()

// Validate if is an istance of array
let validate = Array.isArray(fruits)
console.log(validate);
let validate1 = Array.isArray(newArray)
console.log(newArray);

// Array from an string
var arrToStr = Array.from('Est')
console.log(arrToStr);

// Array from an set
var arrSet = new Set(fruits)
console.log(arrSet);

// And trhis is complety Great!!
console.log(Array.from([1, 2, 3], x => x * x));


// ---------------------------------- //
Array.of(7);       // [7]
Array.of(1, 2, 3); // [1, 2, 3]

Array(7);          // [ , , , , , , ]
Array(1, 2, 3);    // [1, 2, 3]
// --------------------------------- //