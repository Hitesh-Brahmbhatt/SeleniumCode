 	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com/");
		
		WebElement Jigar = driver.findElement(By.xpath(".//*[@id='nav-flyout-anchor']"));
		
		
			
		Actions builder = new Actions(driver);
        builder.moveToElement(Jigar).build().perform();
        
//       WebElement H1 = driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]"));
//       List<WebElement> H2 = H1.findElements(By.className("nav-text"));
//       
//       System.out.println(H2.size());
//       
//       for(int i=0;i<H2.size();i++){
//    	   System.out.println(H2.get(i).getText());
//       }
	}

}
