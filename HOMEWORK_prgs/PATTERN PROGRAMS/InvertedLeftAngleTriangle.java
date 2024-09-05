
public class InvertedLeftAngleTriangle {

    public static void main(String[] args) {
        int n = 5;  // Number of rows

        for (int i = n; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
