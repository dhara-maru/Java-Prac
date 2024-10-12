abstract class Vegetable {
    public String colour;

    public abstract String toString();
}

class Potato extends Vegetable {
    Potato(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "Potato is " + this.colour;
    }
}

class Brinjal extends Vegetable {
    Brinjal(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "Brinjal is " + this.colour;
    }
}

class Tomato extends Vegetable {
    Tomato(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "Tomato is " + this.colour;
    }
}

public class abstract_vegetable {
    public static void main(String[] args) {
        Potato p1 = new Potato("Brown");
        Brinjal b1 = new Brinjal("Purple");
        Tomato t1 = new Tomato("Red");

        System.out.println(p1);
        System.out.println(b1);
        System.out.println(t1);
    }
}
