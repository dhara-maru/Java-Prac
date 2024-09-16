
public class diamondpattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = i; j < 3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 3 - 1; i >= 1; i--) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
