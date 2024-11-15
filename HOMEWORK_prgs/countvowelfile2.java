import java.io.*;

public class countvowelfile2 {
    public static void main(String[] args) {
        try {

            Reader reader = new FileReader("copy.txt");
            int i;
            int count = 0;

            while ((i = reader.read()) != -1) {
                char c = (char) i;

                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O'
                        || c == 'u' || c == 'U') {
                    count++;
                }
            }

            System.out.println("There are " + count + " vowels in the file");

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
