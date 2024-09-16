import java.util.*;
class avgofarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[4];

        for(int i=0; i<a.length; i++){
            System.out.println("Enter array element - ");
            a[i] = sc.nextInt();
        }
        int total = 0;
        for(int i=0; i<a.length; i++){
            total = total + a[i];
        }

        float avg = total/4;

        System.out.println("Average of elements - "+avg);
    }
}