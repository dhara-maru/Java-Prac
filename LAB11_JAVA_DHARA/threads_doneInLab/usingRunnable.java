class thread2 implements Runnable{
	public void run(){
		for(int i=0; i<=5; i++){
			System.out.println(i);
			try{
				Thread.sleep(200);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
public class usingRunnable{
	public static void main(String[] args){
		thread2 t2 = new thread2();
		Thread obj = new Thread(t2);
		obj.start();
	}
}