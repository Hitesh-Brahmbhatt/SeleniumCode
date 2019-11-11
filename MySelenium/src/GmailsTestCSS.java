import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailsTestCSS {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("bhatthitesh86");
        driver.findElement(By.cssSelector("input[id^='ne']")).sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("input[id$='wd']")).sendKeys("qwert");
        driver.findElement(By.cssSelector("input[id='next'][name='signIn']")).sendKeys(Keys.ENTER);
       

	}

}
