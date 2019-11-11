import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebListTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		
	
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
		for (int i=0;i<alllinks.size();i++){
			System.out.println(alllinks.get(i).getText());	
		}
		
		WebElement Footer = driver.findElement(By.xpath("//ul[@id='footer-list']"));
		List<WebElement> Hitesh = Footer.findElements(By.tagName("a"));
		System.out.println(Hitesh.size());
		
		for(int i=0; i<Hitesh.size();i++){
			System.out.println(Hitesh.get(i).getText());
		}	
	}
	
	
}
