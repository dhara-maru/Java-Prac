
public class mathclass {

    public static void main(String[] args) {

        //Math.E()
        double eval = Math.E;
        System.out.println(eval);

        // Demonstrating Math.abs()
        int negativeNumber = -20;
        System.out.println("Absolute value of is: " + Math.abs(negativeNumber));
        System.out.println("Absolute value of E is: " + Math.abs(eval));

        // Demonstrating Math.sqrt()
        double number = 25.0;
        System.out.println("Square root is: " + Math.sqrt(number));

        // Demonstrating Math.pow()
        double base = 2.0;
        double exponent = 3.0;
        System.out.println(" power is: " + Math.pow(base, exponent));

        int num1 = 15;
        int num2 = 30;
        System.out.println("Maximum is: " + Math.max(num1, num2));
        System.out.println("Minimum is: " + Math.min(num1, num2));

        System.out.println("A random number between 0 and 1: " + Math.random());

        double decimalNumber = 8.3;
        System.out.println("Ceiling of " + decimalNumber + " is: " + Math.ceil(decimalNumber));
        System.out.println("Floor of " + decimalNumber + " is: " + Math.floor(decimalNumber));

        System.out.println("Rounding off " + decimalNumber + " gives: " + Math.round(decimalNumber));

        double naturalLogInput = 10.0;
        System.out.println("Natural logarithm of " + naturalLogInput + " is: " + Math.log(naturalLogInput));
        System.out.println("Natural logarithm of E is: " + Math.log(eval));

        System.out.println("Logarithm base 10 of " + naturalLogInput + " is: " + Math.log10(naturalLogInput));

    }
}
