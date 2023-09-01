package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
    Scanner sc=new Scanner(System.in);
    public static String searchString;
    public static String firstString;
    public static String secondString;

    public static void main(String[] args) {
        //Get three strings from the user
        StringFinder s=new StringFinder();
        s.getInput();
        int ans=s.findString( searchString,  firstString,  secondString);
        s.displayResult(ans);
        s.closeScanner();



    }

    public String getInput() {
        searchString=sc.nextLine();
        firstString=sc.nextLine();
        secondString=sc.nextLine();

        return null;
    }

    public void displayResult(int result) {
        //displays the result
        if(result==-1) {
            System.out.println("Empty string or null");
        }
        else if(result==1) {
            System.out.println("Found as expected");
        }
        else if(result==0) {
            System.out.println("Not found");
        }


    }

    public int findString(String searchString, String firstString, String secondString) {

        if(searchString==null || searchString.isEmpty()|| firstString == null ||firstString.isEmpty() || secondString==null || secondString.isEmpty()  ) {
            return -1;
        }
        int ind1= searchString.indexOf(firstString);
        int ind2= searchString.indexOf(secondString);
         if(ind1<ind2 && ind1!=-1 && ind2!=-1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public void closeScanner() {
        sc.close();
    }
}
