import java.io.IOException;
import java.io.*;

public class replacements {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("file1.txt");
            FileOutputStream fout = new FileOutputStream("file222.txt");

            String word1 = "word1";
            String word2 = "word2";

            int i = 0;
            byte[] b = fin.readAllBytes();
            String content = new String(b);

            while (content.contains(word1)) {
                content = content.replaceFirst(word1, word2);

            }
            fout.write(content.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
