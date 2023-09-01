package com.stackroute.commonjavaclasses;

public class WrapperClassConvert {

    //write logic to determine and convert given primitive type to its wrapper class and return result
    public Object convertToWrapper(Object input) {


        if (input == null ||!checkPrimitive(input)) {
            return "Give proper primitive type as input";
        }

       if (input instanceof Short ||input instanceof Byte|| input instanceof Integer||input instanceof Long
               || input instanceof Float||input instanceof Character||input instanceof Boolean||input instanceof Double) {
            return  input;
        }
        else {
            return "Give proper primitive type as input";
        }
    }

    public boolean checkPrimitive(Object input) {
        return   input instanceof Byte ||
                input instanceof Short ||
                input instanceof Integer ||
                input instanceof Long ||
                input instanceof Float ||
                input instanceof Double ||
                input instanceof Character ||
                input instanceof Boolean;
    }

}