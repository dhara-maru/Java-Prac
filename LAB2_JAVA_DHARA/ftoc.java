import java.util.*;
class ftoc{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

System.out.println("Choose an operation :");
System.out.println("Press 1 for Fahrenheit to Celcius");
System.out.println("Press 2 for Celcius to Fahrenheit");

int choice = sc.nextInt();

if(choice == 1){
	System.out.println("Enter a Fahrenheit value :");
	int f1 = sc.nextInt();
	float ftoc = (f1-32) * 5/9;
	System.out.println("Fahrenheit to Celcius is :" + ftoc);
	
}
else if(choice == 2){
	System.out.println("Enter a Celcius value :");
	int c1 = sc.nextInt();
	float ctof = c1 * (9/5) + 32;
	System.out.println("Celcius to Fahrenheit is :" + ctof);
}
else{
	System.out.println("Enter a valid choice!!");
}
		



	}
}