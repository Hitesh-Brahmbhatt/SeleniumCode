import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDropTest {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		
		
		Actions builder =  new Actions(driver);
		
        Thread.sleep(2000);
		builder.contextClick(draggable); // right click on draggable webelement
		
		
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		
		
		

	}

}
