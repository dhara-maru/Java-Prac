
class aoc {

    double r;

    aoc(double r) {
        this.r = r;
    }

    void findarea() {
        double area = (3.14) * r * r;
        System.out.println("area of circle is - " + area);

    }
}

public class areaofcircle {

    public static void main(String[] args) {
        aoc c1 = new aoc(30.00);
        c1.findarea();
    }

}
