import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailTestXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("bhatthitesh86");
		driver.findElement(By.xpath("//input[@id='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("qwert");
		driver.findElement(By.xpath("//input[@id='signIn']")).click();
		
		String expectedErromsg = "Wrong password. Try again.";
		String actualErrormsg = driver.findElement(By.xpath("//span[@id='errormsg_0_Passwd']")).getText();
		
		if(expectedErromsg.equals(actualErrormsg)){
			System.out.println("Passed");
			
		}else{
			System.out.println("Failed");
		}
        driver.quit();
	}

}
