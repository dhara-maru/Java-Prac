import java.io.*;

public class AppendTextToFileWithBuffer {
    public static void main(String[] args) {
        try {
            // BufferedWriter with FileWriter in append mode
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("paste3.txt", true));

            String textToAppend = "\nThis is the appended text using BufferedWriter.";

            bufferedWriter.write(textToAppend);

            bufferedWriter.newLine();

            bufferedWriter.close();

            System.out.println("Text has been successfully appended to the file using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending text to the file.");
            e.printStackTrace();
        }
    }
}
