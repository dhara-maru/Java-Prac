interface transport {
    public void deliver();
}

abstract class animal {
    String name;
    int age;
    String behavior;

    public void getName() {
        System.out.println(name);
    }

    public void getAge() {
        System.out.println(age);
    }

    public void getBehaviour() {
        System.out.println(behavior);
    }

    public void deliver() {

    }
}

class tiger extends animal {
    tiger() {
        this.name = "Richard Parker";
        this.age = 18;
        this.behavior = "Eats Meat";
    }
}

class camel extends animal implements transport {
    camel() {
        this.name = "Arabian Camel";
        this.age = 12;
        this.behavior = "Drinks water";
    }

    public void deliver() {
        System.out.println("This Camel is to be delivered!");
    }

}

class deer extends animal {
    deer() {
        this.name = "Golden Deer";
        this.age = 06;
        this.behavior = "Eats Grass";
    }
}

class donkey extends animal implements transport {
    donkey() {
        this.name = "BaltiBoy";
        this.age = 10;
        this.behavior = "Tells Fictional Stories";
    }

    public void deliver() {
        System.out.println("This Donkey is to be delivered!");
    }

}

public class transport_animals {
    public static void main(String[] args) {
        animal[] animals = new animal[4];
        animals[0] = new tiger();
        animals[1] = new camel();
        animals[2] = new deer();
        animals[3] = new donkey();

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal Name: " + animals[i].name);
            System.out.println("Animal Age: " + animals[i].age);
            System.out.println("Animal Behavior: " + animals[i].behavior);

            animals[i].deliver();

            System.out.println();
        }
    }
}
