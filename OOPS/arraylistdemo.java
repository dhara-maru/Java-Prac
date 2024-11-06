
import java.util.ArrayList;

public class arraylistdemo {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(2);

        l2.add(00);
        l2.add(01);

        l1.add(23);
        l1.add(345);
        l1.add(1);
        l1.add(-45);
        l1.add(890);
        l1.add(0, 100000);
        l1.add(0, 20);
        l1.addAll(0, l2);

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(20));
    }
}