
class constructorcls {

    double h, w, d;

    constructorcls() {
        h = 10;
        w = 10;
        d = 10;
    }

    void volume() {
        System.out.println("Volume is - " + (h * w * d));
    }
}

class constructor {

    public static void main(String[] args) {
        constructorcls c1 = new constructorcls();
        c1.volume();
    }
}
