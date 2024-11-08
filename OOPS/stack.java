import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("dog");
        animals.push("cow");
        animals.push("monkey");

        System.out.println("Stack : " + animals);

        for (int i = 0; i < animals.size(); i++) {
            System.out.println("animals : " + animals.get(i));
        }

        System.out.println(animals.peek());
        animals.pop();

    }
}
