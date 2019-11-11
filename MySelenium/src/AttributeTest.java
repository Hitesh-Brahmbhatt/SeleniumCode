import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AttributeTest {

	public static void main(String[] args) {
		

		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");

      String s=driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("placeholder");
      System.out.println(s);
	}

}
