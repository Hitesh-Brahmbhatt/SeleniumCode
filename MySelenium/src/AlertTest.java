import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
        driver.findElement(By.id("Email")).sendKeys("bhatthitesh86");
        driver.findElement(By.id("Email")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("Passwd")).sendKeys("qwert");
        driver.findElement(By.id("Passwd")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        Alert a1 = driver.switchTo().alert();
        System.out.println( a1.getText());
        a1.accept();
        //at.accept accepts default selection; if we want to dismiss we use a1.dismiss();
       
        
        
	}

}
