import java.util.*;
class prac3c{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n1= sc.nextInt();
		System.out.println("Enter a number: ");
		int n2= sc.nextInt();
		System.out.println("Enter a number: ");
		int n3= sc.nextInt();

		int max = ((n1 > n2 && n1 > n3)? n1:  (n1>n3 ? n2:n3));

		System.out.println("Max - "+max);


	}
}