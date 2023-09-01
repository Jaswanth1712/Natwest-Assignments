package com.stackroute.basics;
import java.util.*;
public class PhoneNumberValidator {
    Scanner sc=new Scanner(System.in);
    public static String phoneNumber;
    //Create Scanner object as instance variable

    public static void main(String[] args) {
        PhoneNumberValidator pnv=new PhoneNumberValidator();
        pnv.getInput();
        int ans=pnv.validatePhoneNumber(phoneNumber);
        pnv.displayResult(ans);
        pnv.closeScanner();

        //call the functions in the required sequence
    }

    public String getInput() {

        phoneNumber=sc.nextLine();
        return null;
    }

    public void displayResult(int result) {
        //displays the result
        if(result==-1) {
            System.out.println("Empty string");
        }
        else if(result==1) {
            System.out.println("Valid");
        }
        else if(result==0) {
            System.out.println("Invalid ");
        }

    }

    public int validatePhoneNumber(String input) {
        if(input==null || input.isEmpty()) {
            return -1;
        }
        int count =0;

        for(int i=0;i<input.length();i++){
            char current=input.charAt(i);

            if(current >='0' && current <='9'){
                count++;
            }
            else if(current !='-'){
                return 0;
            }


        }

        if(count==10){
            return 1;
        }
         else
        {
            return 0;
        }
    }
    public void closeScanner(){
        sc.close();
        //close the Scanner object
    }
}
