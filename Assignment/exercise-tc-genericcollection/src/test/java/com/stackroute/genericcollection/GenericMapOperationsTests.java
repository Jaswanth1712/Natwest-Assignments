package com.stackroute.genericcollection;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class GenericMapOperationsTests {







    @Test
    public void testSetWithKeyAsString(){
        GenericMapOperations<String, String> generic = new GenericMapOperations<>(5);
        try {
            generic.set("key1", "value1");
            generic.set("key2", "value2");
            generic.set("key3", "value3");
            generic.set("key4", "value4");
            generic.set("key5", "value5");


        } catch (Exception e){
            assertFalse(true);
        }


    }


    @Test
    public void testSetWithOverloadingForString(){
        GenericMapOperations<String, String> generic = new GenericMapOperations<>(5);
        try {
            generic.set("key1", "value1");
            generic.set("key2", "value2");
            generic.set("key3", "value3");
            generic.set("key4", "value4");
            generic.set("key5", "value5");
            generic.set("key6", "value6");


        } catch (Exception e){
            assertFalse(true);
        }
    }



    @Test
    public void testSetWithKeyAsInteger(){
        GenericMapOperations<Integer, Integer> generic = new GenericMapOperations<>(5);
        try {
            generic.set(1, 1);
            generic.set(2, 2);
            generic.set(3, 3);
            generic.set(4, 4);
            generic.set(5, 5);


        } catch (Exception e){
            assertFalse(true);
        }


    }


    @Test
    public void testSetWithOverloadingForInteger(){
        GenericMapOperations<Integer,Integer>generic=new GenericMapOperations<>(5);
        try {
            generic.set(1,1);
            generic.set(2,2);
            generic.set(3,3);
            generic.set(4,4);
            generic.set(5,5);
            generic.set(6,6);

        } catch (Exception e){
            assertFalse(true);
        }


    }

    @Test
    public void testFindWithKeyAsInteger(){
        GenericMapOperations<Integer, Integer> generic = new GenericMapOperations<>(5);
        generic.set(1,2);
        generic.set(2,4);
        generic.set(3,6);
        generic.set(4,8);
        generic.set(5,10);
        assertEquals(4, generic.find(2), "generic[2] = 4");
    }
    @Test
    public void testFindWithKeyAsString(){
        GenericMapOperations<String, String> generic = new GenericMapOperations<>(5);
        generic.set("a","a");
        generic.set("b","b");
        generic.set("c","c");
        generic.set("d","d");
        generic.set("e","e");
        assertEquals("e", generic.find("e"), "generic['e'] = 'e'");
    }





    @Test
    public void testConstructorWithNegativeForInteger() {
        try {
            GenericMapOperations generic = new GenericMapOperations<Integer, Integer>(-5);
        } catch (IllegalArgumentException e){
            assertTrue(true);
        }


    }

    @Test
    public void testConstructorWithNegativeForString(){
        try {
            GenericMapOperations    generic = new GenericMapOperations<String, String>(-5);
        } catch (IllegalArgumentException e){
            assertTrue(true);
        }
    }





    @Test
    public void testSetWithKeyNullPointerExceptionForInteger(){
        try {
            GenericMapOperations    generic  = new GenericMapOperations<Integer, Integer>(5);
            generic.set(null, 5);
        } catch (NullPointerException e){
            assertTrue(true);
        }
    }


    @Test
    public void testSetWithValueNullPointerExceptionForInteger(){
        try {
            GenericMapOperations    generic = new GenericMapOperations<Integer, Integer>(5);
            generic.set(1, null);
        } catch (NullPointerException e){
            assertTrue(true);
        }
    }


    @Test
    public void testSetWithKeyEmptyNullPointerExceptionForString(){
        try {
            GenericMapOperations    generic = new GenericMapOperations<String, String>(5);
            generic.set("", "a");
        } catch (NullPointerException e){
            assertTrue(true);
        }
    }

    @Test
    public void testSetWithValueEmptyNullPointerExceptionForString(){
        try {
            GenericMapOperations    generic  = new GenericMapOperations<String, String>(5);
            generic.set("a", "");
        } catch (NullPointerException e){
            assertTrue(true);
        }
    }
}



























