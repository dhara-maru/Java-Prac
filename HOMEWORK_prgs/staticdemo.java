
class staticcls {

    static int count; //static variable

    staticcls() {
        count++;
    }

    static int getcount() {  //static method
        return count;
    }

    static {  // Static block
        System.out.println("Static block executed.");

    }

    // Static class
    static class NestedStaticClass {

        void display() {
            System.out.println("Inside static nested class.");
        }

    }

}

public class staticdemo {

    public static void main(String[] args) {
        staticcls sc1 = new staticcls();
        staticcls sc2 = new staticcls();
        int answer = staticcls.getcount();
        System.out.println("there are " + answer + " objects created in the class.");

        staticcls.NestedStaticClass nested = new staticcls.NestedStaticClass();
        nested.display();

    }
}
