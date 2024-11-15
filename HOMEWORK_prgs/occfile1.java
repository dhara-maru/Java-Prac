import java.io.*;

public class occfile1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("copy.txt");
            int i;
            int count = 0;

            while ((i = fin.read()) != -1) {
                char c = (char) i;

                if (c == 'a') {
                    count++;
                }
            }

            System.out.println(count);

            // Close the streams
            fin.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
