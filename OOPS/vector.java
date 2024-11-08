import java.util.*;

public class vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector<Integer> v2 = new Vector<>();

        v2.add(40);
        v2.add(50);
        v2.add(70);

        System.out.println(v2.contains(200));
        v2.elementAt(2);
        v2.clone();
        System.out.println(v2.get(2));
        v2.indexOf(30);

        v.add(10);
        v.add(20);
        v.addAll(v2);
        v.remove(1);

        Iterator i = v.iterator();
        while (i.hasNext()) {
            System.out.println("vector : " + i.next());
        }
    }
}
