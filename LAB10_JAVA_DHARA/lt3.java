class DarshanUniException extends Exception{
	public DarshanUniException(String msg){
		super(msg);
	}
}
public class lt3{
	public static void main(String[] args)throws DarshanUniException{
		try{
			System.out.println("Hello");
			throw new DarshanUniException("This is Darshan Uni Custom excepion");

		}
		catch(DarshanUniException e){
			System.out.println(e.toString());
		}
	}
}