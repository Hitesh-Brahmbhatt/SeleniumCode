import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

 
public class BrowserSelectionTest {

	public static void main(String[] args) {
		
		String Browser = "IE";
		WebDriver driver;
		//below we have used == but always used .equals As .equal is a method from a string class... .equal is always for strings
		if(Browser=="FF"){
		driver = new FirefoxDriver();
		}else if (Browser=="IE"){
			System.setProperty("webdriver.ie.driver", "F:\\SeleniumJars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else{
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
			
			driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	        driver.findElement(By.id("Email")).sendKeys("bhatthitesh86");
	        driver.findElement(By.id("next")).click();
			
	}	

}

