 import java.util.Scanner;
public class lt1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num 1 :");
		int a = sc.nextInt();
		System.out.print("Enter num 2 :");
		int b = sc.nextInt();
		int c;

		int arr[] = {1,2,3,4,5};

		try{
			c = a/b;
			System.out.println("division : "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero is not possible !!!");
		}

		try{
			for(int i=0; i<=5; i++){
			System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Array index is out of bound !!!");
		}

		System.out.println("A + B = "+(a+b));
		System.out.println("A - B = "+(a-b));

		
	}
}