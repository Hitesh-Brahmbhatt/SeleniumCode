import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Seleniumfirstclass {

	public static void main(String[] args) {
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/challenge/sl/password#password");
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("test34");
		driver.findElement(By.id("next")).click();
		
		//Thread.sleep(2000); TO GIVE A DELAY OF 2 SECONDS
		driver.findElement(By.id("Passwd")).sendKeys("qwert");
		driver.findElement(By.id("signIn")).click();
		//driver.quit(); TO CLOSE THE BROUSER AT THE END
	}
	

}
