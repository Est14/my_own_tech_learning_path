const express = require('express')

// Esto devuelve un objecto el cual es el server 
app = express()

app.get('/', (req, res) => {
    res.send('Hello world')
})

app.get('/about', (req, res) => {
    res.send('About me')
})

app.listen(3000, () => {
    console.log('Server Port: 3000')
})