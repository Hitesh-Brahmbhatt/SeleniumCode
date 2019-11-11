import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Read_PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fs = new FileInputStream("F:\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("testSiteName"));
		System.out.println(prop.getProperty("enviornment"));
		
	
	

	}

}
