// function sqrCallback(value, callback) {
//   setTimeout(() => {
//     callback(value);
//   }, 0 | (Math.random() * 100));
// }

// sqrCallback(3, (value) => {
//   console.log(value * value);
// });

// console.log("Posicionado despues del callback");

function getData(callback){
    setTimeout(callback,200)
}

getData(() => {
    console.log('Take your Data');
});

console.log('After the callback');
