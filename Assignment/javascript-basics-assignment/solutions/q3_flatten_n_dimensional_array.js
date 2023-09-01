/* Write a Program to Flatten a given n-dimensional array */

const flatten = (arr) => {

	if(arr=="invalid value"){
		return null;
	}
// const ans=[].concat(...arr);

const ans=arr.flat(Infinity);



	return ans;
	// Write your code here
};

/* For example,
INPUT - flatten([1, [2, 3], [[4], [5]])
OUTPUT - [ 1, 2, 3, 4, 5 ]

*/

module.exports = flatten;
