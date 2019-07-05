package com.stackroute.pe5;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImplementer {
    public static void main(String[] args) {
        Queue<String> ob=new PriorityQueue<String>();
        ob.add("ABinash");
        ob.add("Hello");
        ob.add("basd");
        ob.add("tyhhg");
        Iterator<String> it=ob.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
