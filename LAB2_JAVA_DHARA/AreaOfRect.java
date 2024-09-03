import java.util.*;
class AreaOfRect{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length :");
		int l = sc.nextInt();

		System.out.println("Enter width :");
		int w = sc.nextInt();

		float area = l * w;

		System.out.println("Area of rectangle is :" + area);


	}
}