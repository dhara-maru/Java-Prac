port java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
       
        Random random = new Random();
        int randomInt = random.nextInt(100); 
        double randomDouble = random.nextDouble(); 
        System.out.println("Random Integer: " + randomInt);
        System.out.println("Random Double: " + randomDouble);
    }
}
