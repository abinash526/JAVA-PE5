package com.stackroute.pe5;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringMapOccuranceCheckerTest {

    @Test
    public void checkOccurance() {
        String[] listOfCharacters={"a","b","c","d","a","c","c"};
        String result=StringMapOccuranceChecker.checkOccurance(listOfCharacters);
        assertEquals("{a=true, b=false, c=true, d=false}",result);
    }
    @Test
    public void checkOccuranceNotNull() {
        String[] listOfCharacters={"a","b","c","d","a","c","c"};
        String result=StringMapOccuranceChecker.checkOccurance(listOfCharacters);
        assertNotNull(result);
    }
    @Test
    public void checkOccuranceNull() {
        String[] listOfCharacters={};
        String result=StringMapOccuranceChecker.checkOccurance(listOfCharacters);
        assertNull(result);
    }
}