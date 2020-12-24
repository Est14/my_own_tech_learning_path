let fruits = ['Mango', 'Watermelon', 'Pine-apple']
console.log(fruits)

// Add element to end 
fruits.push('orange')
console.log(fruits)

// Add element to start
fruits.unshift(2)
console.log(fruits)

// Find the idx of a element
console.log(fruits.indexOf('Watermelon'));
console.log('--------------------------------')

// Add an element in wherever place
let fruitsCopy = fruits.slice()
console.log(fruitsCopy)
fruitsCopy.splice(2,0,'Grapes', 1);
console.log(fruitsCopy);

let newArray = [];
newArray.push('Esteban', 'Computers', 'Math', 'Science');
console.log(newArray);

