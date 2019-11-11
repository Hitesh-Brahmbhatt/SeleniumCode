import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RadioButtonTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> groupOneRadios = driver.findElements(By.name("group1"));
		System.out.println(groupOneRadios.size());
		
		for(int i=0; i<groupOneRadios.size();i++){
			if(groupOneRadios.get(i).isSelected()){
			System.out.println(groupOneRadios.get(i).getAttribute("Value")+"----"+groupOneRadios.get(i).isSelected());
		}
		}
		groupOneRadios.get(2).click();
		System.out.println("=========After Click========");
		
		for(int i=0; i<groupOneRadios.size();i++){
			System.out.println(groupOneRadios.get(i).getAttribute("Value")+"----"+groupOneRadios.get(i).isSelected());
		}
		}	
	}


