import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copypastefile1 {
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("copy.txt");
            String s = "Bhavesh Joshi\nThe Superhero";
            byte[] b = s.getBytes();
            try {
                fout.write(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File Written");

            FileInputStream fin = new FileInputStream("copy.txt");
            FileOutputStream fout2 = new FileOutputStream("paste.txt");
            int i = 0;
            try {
                while ((i = fin.read()) != -1) {
                    fout2.write(i);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("File pasted");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}