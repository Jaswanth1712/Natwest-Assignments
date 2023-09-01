const express = require('express');
const MongoClient = require('mongodb').MongoClient;
const bodyParser = require('body-parser');

const app = express();
const jsonParser = bodyParser.json();
const cust_url = 'mongodb://localhost:27017/banking/customer'
const userclient = new MongoClient(cust_url, { useNewUrlParser: true, useUnifiedTopology: true });

const mongoose = require('mongoose');
const data=require('./schema');
const ConnectToDb = require('./Dbservices'); // Import the ConnectToDb function

const router = express.Router();
app.use(express.json());
app.use(express.urlencoded({ extended: false }));


app.post('/bank', async (req, res) => {
    try{
        const data1=await data.create(req.body);
        const result = await userclient.db('banking').collection('customer').insertOne(data1);
        res.status(201).json(result);
    }catch(err){
        console.log(err.message);;
        res.status(500).json({message:err.message});
    }
})
app.listen(3000, (res)=>{
    console.log("On port 3000");
    ConnectToDb();
})  