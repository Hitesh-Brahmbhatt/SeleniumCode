 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Read_Write_TextFile {

	public static void main(String[] args) throws IOException {
		
		//Creating
		File f = new File("F:/testing/temp.text");
		f.createNewFile();
		
		//Writing
		FileWriter W = new FileWriter("F:/testing/temp.text");
		BufferedWriter out = new BufferedWriter(W);
		
		out.write("Hello World");
		out.newLine();
		out.write("Line 1");
		out.newLine();
		out.write("Line 2");
		out.flush();//MOST IMPORTANT LINE  IF WE DONT FLUSH IT WILL NOT WRITE
		
		//Reading
		FileReader R = new FileReader("F:/testing/temp.text");
		BufferedReader rd = new BufferedReader(R);
		
			
		String x="";
		int count=0;
		
		while((x=rd.readLine())!=null){
			System.out.println(x);
			count = count++;
			
		}
		
		
		

	}

}
