
/**
 * Innerinterfacedemo
 */
interface animal2 {

    void walk();
    // // animal(){            //constructor is not allowed

    // }         
    //method body is also not allowed
    void eat();

}

class lion implements animal2 {

    public void walk() {
        System.out.println("walks on 4 legs");
    }

    public void eat() {     //both method must be defined.
        System.out.println("eats meat");
    }
}

public class interfacedemo {

    public static void main(String[] args) {
        lion l1 = new lion();
        l1.walk();
        l1.eat();
    }
}
