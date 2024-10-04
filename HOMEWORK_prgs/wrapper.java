
public class wrapper {

    public static void main(String[] args) {

        int i1 = 45;
        Integer j1 = new Integer(i1);    //auto boxing

        System.out.println(i1);
        System.out.println(j1);

        Integer j2 = new Integer(5436);
        int i2 = j2;    //auto - unboxing

        System.out.println(i2);
        System.out.println(j2);

    }
}
