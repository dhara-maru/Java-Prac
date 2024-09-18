
class circleclass {

    double radius;
    double area;

    public void setter(double r) {
        radius = r;
    }

    public void getarea() {
        area = Math.PI * radius * radius;
        System.out.println("Area of this circle is : " + area);
    }
}

public class circle {

    public static void main(String[] args) {
        circleclass c1 = new circleclass();
        c1.setter(50.5);
        c1.getarea();
    }
}
