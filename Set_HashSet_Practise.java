import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set_Pracrtise {
    public static void main(String[] args) {
        // 1.
        // HashSet h = new HashSet<>(); // // initial size of hashmap is 16 and load
        // factor is 0.75
        // h.add(21);
        // h.add(22);
        // h.add(23);
        // h.add(24);

        // System.out.println(h + "\nSize of HashSet: " + h.size());

        // 2.
        // HashSet h = new HashSet<>(4); // initial size of hashmap is 4 and load factor
        // is 0.75
        // h.add(21);
        // h.add(22);
        // h.add(23);
        // h.add(24);

        // System.out.println(h + "\nSize of HashSet: " + h.size());
        // h.add(25);
        // System.out.println(h.size());

        // 3.
        HashSet h = new HashSet<>(5, 0.9f); // initial size of hashmap is 5 and load factor is 0.9f . load factor must
                                            // be of type float
        h.add(21);
        h.add(22);
        h.add(23);
        h.add(null);
        h.add(24);

        h.add("Raushan");
        System.out.println(h);

        // insertion order is not preserved
        // System.out.println("Trying to insert the duplicates: " + h.add(23)); //
        // return false because hashamp cannt
        // // insert the duplicate element .

        // System.out.println(h + "\nSize of HashSet: " + h.size());

        // h.remove(23);
        // System.out.println(h + "\nSize of HashSet: " + h.size());
        // System.out.println("Removing the element which are not in set : " +
        // h.remove(100));
        // System.out.println(h + "\nSize of HashSet: " + h.size());

        // System.out.println("Contains: " + h.contains(null));

        // ArrayList al = new ArrayList<>();
        // al.add(1);
        // al.add(21);
        // al.add(22);

        // // h.removeAll(al)
        // System.out.println("removeAll : " + h.removeAll(al));
        // System.out.println(h);

        Iterator itr = h.iterator(); // Return iterator of h hashset

    }

}
