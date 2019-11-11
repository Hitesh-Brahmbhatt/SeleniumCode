import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class FireFoxProfileTest {

	public static void main(String[] args) {
		
		ProfilesIni p1= new ProfilesIni();
		FirefoxProfile profile = p1.getProfile("Kinjal");
		
		FirefoxDriver driver = new FirefoxDriver(profile);
		//driver.get("http://www.ebay.com/");*/
		}

}
