const express = require("express");

// Esto devuelve un objecto el cual es el server
app = express();
//Esta linea de codigo es para decirle a express que entienda json
app.use(express.json());

app.all('/', (req, res, next) => {
    console.log('Por aqui paso')
})

app.get("/", (req, res) => {
  res.send("Peticion Get");
});

//Con :id lo poenmos como variable y ahora nuestra ruta puede recir datos
app.post("/about/:id", (req, res) => {
  console.log(req.body);
  // De esta forma tomamos los datos de la variable id
  console.log(req.params);
  res.send("About me");
});

app.put("/about", (req, res) => {
  res.send("About me");
});

app.delete("/about", (req, res) => {
  res.send("About me");
});

app.listen(3000, () => {
  console.log("Server Port: 3000");
});
