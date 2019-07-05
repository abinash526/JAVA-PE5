package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NameSorter {
    public static List<String> sortNames(String[] nameList)
    {
        if(nameList.length==0||nameList==null)//If the string list is empty then it is returned
            return null;
        Set<String> sortedString=new TreeSet<>();
       for(String name:nameList)//Loop to add the names into the TreeSet
       {
           sortedString.add(name);
       }
        List<String> listOfAscendingNames=new ArrayList<String>(sortedString);//Set is converted to ArrayList
        System.out.println(listOfAscendingNames);
       return listOfAscendingNames;
    }
}
