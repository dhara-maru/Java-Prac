import java.io.*;
public class prg3{
	public static void main(String[] args) throws IOException{
		try{
			FileReader fr = new FileReader("first.txt");
			BufferedReader br = new BufferedReader(fr);

		char c[] = new char[30];
		String st;
String newst;
		st = br.readLine();
		
		while(st !=null){
			
			String[] words = st.split(" ");
			
			for(int i=0; i<words.length; i++){
				if(words[i].equals("word1")){

					
					newst = st.replace("word1", "word2");
					System.out.println(newst);
					System.out.println("word is replaced");
				}
			}
			st = br.readLine();

			System.out.println("word is replaced");

			}	
  
		}
		catch(FileNotFoundException fe){
			System.out.println("File not found !");
		}
		
	}
}