interface Shape {
    public void getArea();
}

class rec implements Shape {
    double length = 0.0;
    double width = 0.0;

    rec(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void getArea() {
        double area = length * width;
        System.out.println("Area of this rectangle is : " + area);
    }

}

class triangle implements Shape {
    double base = 0.0;
    double height = 0.0;

    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void getArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of this triangle is : " + area);
    }

}

class circle implements Shape {
    double r = 0.0;

    circle(double r) {
        this.r = r;
    }

    public void getArea() {
        double area = Math.PI * (r * r);
        System.out.println("area of this circle is :" + area);
    }

}

public class shapedemo {
    public static void main(String[] args) {
        rec r1 = new rec(5, 10);
        circle c1 = new circle(10);
        triangle t1 = new triangle(20, 30);

        r1.getArea();
        c1.getArea();
        t1.getArea();
    }
}