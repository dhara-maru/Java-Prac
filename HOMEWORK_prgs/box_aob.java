
import java.util.*;

class boxaob {

    int h, w, d;

    boxaob(int h, int w, int d) {
        this.h = h;
        this.w = w;
        this.d = d;
    }

    public void display() {
        System.out.println("Height : " + h + "\t Width : " + w + "\t Depth : " + d);
    }

    public void volume() {
        double vol = h * w * d;
        System.out.println("Volume of the box is : " + vol);
    }
}

public class box_aob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many boxes do you want ? : ");
        int size = sc.nextInt();
        boxaob[] b = new boxaob[size];
        int h, w, d;
        for (int i = 0; i < size; i++) {
            System.out.print("enter height of box " + i + ": ");
            h = sc.nextInt();
            System.out.print("enter width of box " + i + ": ");
            w = sc.nextInt();
            System.out.print("enter depth of box " + i + ": ");
            d = sc.nextInt();

            b[i] = new boxaob(h, w, d);
        }

        for (int i = 0; i < b.length; i++) {
            b[i].display();
            b[i].volume();
        }
    }
}
