function sum(num1, num2, ...c){
    let result = num1 + num2;
    c.forEach(n => {
        result += n;
    })

    return result;
}

console.log(sum(1,2,10,20,4))

const arr1 = [1,2,3,4,5],
arr2 = [6,7,8,9,0]
const arr3 = [...arr1, ...arr2]
console.log(arr3)