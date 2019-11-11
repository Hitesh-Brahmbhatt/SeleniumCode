import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) throws InterruptedException {
		//while we set path either set using double backward slash or single forward slash
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
        driver.findElement(By.id("Email")).sendKeys("bhatthitesh86");
        driver.findElement(By.id("next")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Passwd")).sendKeys("qwert");
        driver.findElement(By.id("signIn")).click();
        driver.quit();
	}

}