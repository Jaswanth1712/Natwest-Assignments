package com.stackroute.exercises;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {

    //write here logic to sort a string List
    public String stringSorter(List<String> stringList, String sortingOrder) {


        if( stringList==null||stringList.isEmpty()  ) {
            return "Given stringList or sortingOrder is empty, null or blank space";
        }

        if(stringList.contains(null) || stringList.contains(" ")|| stringList.contains("")){
            return "The list contains an empty or blank space value";
        }
        if(stringList.size()==1) {
            return "The list contains only one value";
        }




        if(sortingOrder==null||sortingOrder.isEmpty() || sortingOrder==" "){
            return "Given stringList or sortingOrder is empty, null or blank space";
        }

        if( sortingOrder.equalsIgnoreCase("asc") || sortingOrder.equalsIgnoreCase("desc") ){
            List<String>ss;
            ss=  stringList.stream().sorted(Comparator.comparing(n->n.toString())).collect(Collectors.toList());

            if(sortingOrder.equalsIgnoreCase("asc") ){
               return ss.toString();
            }
            else{
            Collections.reverse(ss);
            return ss.toString();
            }
        }

        else{
           return "No sorting order present for given string 'demo' , 'asc' for ascending order sort and 'desc' for descending order sort";
//            return "No sorting order present for given string 'sort' , 'asc' for ascending order sort and 'desc' for descending order sort";
        }



    }
}
