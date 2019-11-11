import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebElementTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
        //driver.findElement(By.id("Email")).sendKeys("bhatthitesh86"); this line can be written as below two lines
		//companies uses webelement declaration  method
        WebElement hitesh = driver.findElement(By.id("Email"));
        hitesh.sendKeys("bhatthitesh86");
		
		WebElement Kinjal=driver.findElement(By.id("next"));
		Kinjal.click();
        //in above statement driver.findElement(By.id("next")) is a webElement with Kinjal Variable
		
        Thread.sleep(2000);
        driver.findElement(By.id("Passwd")).sendKeys("qwert");
        driver.findElement(By.id("signIn")).click();
	}

}
