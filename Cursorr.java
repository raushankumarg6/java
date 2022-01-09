package com.company;

import java.util.*;

public class Cursor {

    public static void main(String[] args) {

        // 1. Enumeration
//        Vector<Integer> v = new Vector<>();
//        for (int i = 0; i <= 10; i++) {
//            v.add(i);
//        }

//        System.out.println("Before : " + v);

        // // Enumeration is applicable on vector only
//        Enumeration e = v.elements();

//        while (e.hasMoreElements()) // Iterating on the vector v one by one .
//        {
//            Integer I = (Integer) e.nextElement();
//            I = I * 10;
//
//             if (I % 2 == 0) {
//             System.out.print(I + " ");
//             }
//        }


        // 2.Iterator
//        ArrayList al = new ArrayList<>();
//        for (int i = 0; i <=10 ; i++) {
//            al.add(i);
//        }
//
//        System.out.println("Before : "+al);
//
//        Iterator itr = al.iterator(); // applicable on any collection
//
//         while (itr.hasNext()) {
//             Integer i = (Integer)itr.next();
//             if(i%2 == 0 )
//             {
//                 System.out.print(i+ " ");
//             }
//             else
//             {
//                 itr.remove();
//             }
//         }
//        System.out.println("\nAfter removing Even elements: "+al);

//        3. ListIterator
        
            LinkedList l = new LinkedList();
            l.add("Raushan") ; l.add("Rajesh") ; l.add("Gupta") ; l.add("End");
        System.out.println("Original list: "+l);
            ListIterator ltr = l.listIterator(); // applicable on only list objects
            while (ltr.hasNext())
            {
                String s = (String) ltr.next();
                if(s.equals("Rajesh"))
                {
                    ltr.remove();
                }
                else if(s.equals("Raushan"))
                {
                    ltr.add("Raju");
                }
                else if(s.equals("End"))
                {
                    ltr.set("Ended !");
                }
            }
        System.out.println("After operations: "+l);

    }
}
