function powPromise(base, pow){
    return new Promise((res, rej) => {
        var result = 0;
        setTimeout((base, pow) => {
            
            for (let i = 1; i <= pow; i++){
              if(i==1){
                result += i * base
              }else{
                result *= base
              }
                
            }
            
        }, 2000)

        res(result)
    })
}

powPromise(5, 3)
.then((r) => console.log(r))