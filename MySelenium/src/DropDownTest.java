import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		WebElement box= driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> alllinks = box.findElements(By.tagName("option"));
		System.out.println(alllinks.size());
		for(int i=0; i<alllinks.size();i++){
			if(alllinks.get(i).isSelected()){
			System.out.println(alllinks.get(i).getText()+"-----"+alllinks.get(i).isSelected());
		}
		}
		
		box.sendKeys("Baby");
		
		System.out.println("After Click");
		
		for(int i=0; i<alllinks.size();i++){
			if(alllinks.get(i).isSelected()){
			System.out.println(alllinks.get(i).getText()+"-----"+alllinks.get(i).isSelected());
		}
		}
	
		Select s = new Select(box);
	     s.selectByIndex(10);
		
	}

}
