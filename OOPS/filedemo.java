import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filedemo {
    public static void main(String[] args) throws IOException {
        // File myfile = new File("OOPS/dharasfile.txt");
        // myfile.createNewFile();

        FileWriter f = new FileWriter("OOPS/dharasfile.txt");
        f.write("Content in my created file\nOkay now bye");
        f.close();

        File myreader = new File("OOPS/dharasfile.txt");

        Scanner sc = new Scanner(myreader);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
