package com.stackroute.exercises;


public class StringParse {
    //Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) {

      try  {
                int loc=Integer.parseInt(location);

                return sentence.charAt(loc);



        }

      catch(ArithmeticException e){
          System.out.println(e);

        }




        return 0;
    }
}
