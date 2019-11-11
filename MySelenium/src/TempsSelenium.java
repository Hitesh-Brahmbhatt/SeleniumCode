import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;




public class TempsSelenium {

	public static void main(String[] args) {
		
  FirefoxDriver driver= new FirefoxDriver();
  driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
   
    driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys("test34");
    driver.findElement(By.id("next")).click();
    
    driver.findElement(By.id("Passwd")).sendKeys("qwert");
    driver.findElement(By.id("signIn")).click();
    driver.quit();
    
	}

}
