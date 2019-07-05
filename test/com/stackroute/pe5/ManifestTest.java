package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManifestTest {
    Manifest ob;

    @Before
    public void setUp() throws Exception {
        ob=new Manifest();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void  getSortedStudentUsingAge() {
        Student object1 = new Student(102, 22, "Rakesh");
        Student object2 = new Student(103, 27, "Abinash");
        Student object3 = new Student(104, 26, "Rakesh");
        Student object4 = new Student(105, 28, "Sam");
        Student object5 = new Student(106, 29, "John");
        List<Student> listOfStudents = new ArrayList<Student>();


       //
        listOfStudents.add(object1);
        listOfStudents.add(object2);
        listOfStudents.add(object3);
        listOfStudents.add(object4);
        listOfStudents.add(object5);

        String result=ob.sortStudent(listOfStudents);
        assertEquals("106 John 29\n" +
                "105 Sam 28\n" +
                "103 Abinash 27\n" +
                "104 Rakesh 26\n" +
                "102 Rakesh 22\n",result);
    }
    @Test
    public void  getSortedStudentHavingSameAge() {
        Student object1 = new Student(102, 26, "Ramesh");
        Student object2 = new Student(103, 27, "Abinash");
        Student object3 = new Student(104, 26, "Asish");
        Student object4 = new Student(105, 28, "Sam");
        Student object5 = new Student(106, 29, "John");
        List<Student> listOfStudents = new ArrayList<Student>();


        //
        listOfStudents.add(object1);
        listOfStudents.add(object2);
        listOfStudents.add(object3);
        listOfStudents.add(object4);
        listOfStudents.add(object5);

        String result=ob.sortStudent(listOfStudents);
        assertEquals("106 John 29\n" +
                "105 Sam 28\n" +
                "103 Abinash 27\n" +
                "102 Ramesh 26\n" +
                "104 Asish 26\n",result);
    }
    @Test
    public void  getSortedStudentHavingSameAgeAndName() {
        Student object1 = new Student(102, 26, "Ramesh");
        Student object2 = new Student(103, 27, "Abinash");
        Student object3 = new Student(104, 26, "Ramesh");
        Student object4 = new Student(105, 28, "Sam");
        Student object5 = new Student(106, 29, "John");
        List<Student> listOfStudents = new ArrayList<Student>();


        //
        listOfStudents.add(object1);
        listOfStudents.add(object2);
        listOfStudents.add(object3);
        listOfStudents.add(object4);
        listOfStudents.add(object5);

        String result=ob.sortStudent(listOfStudents);
        assertEquals("106 John 29\n" +
                "105 Sam 28\n" +
                "103 Abinash 27\n" +
                "104 Ramesh 26\n" +
                "102 Ramesh 26\n",result);
    }

    @Test
    public void  getSortedStudentHavingNull() {

        String result=ob.sortStudent(null);
        assertNull(result);
    }


}