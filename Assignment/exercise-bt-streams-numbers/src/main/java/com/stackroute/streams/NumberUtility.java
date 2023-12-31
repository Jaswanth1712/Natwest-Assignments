package com.stackroute.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Utility class for analyzing numbers in a List
 */
public class NumberUtility {

    /**
     * Returns count of even numbers in the given list of integers
     * Returns 0 if there are no even numbers or if the passed list is null
     */
    public long getEvenNumberCount(List<Integer> numbers) {

        if(numbers==null || numbers.isEmpty()){
            return 0;
        }



return numbers.stream().filter(n->n%2==0).count();
    }

    /**
     * Returns a list of even multiples of three from the given list of integers
     * Returns empty List, is the given list is null or empty
     */
    public List<Integer> getEvenMultiplesOfThree(List<Integer> numbers) {
        if(numbers==null || numbers.isEmpty()){
            return List.of();
        }
        return numbers.stream().filter(n->n%6==0).collect(Collectors.toList());
    }

    /**
     * Returns maximum of odd numbers
     * Returns 0 if there are no odd numbers or if the passed list is null
     */
    public Integer getMaximumOfOddNumbers(List<Integer> numbers) {


        if(numbers==null || numbers.isEmpty()){
            return 0;
        }
        return numbers.stream().filter(n->n%2!=0).max(Integer::compare).orElse(0);

    }
}