
public class stringbufferdemo {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("stringbuffer demo");
        String str1 = "Dhara Maru";
        String str2 = "Hetvi Maru";

        System.out.println(str1.compareTo(str2));

        s1.append(" is here");
        System.out.println(s1);

        s1.append(30.00);
        System.out.println(s1);

        s1.capacity();
        System.out.println(s1);

        s1.delete(0, 3);
        System.out.println(s1);

        s1.insert(5, "inserted");
        System.out.println(s1);

        s1.replace(7, 8, "000");
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);

    }
}
