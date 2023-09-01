const express = require('express');
const mongoose = require('mongoose');
const data=require('./models/banking');
const app = express();
const cors=require('cors');
const router = express.Router();
app.use(express.json());
app.use(cors());
app.use(express.urlencoded({ extended: false }));
app.post('/bank', async (req, res) => {
    try{
        const data1=await data.create(req.body);
        res.status(201).json(data1);
    }catch(err){
        console.log(err.message);;
        res.status(500).json({message:err.message});
    }
})
app.get('/personaldetails', async (req, res) => {
    try{
        const data1=await data.find({});
        res.status(201).json(data1);
    }catch(err){
        res.status(500).json({message:err.message})
        }})
        app.get('/personaldetails/:id', async(req, res) =>{
            try {
                const {id} = req.params;
                const data1 = await data.findById(id);
                res.status(200).json(data1);
            } catch (error) {
                res.status(500).json({message: error.message})
            }
        })
app.delete('/personaldetails/:id', async(req, res) =>{
            try {
                const {id} = req.params;
                const data1 = await data.findByIdAndDelete(id);
                if(!data1){
                    return res.status(404).json({message: `cannot find any data1 with ID ${id}`})
                }
                res.status(200).json(data1);
            } catch (error) {
                res.status(500).json({message: error.message})
            }
        })
        app.put('/personaldetails/:id', async(req, res) => {
            try {
                const {id} = req.params;
                const data1 = await data.findByIdAndUpdate(id, req.body);
                if(!data1){
                    return res.status(404).json({message: `cannot find any data1 with ID ${id}`})
                }
                const updateddata = await data.findById(id);
                res.status(200).json(updateddata);
            } catch (error) {
                res.status(500).json({message: error.message})
            }
        })

        app.get('/personaldetails/emailid/:emailid', async (req, res) => {
            try {
                const emaild = req.params;
                const data1 = await data.find(emaild);
                res.status(200).json(data1);
            } catch (error) {
                res.status(500).json({ message: error.message })
            }
        })
        
        app.delete('/deletedetails/:emailid', async (req, res) => {
            try{
                const bank = await data.deleteOne({emailid:req.params.emailid});
                res.status(200).json(bank);
            }
            catch(err){
                console.log(err.message);
                res.status(500).json({message:err.message});
            }
        });

mongoose.
connect('mongodb+srv://jaswanthyerramsetti:Jaswanth@cluster0.la27eny.mongodb.net/Node-API?retryWrites=true&w=majority')
.then(() => {
    console.log('Connected to MongoDB');
    app.listen(3000, () => {
        console.log('Example app listening on port 3000!');
    })
}).catch((err) => {
    console.log('Error connecting to MongoDB', err);
});






