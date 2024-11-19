import java.io.*;
public class prg2{
	public static void main(String[] args) throws IOException{
		try{
			FileReader fr = new FileReader("first.txt");
			BufferedReader br = new BufferedReader(fr);

		int line=0;
		int wordscount=0;
		int chars = 0;
		char c[] = new char[30];
		String st;

		st = br.readLine();
		
		while(st !=null){
			line++;
			String[] words = st.split(" ");
			wordscount = wordscount + words.length;
			for(int i=0; i<words.length; i++){
				chars = chars + words[i].length();
			}
			st = br.readLine();



			}	

			System.out.println("Lines in file : "+line);
			System.out.println("words in file : "+wordscount);
			System.out.println("Characters in file : "+chars);
			



		}
		catch(FileNotFoundException fe){
			System.out.println("File not found !");
		}
		
	}
}