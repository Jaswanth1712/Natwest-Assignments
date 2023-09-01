package com.stackroute.exercises;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {


List<String>array=new ArrayList<>();
    //write here logic to get sorted Array List which is a global class variable
    public String catalogListSorter(List<String> unSortedCatalogList) {

        if(unSortedCatalogList==null ){
            return "The catalog list is null";
        }


        if(unSortedCatalogList.isEmpty()){
            return "The catalog List is empty";
        }

        if(unSortedCatalogList.contains(null) || unSortedCatalogList.contains("") || unSortedCatalogList.contains(" ")){
            return "The catalog List contains empty or null or blank space as a value";
        }

        array=unSortedCatalogList;
        Collections.sort(array);

        return array.toString();
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {


        if(value==null || value.isEmpty() || value.equals(" ")){
            return "Input is not accepted";
        }


        for(String temp:array){

            if(temp.equalsIgnoreCase(value)){
                return "Found: " + temp;
            }
        }


        return "Not Found";
    }
}

