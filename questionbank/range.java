import java.io.*;

public class range {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("file1.txt");
            int i = 0;
            int occ = 0;
            while ((i = fin.read()) != -1) {
                char ch = (char) i;
                if (ch == 'a') {
                    occ++;
                }
            }
            System.out.println("Occurance count : " + occ);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
