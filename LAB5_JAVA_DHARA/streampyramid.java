
import java.util.*;

class streampyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "stream";

        for (int i = 0; i < str.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
