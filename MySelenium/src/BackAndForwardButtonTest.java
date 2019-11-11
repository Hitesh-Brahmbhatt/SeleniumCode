import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BackAndForwardButtonTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		//as webdriver is interface we can write above line as below;
		//Webdriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/?gfe_rd=cr&ei=8R9xWNnWC8qC8QfPmJ_QCw&gws_rd=ssl");
		driver.findElement(By.linkText("Advertising")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
			
	}

}
