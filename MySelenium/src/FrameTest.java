import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FrameTest {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/droppable/");
		
		List<WebElement> H1 = driver.findElements(By.linkText("Sortable"));
		System.out.println(H1.size());
		
	
	   if (H1.size() != 0){
		System.out.println("Sortable Element Present");
		
	}else{
		System.out.println("Sortable Element Not Present");
	}
	

	   List<WebElement> H2 = driver.findElements(By.id("draggable"));
		System.out.println(H2.size());
		
	   if (H2.size() != 0){
		System.out.println(" Draggable Element Present");
		
	}else{
		System.out.println("Draggable Element Not Present");
	}
	//Webelement frame = driver.findElement(By.classname("demo-free"));	
   //below we are switching by index; calculate iframe number from HTML; here it is first one therefore 0
	   driver.switchTo().frame(0);
	   //driver.switchTo().frame("DEMO-FRAME")==assuming demo frame is id for iframe
	   //driver.switchTo().frame(frame)===using webelement - frame in argumemt which is declared on line 36th
	

	   System.out.println("======After Switch to Iframe========");
	   
	   H1 = driver.findElements(By.linkText("Sortable"));
	   if (H1.size() != 0){
			System.out.println("Sortable Element Present");
			
		}else{
			System.out.println("Sortable Element Not Present");
		}
	   
	   H2 = driver.findElements(By.id("draggable"));
	   if (H2.size() != 0){
			System.out.println(" Draggable Element Present");
			
		}else{
			System.out.println("Draggable Element Not Present");
		}
	   
	   
	   driver.switchTo().defaultContent();
	   
	   System.out.println("=======AFTER SWITCHING TO DEFAULT========");
	   
	   H1 = driver.findElements(By.linkText("Sortable"));
	   if (H1.size() != 0){
			System.out.println("Sortable Element Present");
			
		}else{
			System.out.println("Sortable Element Not Present");
		}
	   
	   H2 = driver.findElements(By.id("draggable"));
	   if (H2.size() != 0){
			System.out.println(" Draggable Element Present");
			
		}else{
			System.out.println("Draggable Element Not Present");
		}
	   
	}

}
