public class multiple {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
            try {
                int[] arr = new int[2];
                System.out.println(arr[5]);

            } catch (ArrayIndexOutOfBoundsException aie) {
                System.out.println(aie.toString());
            }
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}