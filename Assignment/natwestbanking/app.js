const express = require('express');
const bodyParser=require('body-parser');
const jsonParser=bodyParser;

const app = express();
const router = express.Router();
const cors = require('cors');

app.use(cors())
app.use(jsonParser)
router(app)
module.exports = app;
