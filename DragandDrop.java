package Task18_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();    //Launch the browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://jqueryui.com/droppable/");     //load the url
		
		driver.manage().window().maximize();    //maximize the window
		
		Actions mouse =new Actions(driver);         //using action class for drag and drop
		
		driver.switchTo().frame(0);   //to switch the frame using index
		
		WebElement drag = driver.findElement(By.id("draggable"));        //find the dragged element
		
	WebElement drop = driver.findElement(By.id("droppable"));             //find the drop element
		
		mouse.dragAndDrop(drag, drop).perform();                //to performing drag and drop 
		
	String droppedtext =	driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();            // to verify the message

	System.out.println(droppedtext);                  //print the message
	
	
	driver.close();
	}

}
