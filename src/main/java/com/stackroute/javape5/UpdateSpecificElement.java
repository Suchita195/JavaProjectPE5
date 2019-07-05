package com.stackroute.javape5;

import java.util.ArrayList;
import java.util.List;

public class UpdateSpecificElement {
    String output="";
    String updateSpecificElement(int index, String updated_value)
   {
       List<String> list_Strings = new ArrayList<String>();//create array list
       //add elements in the array list
       list_Strings.add("Apple");
       list_Strings.add("Grape");
       list_Strings.add("Melon");
       list_Strings.add("Berry");
       output= "Input list is : "+list_Strings+"\n";

       //update the element with other element
       list_Strings.set(index,updated_value);
       output=output+ "Output list is: "+list_Strings+"\n";

       //remove all elements from array list
       list_Strings.clear();
       output=output+ "ArrayList after removing all elements: "+list_Strings;

       return output;

   }
}
