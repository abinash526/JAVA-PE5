/*
---PROBLEM STATEMENT
A method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has
b. Set the key `val1` to
Example 1:
The map {"val1": "java",
"java"}
Example 2:
The map {"val1": "mars",
"mars"}
a value, set the key `val2` to have that value, and
have the value `" "` (empty​ ​ string​ ).
"val2": "c++"} should return {"val1": " ", "val2":
"val2": "saturn"}
should return {"val1": " ", "val2":
* */
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class MapValueInterchanger {
    public Map<String,String> changeMapValue(Map<String,String> listOfValue)//Changes the Value
    {
        if(listOfValue==null)
            return null;
        Map<String,String> ob=new HashMap<>();
        //Value of 2 is added to 1
        listOfValue.put("val1",listOfValue.get("val2"));
        //Value of 2 is " "
        listOfValue.put("val2"," ");
        return listOfValue;
    }

}
