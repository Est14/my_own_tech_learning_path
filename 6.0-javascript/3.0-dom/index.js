console.log('*************Elementos del Documento*****************');
// Esto es todo el mapeado del documento
console.log(document);
// Esto es el documento como tal desde el html
console.log(document.documentElement);

// Obteniendo elementos del html
console.log(document.getElementById('menu'));
console.log(document.querySelector("#menu"));
console.log(document.querySelectorAll("#menu li"));
console.log(document.querySelectorAll("a"));
console.log(document.querySelector("#menu"));
console.log(document.querySelector(".card"));

//Variables para guardar referencias a elementos del DOM
const $linkDom = document.querySelector(".link-dom")

// Obteniendo contenido html por atributos 
console.log(document.documentElement.getAttribute("lang"));
console.log(document.querySelector(".link-dom").href);
console.log(document.querySelector(".link-dom").getAttribute("href"));
// Pasando valores por medio de atributos a nuestros elementos:
$linkDom.setAttribute("target", "_blank");

