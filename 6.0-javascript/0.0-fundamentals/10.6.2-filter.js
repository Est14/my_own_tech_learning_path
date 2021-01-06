const words = ['spray', 'limit', 'elite', 'exuberant', 'destruction', 'present'];


// Create a new list with the elements that meet the condition
const result = words.filter(word => word.length > 6);
console.log(result);

function esSuficientementeGrande(elemento) {
    return elemento >= 10;
  }
  const filtrados = [12, 5, 8, 130, 44].filter(esSuficientementeGrande);
  // filters are [12, 130, 44]

