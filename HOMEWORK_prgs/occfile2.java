import java.io.*;

public class occfile2 {
    public static void main(String[] args) {
        try {

            Reader reader = new FileReader("copy.txt");
            int i;
            int count = 0;

            while ((i = reader.read()) != -1) {
                char c = (char) i;

                if (c == 'a') {
                    count++;
                }
            }

            System.out.println("There are " + count + " 'a's in the file");

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
