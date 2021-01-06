const isBelowThreshold = (currentValue) => currentValue < 30;

// Consult if in all element happend sometihng
const array1 = [1, 30, 39, 29, 10, 13];
console.log(array1.every(isBelowThreshold));
