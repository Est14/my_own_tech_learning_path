let XMLHttpRequest = require('xmlhttprequest').XMLHttpRequest;

function fechData(url_api, callback){
    let xhttp = new XMLHttpRequest();
    xhttp.open('GET', url_api, true)
    xhttp.onreadystatechange = (evenT) => {
        if(xhttp.readyState === 4){
            if (xhttp.statusText === 200){
                callback(null, JSON.parse(xhttp.responseText))
            } else{
                const error = new Error('Error' + url_api);
                return callback(error, null);
            }
        }
    }
    xhttp.send();
}


