
import java.util.*;

class bubblesort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size - ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter elem " + i + ":");
            arr[i] = sc.nextInt();

        }

        //bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
