import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigateTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.ca/?gfe_rd=cr&ei=8R9xWNnWC8qC8QfPmJ_QCw&gws_rd=ssl");
		driver.navigate().to("https://www.google.ca/?gfe_rd=cr&ei=8R9xWNnWC8qC8QfPmJ_QCw&gws_rd=ssl");
        //difference between driver.get and driver.navigate as navigate gives you more options like back,forwardbutton.
		//driver.get is just one fixed method. and no other functions
		driver.navigate().refresh();
		
	}

}
