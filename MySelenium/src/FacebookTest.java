import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FirefoxDriver driver= new FirefoxDriver();
       driver.get("https://www.facebook.com/");
       
       driver.findElement(By.xpath("//input[@id='u_0_3']")).sendKeys("Brahmbhatt");
       driver.findElement(By.xpath("//input[@id='u_0_5']")).sendKeys("6477178781");
       driver.findElement(By.xpath("//input[@id='u_0_8']")).sendKeys("6477178781");
       driver.findElement(By.xpath("//input[@id='u_0_a']")).sendKeys("qwertyu");
       driver.findElement(By.xpath("//button[@id='u_0_e']")).click();
       
       String expectederrormsg= "What’s your name?";
       String actualerrormsg= driver.findElement(By.xpath("//div[@class='_5633 _5634 _53ij']")).getText();
	  
       if(expectederrormsg.equals(actualerrormsg)){
    	   System.out.println("Passed");
    	   
       }else{
    	   System.out.println("Failed");
       }
       driver.quit();
       
	}

}
