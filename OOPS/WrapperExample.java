public class WrapperExample {
    public static void main(String[] args) {
      
        Integer intObj = 10; // Autoboxing
        Double doubleObj = 5.75; // Autoboxing

     
        int intVal = intObj; // Auto-unboxing
        double doubleVal = doubleObj; // Auto-unboxing

       
        System.out.println("Integer object: " + intObj);
        System.out.println("Primitive int value: " + intVal);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Primitive double value: " + doubleVal);

       
        int parsedValue = Integer.parseInt("123");
        System.out.println("Parsed value: " + parsedValue);
    }
}
