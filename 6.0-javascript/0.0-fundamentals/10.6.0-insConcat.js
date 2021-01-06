const array1 = ['a', 'b', 'c'];
const array2 = ['d', 'e', 'f'];
const num3 = [7, 8];

// Concat  arrays
const array3 = array1.concat(array2, num3);
var alpha = ['a', 'b', 'c'];
var alphaNumeric = alpha.concat(1, [2, 3]);
console.log(alphaNumeric);

// Concatenate nested arrays
var num1 = [[1]];
var num2 = [2, [3]];
var nums = num1.concat(num2);
console.log(nums);

