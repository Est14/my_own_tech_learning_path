// Esta es la forma qe tiene Node de traerse modulos de otro sitio
const express = require("express");
const bodeyParser = require("body-parser");
const router = require('./components/messages/network')


var app = express();
app.use(bodeyParser.json());
app.use(router);



;

// Esta será la ruta para buscar todos los staticos 
app.use('/app', express.static('public'));

app.listen(3000);
console.log(
  "La apliacacion esta escuchando en el puerto http://localhost:3000"
);

