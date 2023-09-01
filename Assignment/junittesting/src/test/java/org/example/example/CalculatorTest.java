package org.example.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
//    @Test
//    void add() {
//        assertEquals(3, Calculator.add(1,2));
//    }
Calculator bill=null;
    @Test
    void calculatebillamount_input_0() {
        bill= new Calculator(0);
        assertEquals(0, bill.Calculateamount(), 0.001);
    }


    @Test
    void calculatebillamount_input_50() {
        bill= new Calculator(50);
        assertEquals(130, bill.Calculateamount(), 0.001);
    }
    @Test
    public void testcalculatebillamount_input_2() {
        bill=new Calculator(100);
        assertEquals(292.5,bill.Calculateamount());
    }
    @Test
    public void testcalculatebillamount_input_3() {
        bill=new Calculator(200);
        assertEquals(818.5,bill.Calculateamount());
    }
    @Test
    public void testcalculatebillamount_input_4() {
        bill=new Calculator(1000);
        assertEquals(7018.5,bill.Calculateamount());
    }
    @Test
    public void testcalculatebillamount_input_5() {
        bill=new Calculator(5000);
        assertEquals(47018.5,bill.Calculateamoun)());
    }

}