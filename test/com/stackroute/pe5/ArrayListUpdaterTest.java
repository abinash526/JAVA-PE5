package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayListUpdaterTest {
    ArrayListUpdater ob;

    @Before
    public void setUp() throws Exception {
        ob=new ArrayListUpdater();
    }


    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void updateArrayList() {
        List<String> listOfFruits=new ArrayList<>();
        listOfFruits.add("Apple");
        listOfFruits.add("Grape");
        listOfFruits.add("Melon");
        listOfFruits.add("Berry");
        String result=ob.updateArrayList(listOfFruits);
        assertEquals("[Kiwi, Grape, Mango, Berry]",result);
    }
    @Test
    public void updateArrayListNotNull() {
        List<String> listOfFruits=new ArrayList<>();
        listOfFruits.add("Apple");
        listOfFruits.add("Grape");
        listOfFruits.add("Melon");
        listOfFruits.add("Berry");
        String result=ob.updateArrayList(listOfFruits);
        assertNotNull(result);
    }
    @Test
    public void updateArrayListNull() {
        List<String> listOfFruits=new ArrayList<>();

        String result=ob.updateArrayList(listOfFruits);
        assertNull(result);
    }
}