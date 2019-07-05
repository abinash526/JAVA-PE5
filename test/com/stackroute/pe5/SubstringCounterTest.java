package com.stackroute.pe5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubstringCounterTest {

    @Test
    public void countSubtring() {
        String result=SubstringCounter.countSubtring("one one -one___two,,three,one @three*one?two");
        assertEquals("{one=5, two=2, three=2}",result);
    }
    @Test
    public void countSubtringNotNull() {
        String result=SubstringCounter.countSubtring("one one -one___two,,three,one @three*one?two");
        assertNotNull(result);
    }
    @Test
    public void countSubstringForNull(){
        String result=SubstringCounter.countSubtring("");
        assertNull(result);
    }
}