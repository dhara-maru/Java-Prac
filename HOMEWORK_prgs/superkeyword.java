
class Dcube {

    int height;
    int width;

    Dcube(int height, int width) {
        this.height = height;
        this.width = width;
    }

}

class Mcube extends Dcube {

    int depth = 30;

    Mcube(int height, int width) {
        super(height, width);
        this.depth = 30;
    }

    public void volume() {
        System.out.println("Volume is : " + (height * width * depth));
    }
}

public class superkeyword {

    public static void main(String args[]) {
        Mcube mycube = new Mcube(23, 56);
        mycube.volume();

    }

}
