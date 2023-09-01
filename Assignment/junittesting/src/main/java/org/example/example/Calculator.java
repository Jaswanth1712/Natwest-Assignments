package org.example.example;

import java.util.stream.DoubleStream;

public class Calculator {
private int units;
//    static double add(double...operands){
//        return DoubleStream.of(operands).sum();
//    }



    public Calculator(int units){
        this.units=units;
    }

    public double Calculateamount(){
        double amount=0.0;

        if(units>0){

            if(units<=50)  amount=units*2.60;
            else if(units<=100)  amount=130+((units-50)*3.25);
            else if(units<=200)  amount=130+162.50+((units-100)*5.26);

        }
        return amount;
    }


}
