import java.util.*;
class prac3a{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter marks m1: ");
		int m1= sc.nextInt();
		System.out.println("Enter marks m2: ");
		int m2= sc.nextInt();
		System.out.println("Enter marks m3: ");
		int m3= sc.nextInt();
		System.out.println("Enter marks m4: ");
		int m4= sc.nextInt();
		System.out.println("Enter marks m5: ");
		int m5= sc.nextInt();


		int total = m1+m2+m3+m4+m5;

		float pr = total/5;

		if(pr>=60){
			System.out.println("First division");
		}
		else if(pr>=50 && pr<=59){
			System.out.println("Second division");
		}
		else if(pr>=40 && pr<=49){
			System.out.println("Second division");
		}
		else if(pr<40){
			System.out.println("Failed");
		}
		else{
			System.out.println("Invalid");
		}
	}
}