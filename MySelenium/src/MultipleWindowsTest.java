import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleWindowsTest {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.tdcanadatrust.com/products-services/banking/index-banking.jsp");
       
		
		driver.findElement(By.linkText("Privacy and Security")).click();
		
		Set<String >allWindows= driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String mainWindow = iter.next();
		String childWindow = iter.next();
		
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		
		
		
	}

}
