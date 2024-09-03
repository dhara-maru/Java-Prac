import java.util.Scanner;
class labAq2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value :");
		int v1 = sc.nextInt();

		System.out.println("Enter a Second value :");
		int v2 = sc.nextInt();

		System.out.println("Enter any Operator :");
		char opr = sc.next().charAt(0);

		int sum = v1+v2;
		int sub = v1-v2;
		int mul = v1*v2;
		int div = v1/v2;
		// if(opr == '+'){
		// 	System.out.println("Sum : "+ sum);
		// }
		// else if(opr == '-'){
		// 	System.out.println("Sub : "+ sub);
		// }
		// else if(opr == '*'){
		// 	System.out.println("Mul : "+ mul);
		// }
		// else if(opr == '/'){
		// 	System.out.println("Division : "+ div);
		// }
		// else{
		// 	System.out.println("Enter a valid operator");
		// }

		switch(opr){

		case '+':
			System.out.println("Sum : "+ sum);
			break;
		case '-':
			System.out.println("Sub : "+ sub);
			break;
		case '*':
			System.out.println("Mul : "+ mul);
			break;
		case '/':
			System.out.println("Div : "+ div);
			break;
		}

	}
}