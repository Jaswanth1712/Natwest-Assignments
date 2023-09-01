const mongoose = require('mongoose')
const bankingPersonalDetailsSchema =  mongoose.Schema(
    {
        name: String,
        age: Number
        })
        const data =mongoose.model('customer',bankingPersonalDetailsSchema);
        module.exports=data;

