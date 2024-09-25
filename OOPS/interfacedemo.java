
/**
 * Innerinterfacedemo
 */
interface animal2 {

    void walk();        //by default it's ABSTRACT & PUBLIC
    // // animal(){            //constructor is not allowed

    // }         
    //method body is also not allowed
    void eat();

}

interface herbivore {        //multiple inheritance is done using interface

    void eatswhat();

}

class lion implements animal2, herbivore {      //multiple inheritance

    public void walk() {
        System.out.println("walks on 4 legs");
    }

    public void eat() {     //both method must be defined.
        System.out.println("eats meat");
    }

    public void eatswhat() {
        System.out.println("Eats only plants.");
    }
}

public class interfacedemo {

    public static void main(String[] args) {
        lion l1 = new lion();
        l1.walk();
        l1.eat();
    }
}
