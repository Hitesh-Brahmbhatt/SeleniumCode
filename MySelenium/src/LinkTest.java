import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinkTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/?gfe_rd=cr&ei=oEdpWLCaFaGC8QeIwK3wDA&gws_rd=ssl");
		
		//driver.findElement(By.linkText("Advertising")).click();
		driver.findElement(By.partialLinkText("Advert")).click();
		
	}

}
