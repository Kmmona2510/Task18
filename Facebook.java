package Task18_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();              //Launch the Driver
		
		driver.navigate().to("https://www.facebook.com/");     //Load the url
		driver.manage().window().maximize();                   //maximize the window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));      //using wait for search the webelement
		String title = driver.getTitle();                         //verify the the url in correct website
		
		System.out.println("The page landed in:" +title);             //print the title
		
		driver.findElement(By.linkText("Create new account")).click();            //clik the create account
		
		driver.findElement(By.name("firstname")).sendKeys("Raju");               // send the values  to firstname  field
		
		driver.findElement(By.name("lastname")).sendKeys("Ram");                //send the values to lastname  field
		
		driver.findElement(By.name("reg_email__")).sendKeys("mohanamoorthi013@gmail.com");         //send the email to email field
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mohanamoorthi013@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Abc@123");                //send the password
		
	WebElement day	= driver.findElement(By.id("day"));             //select the values to using select class 
	
	Select select_day = new Select(day);
	
	select_day.selectByVisibleText("11");                //using select class select the options as given
	
	WebElement month = driver.findElement(By.id("month"));         
	
	Select select_month = new Select(month);
	
	select_month.selectByValue("5");
	
	WebElement year = driver.findElement(By.id("year"));
	
	Select select_year = new Select(year);
	
	select_year.selectByVisibleText("1985");

	driver.findElement(By.className("_8esa")).click();      // click the radio button
	
	 
	driver.findElement(By.name("websubmit")).click();         //click the submit button
	
	driver.findElement(By.linkText("No, Create New Account")).click();
	
	String text=driver.findElement(By.className("uiHeaderTitle")).getText();
	
	System.out.println("the page landed correct webpage :" +text);             //to verify the page
	
	 
	
	driver.close();
	
		
		
		

	}

}
