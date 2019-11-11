import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaSkript {

	public static void main(String[] args) {


		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.tdcanadatrust.com/m/products-services/banking/electronic-banking/easyweb.jsp");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scroll(0,1000)", "");
		jse.executeScript("window.scroll(0,500)","");
		
	}

}
