import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TesttingFile {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/NIRALI/Downloads/test[1].html");
		
		String S = driver.findElement(By.xpath(".//*[@id='fname']")).getText();
        System.out.println(S);
	}

}
