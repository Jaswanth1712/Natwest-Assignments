/* Write a Program to convert an array of objects to an object
	based on a given key */


const convert = (arr) => {
	const result = {};


	if(!Array.isArray(arr)){
		return null;
	}
	if(arr==null ){ 
		return 'invalid value';
	}
    const key='role';
    for (const obj of arr) {


    
		 const keyValue = obj[key];
		  result[keyValue] = obj;
	
    }
    
    return result;
	// Write your code here
};

/* For example,
INPUT - convert([{id: 1, value: 'abc'}, {id: 2, value: 'xyz'}], 'id')
OUTPUT - {
			'1': {id: 1, value: 'abc'},
			'2': {id: 2, value: 'xyz'}
		 }


*/

module.exports = convert;
