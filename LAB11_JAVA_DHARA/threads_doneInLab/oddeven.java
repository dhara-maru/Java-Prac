class odd extends Thread{
	public void run(){
		for(int i=0; i<=10; i++){
			if(i % 2!=0){
				System.out.println("odd : "+i);
			}
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class even extends Thread{
	public void run(){
		for(int i=0; i<=10; i++){
			if(i % 2==0){
				System.out.println("Even : "+i);
			}
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
public class oddeven{
	public static void main(String[] args){
		odd o1 = new odd();
		even e1 = new even();
		o1.start();
		e1.start();
	}
}