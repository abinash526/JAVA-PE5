package com.stackroute.pe5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdater {
    public String updateArrayList(List<String> listOfFruits)//Updates the ArrayList
    {
        if(listOfFruits.size()==0||listOfFruits==null)
            return null;
        System.out.println(listOfFruits.toString());
        listOfFruits.set(listOfFruits.indexOf("Apple"),"Kiwi");//Apple is replaced with Kiwi
        listOfFruits.set(listOfFruits.indexOf("Melon"),"Mango");//Melon is replaced with Mango
        //listOfFruits.clear();
        System.out.println(listOfFruits);
        return listOfFruits.toString();
    }
}
