const mongoose = require('mongoose')
const { Schema } = mongoose
const encryp = require('bcryptjs')


const UserSchema = new Schema({
    name: {type: String, require: true},
    email: {type: String, require: true},
    password: {type: String, require: true},
    date: {type: Date, default: Date.now}
})

UserSchema.methods.encryptPassword = async (password) => {
    const salt = await encryp.genSalt(10)
    const hash = encryp.hash(password, salt)
    return hash
}

UserSchema.methods.matchPassword = async function (password){
    return await encryp.compare(password, this.password)
}


module.exports = mongoose.model('User', UserSchema)
