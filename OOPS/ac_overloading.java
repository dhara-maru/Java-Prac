//it's called COMPILE TIME POLYMORPHISM bcoz it detects the signatures at the compile time only. if the params are same (data type & count wise) then it's gonna give us an error at comile time. 

class ac_overloadingcls {

    String name = "Hetvi";
    int age = 18;

    void printinfo(String name) {
        System.out.println(name);
    }

    void printinfo(int age) {
        System.out.println(age);
    }

    void printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

class ac_overloading {

    public static void main(String[] args) {
        ac_overloadingcls a1 = new ac_overloadingcls();

        a1.printinfo(20);
        a1.printinfo("Dhara");
        a1.printinfo(a1.name, a1.age);

        Bank.Account acc1 = new Bank.Account();
        acc1.name = "Dhara Maru";
        acc1.displayname("DHARAAAA MARU");
        // acc1.password="12345"; will throw an error bcoz password is PRIVATE.
        acc1.setpassword("12345");
        System.out.println(acc1.getpassword()); //is private but is accessible bcoz of getters & setters

    }
}
