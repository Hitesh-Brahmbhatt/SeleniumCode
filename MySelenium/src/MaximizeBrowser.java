import org.openqa.selenium.firefox.FirefoxDriver;


public class MaximizeBrowser {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		

	}

}
