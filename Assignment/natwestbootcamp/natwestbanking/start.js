const app=require('./app');
const Client=require('./Dbservices')
app.listen(8080);


const ConnectToDb = require('./Dbservices');

ConnectToDb(db => {
  // Now you have the connected database object 'db'
  // You can perform database operations here
  console.log('Connected to the database');
  
  // Example: Query the database
  
    // Remember to close the connection when you're done
  
  });




  