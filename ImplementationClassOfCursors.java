import java.util.*;

public class ImplementationClassOfCursors  {

    public static void main(String[] args) {
        Vector v = new Vector<>();

        Enumeration e = v.elements();
        Iterator itr = v.iterator();
        ListIterator ltr = v.listIterator();

        System.out.println("Enumeration interface is defined in : " + e.getClass().getName());
        System.out.println("Iterator interface is defined in : " + itr.getClass().getName());
        System.out.println("ListIterator interface is defined in : " + ltr.getClass().getName());


        // Output:
        // Enumeration interface is defined in : java.util.Vector$1
        // Iterator interface is defined in : java.util.Vector$Itr
        // ListIterator interface is defined in : java.util.Vector$ListItr

    }
}
