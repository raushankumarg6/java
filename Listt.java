import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Listt {

    public static void main(String[] args) {

        // List<Integer> li = new LinkedList<>();
        // LinkedList<Integer> li = new LinkedList<>();

        // li.add(21);

        // li.add(22);
        // li.add(23);
        // li.add(24); // 21 22 222 23 24

        // li.add(2, 222);
        // // System.out.println(li.size());
        // System.out.println(li);

        // LinkedList l = new LinkedList(); // ccc durga 30 null soft jai (x)
        // l.add("durga");
        // l.add(30);
        // l.add(null);
        // l.add("softwere");
        // l.add("jai ");

        // l.removeLast();
        // l.addFirst("ccc");

        // System.out.println(l);
        // System.out.println(l.size());

        // l.clear();
        // l.removeAll(l);

        // System.out.println(l);

        // Iterator it = l.iterator();

        // Vector<Integer> v =new Vector<>();
        // // v.size();
        // v.add(21);
        // // v.add('d');
        // v.add(null);
        // // v.add("ds");
        // System.out.println(v);

        // System.out.println(v.size());

        // Vector<Integer> v = new Vector<>(2);
        // v.add(21);
        // v.add(211);
        // v.add(31);
        // v.add(21);
        // v.add(211);
        // v.add(31);
        // v.add(21); v.add(211); v.add(31);
        // System.out.println(v.size());
        // System.out.println(v);

        // Vector v =new Vector();
        // v.add(21111);
        // System.out.println(v);

        // List l = new LinkedList<>();
        // l.add(21);
        // l.add(211);
        // l.add(2111);
        // l.add("gr");
        // l.add(null);

        // System.out.println(l);

        // Vector<Integer> v = new Vector<Integer>(l);
        // System.out.println(v);

        Vector v = new Vector(10,5);
        System.out.println(v.capacity());
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        // System.out.println(v.capacity());
        // System.out.println(v.capacity());
        // System.out.println(v);
        v.addElement(11);

        v.remove(2);
        System.out.println(v);


        int h = v.hashCode();
        System.out.println(h);


    }

}
