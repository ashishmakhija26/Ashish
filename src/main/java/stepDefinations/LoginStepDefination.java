package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginStepDefination 
{
	WebDriver driver;
/*	@Given("^: user is already login page$")
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

	@Then("^: user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_username_and_password(String username,String password) 
	{
		driver.findElement(By.name("email")).sendKeys(username);

		driver.findElement(By.name("password")).sendKeys(password);
		
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
	
*/
	/*@Given("^: user is already home page$")
	public void user_is_already_home_page() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.name("email")).sendKeys("ashishmakhija26@gmail.com");
		driver.findElement(By.name("password")).sendKeys("$$345Royal#");
		driver.findElement(By.xpath("//div[text()='Login' and @class='ui fluid large blue submit button']")).click();
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
	}
*/
	/*@Then("^: user mouse over on contacts link$")
	public void user_mouse_over_on_contacts_link() 
	{	  
			Actions action=new Actions(driver);
			
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		
			action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text' and text()='Contacts']"))).build().perform();
		    driver.findElement(By.xpath("//span[@class='item-text' and text()='Contacts']")).click();
	}	
	

	@Then("^: user clicks on new Contact link$")
	public void user_clicks_on_new_Contact_link() 
	{
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
	}

	@Then("^: user enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_firstname_and_lastname_and_position(String firstname,String lastname, String position) 
	{
		driver.findElement(By.name("first_name")).sendKeys(firstname);
		driver.findElement(By.name("last_name")).sendKeys(lastname);
		driver.findElement(By.name("position")).sendKeys(position);
		}
	

	@Then("^: user clicks on save button$")
	public void user_clicks_on_save_button() 
	{
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//driver.close();

	}
*/
	

}
