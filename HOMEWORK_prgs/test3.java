import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Exception: " + e.toString());
        }
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Exception while closing: " + e.toString());
            }
        }
        System.out.println("Cleanup completed.");
        // finally {
        // if (reader != null) {
        // try {
        // reader.close();
        // } catch (IOException e) {
        // System.out.println("Exception while closing: " + e.toString());
        // }
        // }
        // System.out.println("Cleanup completed.");
        // }
    }
}
