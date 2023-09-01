package com.stackroute.streams;

import java.util.List;

public class StringFormat {

    //write logic to find the format for given list and return result
    public String findStringFormat(List<Integer> input) {

        if(input==null || input.contains(null) ||input.isEmpty() ) {
            return "Give proper input not empty list";
        }
        String ans= "";

        for(Integer a:input){

            if((ans.length()!=0)){
                ans+=",";
            }
            if(a<0){
                return "Give proper input not negative values";
            }

            else if(a%2==0){
                ans+="even"+a;

            }
            else{
                ans+="odd"+a;
            }
        }




        return ans;
    }
}
