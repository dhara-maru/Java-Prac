public class test2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int res = 0;
        try {
            res = a / b;
            System.out.println("result : " + res);
        } catch (Exception e) {
            System.out.println("Exception : " + e.toString());
        }
        // } finally {
        // try {
        // res = a / b;
        // } catch (Exception e) {
        // System.out.println("Inside finally's catch block, Exception : " +
        // e.toString());
        // }
        // System.out.println("Inside finally block");
        // res = a / b;
        // }
        System.out.println("without finally");
    }
}