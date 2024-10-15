public class exceptiondemo {
    public static void main(String[] args) {
        int a = 100;
        // int b = 0;
        int b = 20;
        int arr[] = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        try {
            System.out.println(" a / b - " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : " + e.toString());
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Array Index Out Of Bounds Exception : " + aie.toString());
        } catch (Exception ee) {
            System.out.println("Exception Occured : " + ee);
        }
    }
}
