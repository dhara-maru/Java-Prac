
public class AlternatingSum {

    public static void main(String[] args) {
        int result = 0;

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // Subtract even numbers
                result -= i;
            } else {
                // Add odd numbers
                result += i;
            }
        }

        //1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 
        System.out.println(result);
    }
}
