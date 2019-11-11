import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailTest1 {

	public static void main(String[] args) throws InterruptedException {
		
	 FirefoxDriver driver = new FirefoxDriver();
     driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
     
     
     
     driver.findElement(By.name("identifier")).sendKeys("bhatthitesh86"); 	
     driver.findElement(By.id("identifierNext")).click();
     //driver.findElement(By.className(rccbutton)) We can not use compound Class Name ; avoid space and use first half of Class name i.e. rccbutton only
     //Because Next name is signIn && SignIn name is SignIn therefore use different locator; First we used Name.signIn than used Id.signIn
     Thread.sleep(2000);
     driver.findElement(By.name("password")).sendKeys("qweer");
     driver.findElement(By.id("passwordNext")).click();
     System.out.println("Wrong Password!");
     driver.quit();
     
     
     
  
     
	}

}
