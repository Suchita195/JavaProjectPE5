package com.stackroute.javape5;

import java.util.HashMap;
import java.util.Map;

public class ModifyMapElement {
    public Map modifyMapElement(Map<String, String> map) {
        Map<String,String> map2=new HashMap<>();//map for modification
        if (map == null) {
            return null;
        } else {
        String val1 = map.get("val1");//extracting value of key1
        map2.put("val2", val1);//replacing value of key2 with value of key1
        map2.put("val1", " ");//replacing value of key1 with space
        return map2;
    }
    }
    }
