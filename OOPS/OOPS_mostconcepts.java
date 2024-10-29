
import java.util.Scanner;

abstract class Animal { // abstract class
    private String name; // encapsulation
    static int legs; // static

    Animal(String name) { // constructor
        this.name = name; // this keyword
        this.legs = 4;
    }

    abstract void sound(); // abstract method

    public String getname() {
        return name;
    }

    public void legscount() {
        System.out.println(getname() + " has " + legs + " legs !!");
    }
}

class Dog extends Animal { // inheritance
    Dog(String name) {
        super(name); // super keyword
    }

    public void sound() { // method overriding
        System.out.println(getname() + " says woof!");
    }
}

public class OOPS_mostconcepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal mydog = new Dog("Sherdil"); // dmd
        mydog.sound();
        mydog.legscount();
    }
}