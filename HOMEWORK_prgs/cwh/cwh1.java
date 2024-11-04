public class cwh1 {

    public static void main(String[] args) {
        int a = 20;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("haha");
        }

        int age = 10;
        try {
            if (age <= 18) {
                throw new IllegalArgumentException("hehe");
            }
        } finally {
            System.out.println("anyways thanks for coming to booth");
        }

    }
}