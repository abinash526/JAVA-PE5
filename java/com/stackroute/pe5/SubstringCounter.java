/*
* Write a program to find the number of counts in the following ​ String​ . Store the output in
Map<​ String​ ,Integer> as key value pair.
Input : ​ String​ str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}*/
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class SubstringCounter {
    public static String countSubtring(String inputLine)
    {
        if(inputLine.length()==0||inputLine==null)//null is returned for errors
            return null;
        inputLine=inputLine.toLowerCase();//The string is converted to lowerCase
        //Occurances of one two and three are replaced with blank and the occurances are found by subtracting it from the original string
        String stringForOne=inputLine.replace("one","");
        String stringForTwo=inputLine.replace("two","");
        String stringForThree=inputLine.replace("three","");
        Map<String,Integer> occuranceCounterList=new HashMap<String,Integer>();
        occuranceCounterList.put("one",(inputLine.length()-stringForOne.length())/"one".length());
        occuranceCounterList.put("two",(inputLine.length()-stringForTwo.length())/"two".length());
        occuranceCounterList.put("three",(inputLine.length()-stringForThree.length())/"three".length());
        return occuranceCounterList.toString();
    }
}
