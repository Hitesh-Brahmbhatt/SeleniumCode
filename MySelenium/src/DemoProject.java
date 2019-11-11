import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DemoProject {

	public static void main(String[] args) throws InterruptedException {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Hitesh = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
		Actions builder = new Actions (driver);
		builder.moveToElement(Hitesh).build().perform();
	    
		
		WebElement H1 = driver.findElement(By.xpath(".//*[@id='menu-item-33']/ul"));
	   // List<WebElement> H2= H1.findElements(By.xpath(".//*[@id='menu-item-37']/a"));
			
	   builder.click(H1).build().perform();
	   
	   driver.findElement(By.className("wpsc_buy_button")).click();
	   driver.findElement(By.className("go_to_checkout")).click();
	   
	   
	   //IN CASE OF MORE THAN ONE ADD TO CART ; WITH SAME XPATH SYNTAX IS;
	   //(COMPLETE XPATH)[1,2]
	   
	  /*String Hits= driver.findElement(By.name("quantity")).getAttribute("value");
	  String Kinjs = driver.findElement(By.className("pricedisplay")).getText();
	   if(Hits.equalsIgnoreCase("1") && Kinjs.equals("$150.00")){
		   driver.findElement(By.linkText("Continue")).click();
	   }else{
		   System.out.println(Hits);
		   System.out.println(Kinjs);
		   System.out.println("Error Message");    
	   }
	   
	   
	   driver.findElement(By.xpath(".//*[@id='wpsc_checkout_form_9']")).sendKeys("bhatthitesh86@gmail.com");
	   driver.findElement(By.xpath(".//*[@id='wpsc_checkout_form_2']")).sendKeys("Hitesh");
	   driver.findElement(By.xpath(".//*[@id='wpsc_checkout_form_3']")).sendKeys("Brahmbhatt");
	   driver.findElement(By.xpath(".//*[@id='wpsc_checkout_form_4']")).sendKeys("Etobicoke");
	   driver.findElement(By.xpath(".//*[@id='wpsc_checkout_form_5']")).sendKeys("Toronto");
	   driver.findElement(By.xpath(".//*[@id='wpsc_checkout_form_6']")).sendKeys("ON");
	   
	   WebElement box= driver.findElement(By.id("wpsc_checkout_form_7"));
		List<WebElement> alllinks = box.findElements(By.tagName("option"));
		box.sendKeys("Canada");
		
		
		driver.findElement(By.xpath(".//*[@id='wpsc_checkout_form_8']")).sendKeys("M9W0E1");
		driver.findElement(By.xpath(".//*[@id='wpsc_checkout_form_18']")).sendKeys("6477178781");
		
		WebElement H12 = driver.findElement(By.xpath(".//*[@id='shippingSameBilling']"));
		H12.click();
		driver.findElement(By.cssSelector(".make_purchase.wpsc_buy_button")).click();
	   
	   */

		
	}

}
