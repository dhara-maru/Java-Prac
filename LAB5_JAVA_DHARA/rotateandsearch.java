
import java.util.*;

public class rotateandsearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array - ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int temp[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + "-");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter rotation point of array - ");
        int rotation = sc.nextInt();
        System.out.print("Enter the element you want to search - ");
        int search = sc.nextInt();

        int pointer = 0;

        for (int i = rotation; i < arr.length; i++) {
            temp[pointer] = arr[i];
            pointer++;

        }
        for (int i = 0; i < rotation; i++) {
            temp[pointer] = arr[i];
            pointer++;

        }

        boolean flag = true;
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == search) {
                flag = false;
                index = i;
                break;
            }
        }
        if (flag == false) {
            System.out.println("element is found at index - " + index);
        } else {
            System.out.println("-1");
        }

    }

}
