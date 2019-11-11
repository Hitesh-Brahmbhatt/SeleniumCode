import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://ca.yahoo.com/?p=us");
		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:/Screenshot/screenshot.png"));
		
		

	}

}
