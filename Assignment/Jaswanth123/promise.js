function fetchDataFromserver(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            const data ={id:1, name:"example data"};
            resolve(data);
        }, 1000);
    });

}

fetchDataFromserver().then(data=>{
    console.log("fetched data: ", data);
})
.catch(err=>{
    console.log("error fetching data:", err);
});