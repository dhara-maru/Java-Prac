import java.io.*;

public class replacements {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file222.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");
            byte[] buffer = fis.readAllBytes();
            String content = new String(buffer);
            content = content.replace("word2", "word3");
            fos.write(content.getBytes());
            fis.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
