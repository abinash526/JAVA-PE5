/*PROBLEM STATEMENT
Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.
* */
package com.stackroute.pe5;

import java.util.*;

public class Student {
    int id;
    int age;
    String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    //Getter and setters
    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }


}
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.age == s2.age) {
            int value=new NameComparator().compare(s1, s2);//If the age is same then Name comparator is called
            if(value==0)
            {
                value=new IdComparator().compare(s1,s2);//if both name and age are same then ID comparator is called
            }
            return value;
            }
        else if (s1.age < s2.age)
                return 1;
            else
                return -1;
        }
    }
class NameComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2)//Name is compared and required value is returned
    {
        return -1*s1.name.compareTo(s2.name);
    }
}
class IdComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.id == s2.id) {
            return 0;
        }
        else if (s1.age < s2.age)
            return 1;
        else
            return -1;
    }
}
class Manifest
{
    public String sortStudent(List<Student> listOfStudents)
    {
        if(listOfStudents==null)
            return null;



        String printedListOfStudents="";
        Collections.sort(listOfStudents, new AgeComparator());
        Iterator itr2=listOfStudents.iterator();
        System.out.println("-------------");
        while(itr2.hasNext()){
            Student st=(Student)itr2.next();
            System.out.println(st.id+" "+st.name+" "+st.age);
            printedListOfStudents=printedListOfStudents+(st.id+" "+st.name+" "+st.age)+"\n";
        }
        return printedListOfStudents;

    }
}