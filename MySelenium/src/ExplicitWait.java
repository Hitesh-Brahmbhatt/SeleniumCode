import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys("bhatthitesh86");
        driver.findElement(By.id("next")).click();
       
        WebDriverWait Wait = new WebDriverWait(driver,30);
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
        
        
        
        
        driver.findElement(By.id("Passwd")).sendKeys("qwert");
        driver.findElement(By.id("signIn")).click();
        driver.quit();
        
        
        // Thread. sleep is FIX TIME WAIT.
        
       /* Implicit Wait is an in build Firefox Function
        It is used to find visibility of Element
        
        Explicit wait is external webdriver class.
        We can use multiple conditions with Explicit Class. We can use same webdriver in any browsers.
        We can give different conditions to locate different elements by creating different variables like Wait,Wait1 Etc.*/
       
        
       //Fluent Wait : Waits for atleast minimum seconds allotted. Like compulsorily waits for 5 seconds even if element is found within 2 seconds.
	}

}
