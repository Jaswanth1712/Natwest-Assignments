const express = require('express');
const bodyParser = require('body-parser');
const connectToDatabase = require('./db');

const app = express();
const port = 3000;

app.use(bodyParser.json());

app.get('/', (req, res) => {
  res.send('Welcome to the CRUD API');
});

app.get('/api/data', async (req, res) => {
  try {
    const db = await connectToDatabase();
    const collection = db.collection('data');
    const data = await collection.find({}).toArray();
    res.json(data);
  } catch (error) {
    res.status(500).json({ error: 'Internal server error' });
  }
});

app.post('/api/data', async (req, res) => {
  try {
    const db = await connectToDatabase();
    const collection = db.collection('data');
    const result = await collection.insertOne(req.body);
    res.json(result);
  } catch (error) {
    res.status(500).json({ error: 'Internal server error' });
  }
});

app.put('/api/data/:id', async (req, res) => {
  try {
    const db = await connectToDatabase();
    const collection = db.collection('data');
    const result = await collection.updateOne(
      { _id: req.params.id },
      { $set: req.body }
    );
    res.json(result);
  } catch (error) {
    res.status(500).json({ error: 'Internal server error' });
  }
});

app.delete('/api/data/:id', async (req, res) => {
  try {
    const db = await connectToDatabase();
    const collection = db.collection('data');
    const result = await collection.deleteOne({ _id: req.params.id });
    res.json(result);
  } catch (error) {
    res.status(500).json({ error: 'Internal server error' });
  }
});

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
