import java.io.*;

public class replaceawithzfile {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("copy.txt");
            FileOutputStream fout = new FileOutputStream("modified_copy.txt");
            int i;

            
            while ((i = fin.read()) != -1) {
                char c = (char) i; 

                if (c == 'a') {
                    c = 'z';
                }

                fout.write((int) c);
            }

            fin.close();
            fout.close();

            System.out.println("All 'a' characters have been replaced with 'z' in modified_copy.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}
