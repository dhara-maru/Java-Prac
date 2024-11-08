
import java.util.ArrayList;

public class arraylistdemo {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(2);
        ArrayList<String> l3 = new ArrayList<>();

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

        l3.add("Java");
        l3.add("Python");
        l3.add("Javascript");
        l3.add("CPP");
        l3.add("C");
        l3.add("C#");
        l3.add(0, "Dart"); // on 0th index
        l3.remove(4); // removes 4th index elem
        l3.remove("C#"); // removes C#
        l3.set(1, "Python9");

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        for (int i = 0; i < l3.size(); i++) {
            System.out.println(l3.get(i));
        }

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(20));
        System.out.println(l3.isEmpty()); // false

    }
}