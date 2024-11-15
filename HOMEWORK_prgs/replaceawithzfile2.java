import java.io.*;

public class replaceawithzfile2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("copy.txt");
            FileWriter writer = new FileWriter("modified_copy2.txt");
            int i;

            while ((i = reader.read()) != -1) {
                char c = (char) i;

                if (c == 'a') {
                    c = 'z';
                }

                writer.write(c);
            }

            reader.close();
            writer.close();

            System.out.println("All 'a' characters have been replaced with 'z' in modified_copy2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
