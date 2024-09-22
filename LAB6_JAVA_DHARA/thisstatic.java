// L6 . C7 : Write a program in Java to demonstrate use of this keyword. Check whether this can
// access the Static variables of the class or not.

class thisclass {

    static int n1 = 10, n2;

    void printinfo() {
        System.out.println(this.n1);

    }

    void add(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        int sum = n1 + n2;
        System.out.println("Sum - " + sum);
    }
}

class thisstatic {

    public static void main(String[] args) {
        thisclass obj = new thisclass();
        thisclass obj2 = new thisclass();
        obj.printinfo();
        obj.add(5, 10);

    }
}
