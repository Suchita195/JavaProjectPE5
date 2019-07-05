package com.stackroute.javape5;

import java.util.*;

public class SortUsingSetInterface {
    String sortUsingSetInterface(Set<String> hashSet)
    {   //Check if the set is null
        if(hashSet==null)
        {
            return null;
        }
        String output="";
        //HashSet before sorting
        output="Input Set :"+hashSet+"\n";

        //sorting irrespective of case sensitivity
        Set<String> treeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        treeSet.addAll(hashSet);
        output= output+"Sorted Set:"+treeSet+"\n";

        //converting sorted set into arraylist
        List<String> list = new ArrayList<String>(treeSet);
        output = output+ "Array List from Set:" + list;

        return output;
        }
    }
