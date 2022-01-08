import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Vector_LinkedList_Stack {
    public static void main(String[] args) {

        // Vector v = new Vector<>();
        // v.addElement(1);
        // v.addElement(2);
        // v.addElement(3);
        // v.addElement(4);

        // for (int i = 0; i < v.size(); i++) {
        // System.out.println(v.get(i) + " ");
        // }

        LinkedList l = new LinkedList<>();

        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);

        // int ele = l.

        // for (int i = 0; i < l.size(); i++) {
        // System.out.println(l.get(i) + " ");
        // }

        // Object ele = l.getFirst();
        // System.out.println("Get First element of LinkedList: " + ele);
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack<>();
        for (int i = 0; i < 5; i++) {
            int e = sc.nextInt();
            s.push(e);
        }

        System.out.println(s);
        Object ele = s.pop();
        System.out.println("Top : " + ele);
        System.out.println(s);
    }
}
