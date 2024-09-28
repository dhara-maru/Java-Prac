
public class sumofNnatural {

    public static void printsum(int i, int n, int sum) {
        if (i == n) {   //if i reaches n then also we'll have to do sum once more bcoz we want to include the N too. 
            sum = sum + i;
            System.out.println(sum);
            return;
        }

        sum = sum + i;  //sum = sum + reached number
        printsum(i + 1, n, sum);    //now pass next number (i+1), the actual N (reached number), and previous answer (sum).

    }

    public static void main(String[] args) {
        printsum(1, 5, 0); //starting from 1, upto 5(n) and sum at the starting is 0.
    }
}
