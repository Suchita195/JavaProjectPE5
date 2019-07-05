package com.stackroute.javape5;

import java.util.HashMap;
import java.util.Map;

public class ArrayOfStringsWithMap {
    Map arrayOfStrings(String []inputArray)
    {
        // Declare the HashMap
        Map<String,Boolean> hashMap = new HashMap< String,Boolean>();//using hashmap
        //check if there are elements in the array or not
        if(inputArray.length<=0)
        {
            return null;
        }
        for(String key : inputArray)//for each string key in the array inputArray
        {
            if(!hashMap.containsKey(key)) {
                hashMap.put(key, false);
            } else {
                hashMap.put(key, true);
            }

        }
       return hashMap;
    }
}
