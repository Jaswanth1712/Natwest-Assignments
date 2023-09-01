const mongoose = require('mongoose')
const bankingPersonalDetailsSchema =  mongoose.Schema(
    {
          firstname:{
            type:String,
            required:[true,'Please enter your firstname']
          },
          middlename:{
             type:String,
             required:[true,'Please enter your middlename']
          },
          lastname:{
            type:String,
             required:[true,'Please enter your lastname']
            },
          fathername:{
            type:String,
            required:[true,'Please enter your fathername']
          },
          mobilenumber:{
            type:String,
            required:[true,'Please enter your mobilenumber']
          },
          emailid:{
            type:String,
            required:[true,'Please enter your emailid']
          },
          Aadharcardnumber:{
            type:String,
            required:[true,'Please enter your Aadharcardnumber']
          },
          dateofbirth:{
            type:String,
            required:[true,'Please enter your dateofbirth']
          },
          occupation:{
            type:String,
            required:[true,'Please enter your occupation']
          },
          address:{
            type:String,
            required:[true,'Please enter your address']
          },
          photo:{
            type:String,
            required:[true,'Please enter your photo']
          },
            
        },
        {
            timestamp:true
        
        })
        const data =mongoose.model('bankingPersonalDetails',bankingPersonalDetailsSchema);
        module.exports=data;