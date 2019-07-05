
package com.stackroute.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapValueInterchangerTest {
    MapValueInterchanger ob;

    @org.junit.Before
    public void setUp() throws Exception {
        ob=new MapValueInterchanger();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        ob=null;
    }

    @org.junit.Test
    public void getChangedMapValue() {
        Map<String,String> listOfObjects=new HashMap<String, String>();
        listOfObjects.put("val1","Java");
        listOfObjects.put("val2","C++");
        String result=ob.changeMapValue(listOfObjects).toString();
        assertEquals("{val2= , val1=C++}",result);
        listOfObjects.put("val1","mars");
        listOfObjects.put("val2","saturn");
        assertEquals("{val2= , val1=C++}",result);
    }
    @Test
    public void getNullValue()
    {
        String result=ob.changeMapValue(null).toString();
        assertNull(result);
    }
}