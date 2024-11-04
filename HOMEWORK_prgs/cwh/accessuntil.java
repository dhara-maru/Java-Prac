import java.util.Scanner;

public class accessuntil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        try {
            while (true) {
                System.out.print("Enter index to view its data : ");
                int index = sc.nextInt();
                System.out.println("Data : " + arr[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
