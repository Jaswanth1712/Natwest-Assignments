/* Write a program to build a `Pyramid of stars` of given height */

const buildPyramid = (h) => {

     if(h<0)
    { 
          return 'invalid value';
     }
 let s="";
 let k=h;
     for(let i=1;i<=h;i++){

        
          for(let j=0;j<=h;j++){
               
               if(j>=k){
                    s+="* ";
               }
               else{
                    s+=" ";
               }
          }
          k--;
          s+=" \n";
     }

     return s;
	// Write your code here
};

/* For example,
INPUT - buildPyramid(6)
OUTPUT -
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/

module.exports = buildPyramid;
