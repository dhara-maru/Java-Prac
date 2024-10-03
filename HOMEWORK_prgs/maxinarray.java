
public class maxinarray {

    public static void main(String[] args) {
        int arr[] = {34, 56, 34, 78, 6, 234, 89, 5, 2, 6, 87, 4556};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // max = Math.max(max, arr[i]);     //largest
            max = Math.max(max, arr[i - 1]);    //second largest
        }

        // System.out.println(max); //largest
        System.out.println(max); //second largest
    }
}
