const express = require("express")
const router = express.Router();


router.get('/notes/add', (req, res) => {
    res.render('notes/new-notes')
})

router.post('/notes/new-notes', (req, res) => {
    const {title, description} = req.body
    const errors = []
    if(!title){
        errors.push({text: 'Please write a Title'})
    }
    if (!description){
        errors.push({text:'Please write an Description'})
    }
    if (errors.length > 0){
        res.render('notes/new-notes', {
            errors,
            title,
            description
        })
    }else{
        res.send('ok')
    }
})

router.get('/notes', (req, res) => {
    res.render('notes/new-notes')
})
module.exports = router;
