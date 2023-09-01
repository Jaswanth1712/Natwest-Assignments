package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;
    public static int firstValue;
    public static int secondValue;
    public static int operator;
    public static char c;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Calculator cal= new Calculator();
    c='y';
        cal.getValues(scan);
        String ans=cal.calculate( firstValue,  secondValue,  operator);
        System.out.println(ans);
        while(c=='y'){



            System.out.println("Do you want to try again(y/n)");
             c=scan.next().charAt(0);

            if(c=='y'){
                cal.getValues(scan);
                 ans=cal.calculate( firstValue,  secondValue,  operator);
                System.out.println(ans);

            }
            else{
                return;
            }

        }



    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {




        System.out.println("Enter the first number:");
        firstValue=scan.nextInt();

        System.out.println("Enter the second  number:");
        secondValue=scan.nextInt();

        System.out.println("Enter number beside the operation to perform: ");
        System.out.println(" 1. Add");
        System.out.println(" 2. Subtract");
        System.out.println(" 3. Multiply");
        System.out.println(" 4. Divide");

        operator=scan.nextInt();




    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        String s;

        switch (operator) {
            case 1: {
                s=(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
                break;
            }
            case 2: {
                s=(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
                break;
            }
            case 3: {
                s=(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
                break;
            }
            case 4:{
                if(secondValue==0) {
                    s=("The divider (secondValue) cannot be zero");
                    c='n';

                }
                else {
                    s=(firstValue + " / " + secondValue + " = " + (firstValue / secondValue));

                }
                break;
            }
            default: {
                s=("Entered wrong option " + operator);
                c='n';
                break;
            }
        }






        return s;
    }


}
