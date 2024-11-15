import java.io.*;

public class appendfile1 {
    public static void main(String[] args) {
        try {
            // FileWriter in append mode (second argument is true)
            FileWriter writer = new FileWriter("copy.txt", true);

            String textToAppend = "\nreleased in 2018";

            writer.write(textToAppend);

            writer.close();

            System.out.println("Text has been successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending text to the file.");
            e.printStackTrace();
        }
    }
}
