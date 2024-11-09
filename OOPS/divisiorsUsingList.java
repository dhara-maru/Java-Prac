// ninjas 6 : Divisiors using List
import java.util.ArrayList; 
import java.util.List;      

public class divisiorsUsingList {
    public static List<Integer> printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();  
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);  
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        int N = 5;
        List<Integer> divisors = printDivisors(N);
        System.out.println(divisors);  
    }
}


