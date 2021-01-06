const somethingWillHappend = () => {
    return new Promise((resolve, reject) => {

        if (true){
            resolve('We did it!')
        }else {
            reject('upps! we cant\'n do')
        }
         
    })
};

somethingWillHappend()
    .then(response => console.log(response))
    .catch(err => console.error(err))