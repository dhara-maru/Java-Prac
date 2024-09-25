//abstract class

abstract class animal {

    //we can make constructors & static methods inside abstract class.
    animal() {  //this will also be called on horse & chicken initialization. (1st BASE CLASS and then after only DERIVED CLASS. this is called CONSTRUCTOR CHAINING.)
        System.out.println("animal constructor called");
    }

    abstract void walk(); //just declaration
}

class horse extends animal {

    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class chicken extends animal {

    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class animaldemo {

    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();
        // animal a1 = new animal(); error bcoz it's abstract & body is not defined.
        // a1.walk();
    }
}
