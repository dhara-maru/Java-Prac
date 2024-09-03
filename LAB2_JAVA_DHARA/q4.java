import java.util.*;
class q4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value :");
		int v1 = sc.nextInt();

		System.out.println("Enter  Second value :");
		int v2 = sc.nextInt();

		System.out.println("Enter third value :");
		int v3 = sc.nextInt();

int max = 0;

if(v1 > v2 && v1 > v3){
	 max = v1;

	}
	else if (v2 > v1 && v2>v3){
		 max = v2;

	}
	else{
		 max = v3;
	}

	System.out.println("Max value is :" + max);
}
}