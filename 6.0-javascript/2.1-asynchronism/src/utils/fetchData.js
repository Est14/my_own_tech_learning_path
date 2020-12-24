// Esto es para realizar request a un servidor 
let XMLHttpRequest = require('xmlhttprequest').XMLHttpRequest;

// Funcion Principal
const fetchData = (url_api) => {

    return new Promise((resolve, reject) => {
        const xhttp = new XMLHttpRequest();
        xhttp.open('GET', url_api, true) 
        
        // Validacion del llamado
        xhttp.onreadystatechange = event => {
            if(xhttp.readyState === 4){
                (xhttp.status === 200)
                    ? resolve(JSON.parse(xhttp.responseText)) // if  esto es un if unario
                    : reject(new Error('Error', url_api))  // else
            }
        xhttp.send();
        };
    });
};

module.exports = fetchData;
