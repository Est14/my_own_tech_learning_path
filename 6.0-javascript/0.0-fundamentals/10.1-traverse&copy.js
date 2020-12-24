let fruits = ['Banana', 'Mango', 'Watermelon', 'Pine-apple']

fruits.forEach((elem, idx, fruits) => console.log(elem, idx))

// Copy and array
console.log(fruits);
let copyFruits = fruits.slice();
copyFruits.push('orange');
console.log(copyFruits);

// Anothe way
const array1 = ['a', 'b', 'c'];
array1.forEach(element => console.log(element));
