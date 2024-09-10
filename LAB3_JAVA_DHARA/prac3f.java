import java.util.*;
class prac3f{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n= sc.nextInt();

		int rev=0;
		int temp = n;

		while(n>0){
			int r = n % 10;
			rev = rev * 10 + r;
			n /= 10;

		}
		if(rev == temp){
			System.out.println("number is palindrome");

		}
		else{
			System.out.println("number is not palindrome");
		}
	}
}