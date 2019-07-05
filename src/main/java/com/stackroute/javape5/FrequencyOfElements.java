package com.stackroute.javape5;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
     Map frequencyOfElements(String input)
     {  //check if the input is null
         if(input==null)
         {
             return null;
         }
         // Declare the HashMap
         Map< String,Integer> hashMap = new HashMap< String,Integer>();//using hashmap
         input = input.replaceAll("[^A-Za-z0-9]"," ");
         String[] words = input.split("\\s+");
         for(String word : words)//for each string word in the array words
         {
             if(hashMap.containsKey(word)) {
                 Integer count = hashMap.get(word);
                 hashMap.put(word, ++count);
             }
             else
             {
                 hashMap.put(word,1);//put the word in the map
             }
         }
         return hashMap;
     }
}
