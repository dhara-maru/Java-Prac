
class mainoverloaddemo {

    public static void main(String[] args) {
        System.out.println("Normal original main method");
        main(10);
        main("Dhara");
    }

    public static void main(int a) {
        System.out.println("a- " + a);
    }

    public static void main(String str) {
        System.out.println("String - " + str);
    }

}
