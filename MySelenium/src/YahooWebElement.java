import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class YahooWebElement {

	public static void main(String[] args) throws InterruptedException {

 FirefoxDriver driver = new FirefoxDriver();
 driver.get("https://ca.yahoo.com/?p=us");
 
 driver.findElement(By.xpath(".//*[@id='search-assist-input']/div[1]/input")).sendKeys("canada");
 Thread.sleep(2000);
 for(int i=1;i<=4;i++){
 String S = driver.findElement(By.xpath(".//*[@id='search-assist-input']/div[2]/ul/li["+i+"]/div")).getText();
 System.out.println(S);
	}

	}
}
