import java.io.*;

public class copypastefile2 {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("copy2.txt");
            Reader reader = new FileReader("copy2.txt");
            Writer writer2 = new FileWriter("Paste3.txt");

            writer.write("Gangs of Wasseypur");
            writer.close();

            int i;

            while ((i = reader.read()) != -1) {
                writer2.write((char) i);
            }

            reader.close();
            writer2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
