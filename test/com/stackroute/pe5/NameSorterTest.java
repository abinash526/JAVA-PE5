package com.stackroute.pe5;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NameSorterTest {

    @Test
    public void sortNames() {
        List<String> result=NameSorter.sortNames(new String[]{"Harry","Olive","Alice","Bluto"});
        assertEquals("[Alice, Bluto, Harry, Olive]",result.toString());
    }
    @Test
    public void sortNamesNotNull() {
        List<String> result=NameSorter.sortNames(new String[]{"Harry","Olive","Alice","Bluto"});
        assertNotNull(result.toString());
    }
    @Test
    public void sortNamesNull() {
        List<String> result=NameSorter.sortNames(new String[]{});
        assertNull(result);
    }
}