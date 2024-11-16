class gm extends Thread{
	public void run(){
		for(int i=0; i<=5; i++){
			System.out.println("Good Morning!");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class ga extends Thread{
	public void run(){
		for(int i=0; i<=5; i++){
			System.out.println("Good Afternoon!");
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
public class greetthread{
	public static void main(String[] args){
		ga ga1 = new ga();
		gm gm1 = new gm();

		for(int i=0; i<=5; i++){
			System.out.println("main method!");
			try{
				Thread.sleep(300);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}

		ga1.start();
		gm1.start();
	}
}