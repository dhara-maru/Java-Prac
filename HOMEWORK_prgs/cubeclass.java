
class cube {

    double height, width, depth;

    public void setter(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    public void findvolume() {
        double volume = height * width * depth;
        System.out.println("Volume of cube is " + volume);
    }
}

public class cubeclass {

    public static void main(String[] args) {
        cube c1 = new cube();
        cube c2 = new cube();
        cube c3 = new cube();

        c1.setter(10, 20, 30);
        c2.setter(44, 34, 77);

        c1.findvolume();
        c2.findvolume();
        c3.findvolume();
    }
}
