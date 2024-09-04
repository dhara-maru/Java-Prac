
public class SumOddEven {

    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {

                evenSum = evenSum + i;
            } else {

                oddSum = oddSum + i;
            }
        }

        System.out.println("Sum of odd numbers between 1 and 10: " + oddSum);
        System.out.println("Sum of even numbers between 1 and 10: " + evenSum);
    }
}
