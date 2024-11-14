import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("example.txt")) {
            String content = "Hello, this is a file stream example!";
            fos.write(content.getBytes());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            System.out.println("Reading data from file:");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\nData read from file successfully.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
