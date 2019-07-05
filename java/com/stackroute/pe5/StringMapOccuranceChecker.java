package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class StringMapOccuranceChecker {
    public static String checkOccurance(String[] stringArrayOfCharacter)//Check for multiple Occurances
    {
        if(stringArrayOfCharacter.length==0||stringArrayOfCharacter==null)
            return null;
        Map<String,Boolean> occuranceList= new HashMap<String,Boolean>();

        for(String checher1:stringArrayOfCharacter)
        {
            int counter=0;
            for(String checker2:stringArrayOfCharacter)
            {
                if(checher1.equals(checker2))//checking if any other occurance is there or not
                {
                    counter++;
                }

            }
            if(counter>=2)
            {
                occuranceList.put(checher1,true);
            }
            else
                occuranceList.put(checher1,false);
        }
        System.out.println(occuranceList.toString());
        return occuranceList.toString();//Occurance List is Returned
    }
}
