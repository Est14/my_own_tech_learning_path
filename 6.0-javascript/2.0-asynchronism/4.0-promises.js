function strPromise(value){
    return new Promise((res, rej) => {
        setTimeout(() => {
            res(value*value)
        }, 1000)
    })
}

strPromise(5)
.then((v) => { console.log(v)
    return strPromise(100)
})
.then((v) => {
    console.log(v);
    return strPromise(200)
})
.then((v) => console.log(v))