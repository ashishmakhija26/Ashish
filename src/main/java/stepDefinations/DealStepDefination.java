package stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class DealStepDefination {

	WebDriver driver;
	
	@Given("^: user is already login page$")
	 public void User_is_already_login_page()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32 (5)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://ui.cogmento.com/");
		}
	

	@Then("^: title at login page is Free CRM$")
	public void title_at_login_page_is_Free_CRM() 
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^: user enter username and password$")
	public void user_enter_username_and_password(DataTable creaditionals) 
	{	
		List<List<String>> data	=creaditionals.raw();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));

	driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));

		
	}
	@Then("^: user click on login button$")
	public void user_click_on_login_button() 
	{
	
		WebElement loginbtn=driver.findElement(By.xpath("//div[text()='Login' and @class='ui fluid large blue submit button']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginbtn);
	
		//driver.findElement(By.xpath("//div[text()='Login' and @class='ui fluid large blue submit button']")).click();
		
		}

	@Then("^: user is on Home Page$")
	public void user_is_on_Home_Page() 
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		
	}



	@Then("^: user mouse over on Deals link$")
	public void user_mouse_over_on_Deals_link()  
	{
	    Actions action=new Actions(driver);
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	    action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text' and text()='Deals']"))).build().perform();
	    driver.findElement(By.xpath("//span[@class='item-text' and text()='Deals']")).click();
		
	}
	@Then("^: user clicks on new Deals link$")
	public void user_clicks_on_new_Deals_link() 
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//button[@class='ui linkedin button' and text()='Create']"))).build().perform();
		driver.findElement(By.xpath("//button[@class='ui linkedin button' and text()='Create']")).click();
	}

	@Then("^: user enter Deals details$")
	public void user_enter_Deals_details(DataTable dealsdetails) 
	{
		List<List<String>> data=dealsdetails.raw();
		driver.findElement(By.name("title")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("amount")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("probability")).sendKeys(data.get(0).get(2));
		driver.findElement(By.name("commission")).sendKeys(data.get(0).get(3));
		
	}
	@Then("^: user clicks on save button$")
	public void user_clicks_on_save_button() throws Throwable 
	{
	
		driver.findElement(By.xpath("//button[@class='ui linkedin button' and text()='Save']")).click();
	}
}
