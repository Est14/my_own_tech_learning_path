function date(callback){
    console.log(new Date);
    setTimeout(() => {
        let new_date = new Date;
        callback(new_date);
    }, 2000);
}

function printDate(new_date){
    console.log(new_date);
}

date(printDate);
