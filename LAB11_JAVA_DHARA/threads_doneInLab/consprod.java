class product{
	int item;
	synchronized void prod_put(int item){
		this.item = item;
		for(int i=1; i<=item; i++){
			System.out.println("Produced item : "+i);
			try{
				Thread.sleep(500);

			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	synchronized void prod_get(){
		this.item = item;
		for(int i=1; i<=item; i++){
			System.out.println("Consumed item : "+i);
			try{
				Thread.sleep(500);

			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
class producer extends Thread{
	product p;
	producer(product p){
		this.p=p;

	}
	public void run(){
		p.prod_put(5);
	}
}
class consumer extends Thread{
	product p;
	consumer(product p){
		this.p=p;

	}
	public void run(){
		p.prod_get();
	}
}
public class consprod{
	public static void main(String[] args){
		product p = new product();
		producer p1 = new producer(p);
		consumer c1 = new consumer(p);
		p1.start();
		c1.start();
	}
}