import java.io.*;

public class counteverything {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("file222.txt");
            int i, lines = 0, chars = 0, words = 0;
            boolean isWord = false;

            while ((i = fin.read()) != -1) {
                chars++; // counting chars

                if (i == '\n') {
                    lines++; // lines
                }

                if (Character.isWhitespace(i)) {
                    isWord = false;
                } else {
                    isWord = true;
                    words++; // words
                }

            }
            System.out.println("Characters : " + chars + " words : " + words + " Lines : " + lines);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
