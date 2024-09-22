
class ac_overloadingcls {

    String name;
    int age;

    void printinfo(String name) {
        System.out.println(name);
    }

    void printinfo(int age) {
        System.out.println(age);
    }
}

class ac_overloading {

    public static void main(String[] args) {
        ac_overloadingcls a1 = new ac_overloadingcls();

        a1.printinfo(20);
        a1.printinfo("Dhara");
    }
}
