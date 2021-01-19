const express = require('express')
const path = require('path')
const exphbs = require('express-handlebars')


// Initializations 
const app = express()


// Settings 
app.set('port', process.env.PORT || 3000)
app.set('views', path.join(__dirname, 'views'))
app.engine('.hbs', exphbs ({
    defaultLayout: 'main',
    layoutsDir: path.join(app.get('views'), 'layouts'),
    partialsDir: ,
    extname:
}))

// Middleware



// Gloval varibles


// Routes 



// Static files 


// Server run
app.listen(app.get('port'), () => {
    console.log(`Server on port ${app.get('port')}`)
})