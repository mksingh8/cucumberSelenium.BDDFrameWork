package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
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
import io.cucumber.datatable.DataTable;

public class LoginStepWithMapDefinition {
	
WebDriver driver;
	
	@Given("User is already on Login Page")
	public void user_already_on_Login_Page() {
		System.setProperty("webdriver.gecko.driver", 
				"/home/manish/Downloads/Selenium/Lib/Browser/geckodriver-v0.23.0-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.shaadi.com/");	
	}
	
	@When("User clicks on the Login Button")
	public void user_clicks_on_the_Login_Button() {
		String title = driver.getTitle();
		System.out.println(title);
		WebElement loginBtn = driver.findElement(By.xpath("//a[@class='member_login']"));
		loginBtn.click();
	}
	
	@Then("User enters userName and password on signin page")
	public void user_enter_usrName_password_on_sigin_page(DataTable userCredentials) {
		
		//Map<String, String> data = userCredentials.asMap(String.class, String.class);
		
		List<Map<String, String>> dataList = userCredentials.asMaps(String.class, String.class);
		
		for(Map<String, String> data : dataList) {
			WebElement email = driver.findElement(By.xpath("//*[@id='login_page']"));
			new WebDriverWait(driver, 20).ignoring(ElementNotInteractableException.class).until(ExpectedConditions.elementToBeClickable(email));
			email.sendKeys(data.get("userName"));
			driver.findElement(By.xpath("//*[@id='password_page']")).sendKeys("password");
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			driver.navigate().back();
			WebElement loginBtn = driver.findElement(By.xpath("//a[@class='member_login']"));
			new WebDriverWait(driver, 20).ignoring(ElementNotInteractableException.class).until(ExpectedConditions.elementToBeClickable(loginBtn));
			loginBtn.click();
		}
		
	}
	
	@Then("User clicks on Signin button on signin page")
	public void user_clicks_on_Signin_button_on_signin_page() {
		//driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		System.out.println();
	}

	@Then("User is moved to Home Page")
	public void user_is_on_Home_Page() {
		//String title = driver.getTitle();
		//Assert.assertEquals("Login to Matrimonials", title);
	    driver.quit();
	}

}
