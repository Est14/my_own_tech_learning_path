let numbers =[1, 2, 4, 66, 77, 80, 101, 0, 5]

for (let i = 0; i < numbers.length; i++){
    console.log(numbers[i])
    if ( numbers[i] === 77)
        break;
}

for (let i = 0; i < numbers.length; i++){
    if ( numbers[i] === 77)
        continue;
    console.log(numbers[i])
}