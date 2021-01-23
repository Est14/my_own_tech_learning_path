const mogoose = require('mongoose')
const { Schema } = mogoose

const NoteSchema = new Schema({
    title: { type: String, require: true},
    description: { type: String, require: true},
    date: {type: Date, default: Date.now},
    user: {type: String}
})

module.exports = mogoose.model('Note', NoteSchema)
