import java.util.*;
class prac3b{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n= sc.nextInt();

		if(n%2==0){
			System.out.println("Even");

		}
		else{
			System.out.println("Odd");
		}

	}
}