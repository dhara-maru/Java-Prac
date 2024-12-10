public class multiple {
    public static void main(String[] args) {
        try {
            // Outer try block

            try {
                // Inner try block
                int[] arr = new int[2];
                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e);
            }
            int result = 5 / 0; // ArithmeticException
            System.out.println("This will not execute due to exception.");
        } catch (ArithmeticException ae) {
            System.out.println("Caught an ArithmeticException: " + ae);
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e);
        }
    }
}