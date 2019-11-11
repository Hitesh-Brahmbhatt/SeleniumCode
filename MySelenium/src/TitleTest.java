import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TitleTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/?gfe_rd=cr&ei=oEdpWLCaFaGC8QeIwK3wDA&gws_rd=ssl");
		
		driver.findElement(By.linkText("Advertising")).click();
		
		String ExpectedUrl = "https://www.google.ca/intl/en/ads/?fg=1";
		String ActualUrl = driver.getCurrentUrl();
		
		String ExpectedTitle= "Google Ads";
		String ActualTitle= driver.getTitle();
		
		if(ExpectedUrl.equalsIgnoreCase(ActualUrl) && ExpectedTitle.equalsIgnoreCase(ActualTitle)){
			System.out.println("Passed");
		}else{
			System.out.println("Failed");
		}
		 if(driver.getPageSource().contains("Looking to grow your business? We can help.")){
			System.out.println("Passed"); 
		 }else{
			 System.out.println("Failed");
		 }
		
		
	}
	
	
	
	
	

}
