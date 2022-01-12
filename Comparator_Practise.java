// package com.company;

import java.util.Comparator;
import java.util.TreeSet;


// Define integer objects into TreeSet in descending order
class MyComparator implements Comparator
{
    public int compare(Object o1 , Object o2)
    {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;

//        return I1.compareTo(I2); // Ascending order [0,10,15,20]
//        return -I1.compareTo(I2);  // Descending order [20,15,10,0]
//        return I2.compareTo(I1); // Descending order [20,15,10,0]
//        return -I2.compareTo(I1); // Ascending order
//        return  +1 ; // Insertion order & duplicates are also allowed  [10,0,15,20,20]
//        return -1; // Reverse of insertion order [20,20,15,0,10]
        return 0; // Only first element will be inserted and all other elements are considered as duplicates
//        return
//        if(I1 < I2)
//        {
//            return +1;
//        }
//        else if(I1 > I2) {
//            return -1;
//
//        }
//        else {
//            return 0;
//        }
    }
}

public class Comparator_Practise {
    public static void main(String[] args) {

        TreeSet t = new TreeSet(new MyComparator());
        System.out.println("Welocme");

        t.add(10); t.add(0) ; t.add(15) ;  t.add(20) ;  t.add(20);

        System.out.println(t);

    }



}

