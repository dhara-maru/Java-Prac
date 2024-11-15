import java.io.*;

public class countvowelfile1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("copy.txt");
            int i;
            int count = 0;

            while ((i = fin.read()) != -1) {
                char c = (char) i;

                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O'
                        || c == 'u' || c == 'U') {
                    count++;
                }
            }

            System.out.println("There are " + count + " vowels in the file");

            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
