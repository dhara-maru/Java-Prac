import java.io.*;

public class exeptypes {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("demo.txt");
            String s = "Writing in file";
            byte[] b = s.getBytes();
            fout.write(b);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}