import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ElementPresentTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		
		List<WebElement> H1 = driver.findElements(By.linkText("Advertising"));
		System.out.println(H1.size());
		
	
	   if (H1.size() != 0){
		System.out.println("Element Present");
		
	}else{
		System.out.println("Element Not Present");
	}
		
		
		
	
			
		}
	}


