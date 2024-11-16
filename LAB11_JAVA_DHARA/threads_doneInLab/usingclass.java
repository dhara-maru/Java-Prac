class thread1 extends Thread{
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

public class usingclass{
	public static void main(String[] args){
		thread1 t1 = new thread1();
		t1.start();
	}
}