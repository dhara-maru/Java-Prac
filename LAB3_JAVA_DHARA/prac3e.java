import java.util.*;
class prac3e{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int y= sc.nextInt();

		if((y%4==0 && y%100 != 0) || y%400==0){
			System.out.println("leap year");

		}
		else{
			System.out.println("not a leap year");
		}
	}
}
