const doSometingsAsync = () => {
    return new Promise((resolve, reject) =>{
        (true)
            ? setTimeout(()=> resolve('Do something assigned'), 2000)
            : reject(new Error('Test Error'))
    })
}

const doAsync = async () => {
    const something = await doSometingsAsync
    console.log(something);
}

