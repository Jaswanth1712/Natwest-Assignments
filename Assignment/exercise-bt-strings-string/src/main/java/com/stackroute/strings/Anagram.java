package com.stackroute.strings;
import java.util.*;
public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {


        if(phraseOne==null || phraseOne.isEmpty() || phraseTwo==null || phraseTwo.isEmpty() )
        {
            return "Give proper input not empty phrases";
        }

        char[] array1 =phraseOne.toCharArray();
        char[] array2=phraseTwo.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(array1.length!=array2.length){
            return "Given phrases are not anagrams";
        }

        for(int i=0;i<array1.length;i++){
            if(array1[i]!=array2[i])
                return "Given phrases are not anagrams";
        }


        return "Given phrases are anagrams";
    }


}
