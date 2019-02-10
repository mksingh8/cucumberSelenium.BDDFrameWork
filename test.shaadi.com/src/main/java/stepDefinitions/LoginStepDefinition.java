package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_already_on_Login_Page() {
		System.setProperty("webdriver.gecko.driver", 
				"/home/manish/Downloads/Selenium/Lib/Browser/geckodriver-v0.23.0-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.shaadi.com/");	
	}
	
	@When("^user clicks on the Login Button$")
	public void title_of_page_The_No1_Matchmaking() {
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@class='member_login']")).click();
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enter_usrName_password(String userName, String password) {
		WebElement email = driver.findElement(By.xpath("//*[@id='login_page']"));
		new WebDriverWait(driver, 20).ignoring(ElementNotInteractableException.class).until(ExpectedConditions.elementToBeClickable(email));
		//Thread.sleep(500);
		email.sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='password_page']")).sendKeys(password);
		
	}
	
	@Then("^user clicks on Signin button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	}

	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page() {
		String title = driver.getTitle();
		Assert.assertEquals("Login to Matrimonials", title);
	    driver.quit();
	}


}
