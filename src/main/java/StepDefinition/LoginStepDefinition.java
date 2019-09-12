package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginStepDefinition {

	 WebDriver driver ;
	@Given("^User is already on the login page$")
	
    public void user_already_login_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kushal.Gaddhyan\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
		}
	
	@Then("^User enters username and enters password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@name = 'userName']")).sendKeys("kushalgaddhyan");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Shellsbo@12345");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Welcome: Mercury Tours", title);
		
	}
	
	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() {
	driver.findElement(By.xpath("//input[@name='login']")).click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	}
	
	@Then("^User enters flight details and preferences$")
	public void user_enters_details_on_home_page()
	{
		driver.findElement(By.xpath("//input[@value ='oneway']")).click();
		WebElement testDropDown = driver.findElement(By.name("passCount"));  
		Select dropdown = new Select(testDropDown);
		dropdown.selectByValue("1");
		WebElement testDropDown1 = driver.findElement(By.name("fromPort"));
		Select dropdown1 = new Select(testDropDown1);
		dropdown1.selectByValue("Frankfurt");
		WebElement testDropDown2 = driver.findElement(By.name("fromMonth"));
		Select dropdown2 = new Select(testDropDown2);
		dropdown2.selectByValue("9");
		WebElement testDropDown3 = driver.findElement(By.name("fromDay"));
		Select dropdown3 = new Select(testDropDown3);
		dropdown3.selectByValue("14");
		WebElement testDropDown4 = driver.findElement(By.name("toPort"));
		Select dropdown4 = new Select(testDropDown4);
		dropdown4.selectByValue("London");
		WebElement testDropDown5 = driver.findElement(By.name("toMonth"));
		Select dropdown5 = new Select(testDropDown5);
		dropdown5.selectByValue("12");
		WebElement testDropDown6 = driver.findElement(By.name("toDay"));
		Select dropdown6 = new Select(testDropDown6);
		dropdown6.selectByValue("10");
		driver.findElement(By.xpath("//input[@name = 'servClass'] [@value= 'Business']")).click();
		WebElement testDropDown7 = driver.findElement(By.name("airline"));
		Select dropdown7 = new Select(testDropDown7);
		dropdown7.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name= 'findFlights']")).click();
	}
	
	@Then("^User selects the flight and clicks on Continue$")
	public void user_selects_flight() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,1000)", "");
		 driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
	}
	
	@Then("^User enters passenger details$")
	public void user_enter_traveller_details()
	{
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("kushal");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("gaddhyan");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("1234123412341234");
		driver.findElement(By.xpath("//input[@name ='buyFlights']")).click();
	}
	
	@Then("^User logs out$")
	public void user_logs_out()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		driver.quit();
	}
}
		
		
		
		
		
		
		
		
	

