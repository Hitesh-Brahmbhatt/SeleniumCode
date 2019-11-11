import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleXpathTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/?gfe_rd=cr&ei=jNVnWJHROqWC8Qfn9a_wBw&gws_rd=ssl");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Canada");
		Thread.sleep(2000);
		
		for(int i=0;i<=3;i++){
			 String Option= driver.findElement(By.xpath(".//*[@id='sbse"+i+"']/div[2]")).getText();
			    System.out.println("" +Option);
		}
		
	}

}
