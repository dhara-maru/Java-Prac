// point inheritancce
class MyPoint {
    double x;
    double y;

    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double distance(MyPoint other) {
        // Distance formula in 2D:
        // distance = sqrt((x2 - x1)² + (y2 - y1)²)
        return Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2));
    }

}

class ThreeDPoint extends MyPoint {
    double z;

    ThreeDPoint() {
        super(0, 0);
        this.z = 0.0;
    }

    ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    double getZ() {
        return z;
    }

    public double distance(ThreeDPoint other) {

        // Distance formula in 3D:
        // distance = sqrt((x2 - x1)² + (y2 - y1)² + (z2 - z1)²)

        return Math.sqrt(Math.pow(other.getX() - this.getX(), 2) +
                Math.pow(other.getY() - this.getY(), 2) +
                Math.pow(other.getZ() - this.z, 2));
    }
}

public class pointinheritance {
    public static void main(String[] args) {
        ThreeDPoint point1 = new ThreeDPoint(); // (0, 0, 0)
        ThreeDPoint point2 = new ThreeDPoint(10, 30, 25.5);
        ThreeDPoint point3 = new ThreeDPoint(45, 23.5, 67.9);

        System.out.println("Distance between the points: " + point2.distance(point3));
    }
}
