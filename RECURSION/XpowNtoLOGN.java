
public class XpowNtoLOGN {

    public static int power(int x, int n) {
        if (n == 0) { //base 1
            return 1;
        }
        if (x == 0) {   //base2
            return 0;
        }

        //if n is even
        if (n % 2 == 0) {   //if 2^4 = (2*2) * (2*2) = 16
            return power(x, n / 2) * power(x, n / 2);

        } else {    //if 2^3 to LogN = (2*1.5) * (2*1.5) * 2 
            return power(x, n / 2) * power(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 4;
        int ans = power(x, n);
        System.out.println(ans);
    }
}
