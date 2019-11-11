package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GHJF {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Hitesh");
		
		String SS=driver.findElement(By.xpath(".//*[@id='u_0_1']")).getCssValue("name");
		System.out.println(SS);
		

	}
	

}
