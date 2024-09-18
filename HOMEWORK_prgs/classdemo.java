
class person {

    String name;
    int age;
    String city;

    public void setter(String nm, int ag, String ct) {
        name = nm;
        age = ag;
        city = ct;
    }

    public void getter() {
        System.out.println("Hi! My name is " + name + ". I am " + age + " years old & I'm from " + city);
    }
}

public class classdemo {

    public static void main(String[] args) {
        person p1 = new person();
        p1.setter("Madhav", 18, "Vadodara");
        person p2 = new person();
        p2.setter("Javed", 28, "Bombay");

        p1.getter();
        p2.getter();
    }
}
