// const MongoClient = require('mongodb').MongoClient
// const url = 'mongodb://127.0.0.1:27017/banking'
// const mongoose = require('mongoose');


// // mongoose.connect(
// //   process.env.MONGO_URL,
 
// //   (err) => {
// //    if(err) console.log(err) 
// //    else console.log("mongdb is connected");
// //   }
// // );

// // Will just hang until mongoose successfully connects

// const Client = new MongoClient(url,{useNewUrlParser: true,useUnifiedTopology: true})
//  const ConnectToDb=(callback)=>{
//     Client.connect((cb)=>{
//         let db=database.db('banking')
//         callback(db)
//     })
//  }

 

//  module.exports=ConnectToDb



// // const MongoClient = require('mongodb').MongoClient;

// // const url = 'mongodb://localhost:27017'; // Replace with your MongoDB URL
// // const dbName = 'natwestbanking';      // Replace with your database name

// // const client = new MongoClient(url, { useNewUrlParser: true, useUnifiedTopology: true });

// // // Connect to the database
// // client.connect((err) => {
// //   if (err) {
// //     console.error('Error connecting to the database:', err);
// //     return;
// //   }

// //   const db = client.db(dbName);

// //   // Now you can perform database operations using the 'db' object

// //   // Example: Query the 'users' collection
// //   const usersCollection = db.collection('users');
// //   usersCollection.find({}).toArray((err, data) => {
// //     if (err) {
// //       console.error('Error querying the database:', err);
// //     } else {
// //       console.log('Fetched data:', data);
// //     }

// //     // Close the connection when done
// //     client.close();
// //   });
// // });




// // const MongoClient = require('mongodb').MongoClient;

// // const url = 'mongodb://localhost:27017'; // MongoDB URL
// // const dbName = 'natwestbanking';      // Your database name

// // const client = new MongoClient(url, {
// //   useNewUrlParser: true,
// //   useUnifiedTopology: true,
// //   serverSelectionTimeoutMS: 30000
// // });

// // async function connectToDatabase() {
// //   try {
// //     await client.connect();
// //     console.log('Connected to MongoDB');

// //     const db = client.db(dbName);

// //     // Perform database operations here

// //     // Close the connection when done
// //     // await client.close();
// //     // console.log('Connection closed');
// //   } catch (error) {
// //     console.error('Error connecting to the database:', error);
// //   }
// // }

// // module.exports=connectToDatabase();


const MongoClient = require('mongodb').MongoClient;
const url = 'mongodb://localhost:27017/';
const mongoose = require('mongoose')

const Client = new MongoClient(url, { useNewUrlParser: true, useUnifiedTopology: true });

const ConnectToDb =async() => {
      try{
        await mongoose.connect(url).then(()=>
        console.log("Connnected")).catch((err)=>console.log(err))
      }catch(err)
      {
        console.log(err)
      }
        // if (err) {
        //     console.error('Error connecting to MongoDB:', err);
        //     return;
        // }
        // awai mon
        // console.error('connected to MongoDB:')
        // const db = Client.db('banking');
        // callback(db);
     }

module.exports = ConnectToDb;
