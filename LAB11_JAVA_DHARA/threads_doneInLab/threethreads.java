import java.util.*;
class randomt extends Thread{
	Random r = new Random();
	int n = r.nextInt(100);
	public void run(){
	
			if(n%2 ==0){
				square s = new square(n);
				s.start();
			}
			else if(n%2 != 0){
				cube c = new cube(n);
				c.start();
			}
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
class square extends Thread{
	int x;
	square(int i){
		this.x = i;
	}
	public void run(){
		int sn = x * x;
		System.out.println("Sqaure of "+x+" is : "+sn);

	}
}
class cube extends Thread{
	int x;
	cube(int i){
		this.x = i;
	}
	public void run(){
		int cn = x * x * x;
		System.out.println("Cube of "+x+" is : "+cn);
		
	}
}
public class threethreads{
	public static void main(String[] args){
		randomt obj = new randomt();
		obj.start();
	}
}