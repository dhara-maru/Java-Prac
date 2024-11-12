import java.util.Scanner;
class Account{
	int acno;
	double bal;
	Account(){
		bal = 1000.00;
	}
	public double checkbal(){
		return bal;
	}
	public void deposit(double amt){
		System.out.println("Amount Deposited :"+amt);
		bal = bal + amt;
		System.out.println("Current balance :"+bal);
	}
	public void withdraw(double amt)throws InSufficientFundException{
		

		System.out.println("Amount withdrawn :"+amt);
		bal = bal - amt;
		if(bal <= 1000){
			throw new InSufficientFundException("InSufficient balance ! cannot have balance less than 1000 rs.");
		}
		
		System.out.println("Current balance :"+bal);
	}
}
class InSufficientFundException extends Exception{
	public InSufficientFundException(String msg){
		super(msg);
	}
}
public class lt2{
	public static void main(String args[])throws InSufficientFundException{
		Account a1 = new Account();
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("Operations : ");
		System.out.println("press 1 for money deposit ");
		System.out.println("press 2 for withdraw");
		System.out.println("press 3 for balance checking");
		System.out.println("press 4 for exit");
		
		int choice = sc.nextInt();

		if(choice==1){
			System.out.println("Enter amount to deposit :");
			double amt = sc.nextDouble();
			a1.deposit(amt);
		}
		if(choice==2){
			try{
				System.out.println("Enter amount to withdraw :");
				double amt = sc.nextDouble();
				a1.withdraw(amt);
			}
			catch(InSufficientFundException msg){
				System.out.println("InSufficient balance exception : "+msg.toString());
			}
			
		}
		if(choice==3){
			System.out.println("Current balance is :"+a1.checkbal());
			
		}
		if(choice ==4){
			System.out.println("Okay bye");
			System.exit(0);
		}
	}
	}
}