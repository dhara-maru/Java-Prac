import java.io.*;
public class prg1{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("first.txt");
		BufferedReader br = new BufferedReader(fr);

		char c[] = new char[30];
		String line;
		if(br.ready()){
			//br.read(c);

			// for(int i=0; i<30; i++){
			// 	System.out.print(c[i]);
			// }
 
			while((line=br.readLine())!= null){
				System.out.println(line);
			}
			
		}
	}
}