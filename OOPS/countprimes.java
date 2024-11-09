
// ninjas : prime counter between range
import java.util.*;
import java.io.*;
import java.util.Scanner;

class CountPrime {
    public int totalPrime(int s, int e) {
        int count = 0;
        for (int i = s; i <= e; i++) {
            if (i < 2)
                continue;
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
            }
        }
        return count;
    }
}

class countprimes {
    public static void main(String args[]) {

        CountPrime obj = new CountPrime();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(obj.totalPrime(s, e));
    }
}
