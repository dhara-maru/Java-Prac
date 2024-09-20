
class constructorcls2 {

    double h, w, d;

    constructorcls2() { //default constructor
        h = 10;
        w = 10;
        d = 10;
    }

    void volume() {
        System.out.println("Volume is - " + (h * w * d));
    }

    void constructorcls2(String name) { //constructor with params
        System.out.println("Hello " + name);
    }

    double constructorcls2(double value) { //constructor with params and return type
        double res = h + w + d + value;
        return res;
    }

    // Copy constructor
    constructorcls2(constructorcls2 obj) {
        this.h = obj.h;
        System.out.println("Copy constructor called, height = " + this.h);
    }
}

class constructor2 {

    public static void main(String[] args) {
        constructorcls2 c1 = new constructorcls2();
        constructorcls2 c2 = new constructorcls2(c1); //copy const called
        c1.volume();
        c1.constructorcls2("Madhav");

        double result = c1.constructorcls2(40.00);
        System.out.println("Height + Width + Depth + Your value is : " + result);

    }
}
