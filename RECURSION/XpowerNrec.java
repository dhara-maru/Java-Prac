
public class XpowerNrec {

    public static int power(int x, int n) {
        if (n == 0) { //base 1
            return 1;
        }
        if (x == 0) {   //base2
            return 0;
        }

        int xpownm1 = power(x, n - 1); //x power n-1
        int xpown = x * xpownm1; //x power n = x ^ n-1
        return xpown;

    }

    public static void main(String[] args) {
        int x = 2, n = 3;
        int ans = power(x, n);
        System.out.println(ans);
    }
}
