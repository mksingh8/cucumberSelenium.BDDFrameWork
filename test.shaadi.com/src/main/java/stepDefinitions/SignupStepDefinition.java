package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupStepDefinition {
	WebDriver driver;
	
	@Given("user is already on shaadiDotcom website")
	public void user_is_already_on_shaadiDotcom_website() {
		System.setProperty("webdriver.gecko.driver",
				"/home/manish/Downloads/Selenium/Lib/Browser/geckodriver-v0.23.0-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.shaadi.com/");
		
	}

	@When("user clicks on the SignUp button")
	public void user_clicks_on_the_SignUp_button() {
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();

	}

	@Then("user provides \"(.*)\" and \"(.*)\" and OnBehalf details as \"(.*)\"")
	public void user_provides_email_address_andpassword_and_OnBehalf_details_as_daughter(String emailAdd, String password, String profilfor) {
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		new WebDriverWait(driver, 20).ignoring(ElementNotInteractableException.class)
				.until(ExpectedConditions.elementToBeClickable(email));
		email.sendKeys(emailAdd);
		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys(password);

		driver.findElement(By.xpath("//*[@id='s2id_layer_postedby']/a/span[1]")).click();
		String befoe_Xpath = "//*[@id='select2-drop']/ul/li[";

		for (int i = 2; i <= 6; i++) {
			WebElement ele = driver.findElement(By.xpath(befoe_Xpath + i + "]"));
			String dropDown = ele.getText();
			System.out.println(dropDown);
			if (profilfor.equalsIgnoreCase(dropDown)) {
				ele.click();
				break;
			}
		}

	}

	@Then("user clicks on the Next button")
	public void user_clicks_on_the_Next_button() {
		driver.findElement(By.xpath("//a[text()='Next']")).click();
	}

	@Then("Great! Now some basic details are displayed")
	public void great_Now_some_basic_details_are_displayed() {
		WebElement basicDetailsScreen = driver.findElement(By.xpath("//*[text()='Great! Now some basic details']"));
		new WebDriverWait(driver, 20).ignoring(NoSuchElementException.class).
		until(ExpectedConditions.elementToBeClickable(basicDetailsScreen));
		//until(ExpectedConditions.elementSelectionStateToBe(basicDetailsScreen, true));
		//until(ExpectedConditions.invisibilityOf(basicDetailsScreen));
		//Assert.assertEquals("Great! Now some basic details", basicDetailsScreen);
	}

	@Then("user provides daughters \"(.*)\" and \"(.*)\" and other details")
	public void user_provides_daughter_details(String firstname, String lastname) throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//*[@id='s2id_layer_day']")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]")).click();

				
		/*
		WebElement monthSelection = driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click", monthSelection);
		*/
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[7]")).click();

		driver.findElement(By.xpath("//*[@id='s2id_layer_community']/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]")).click();

		driver.findElement(By.xpath("//*[@id='s2id_layer_mother_tongue']/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]/ul/li[5]")).click();

		
	}

	@Then("clciks on the SignUp button")
	public void clciks_on_the_SignUp_button() {
		driver.findElement(By.xpath("//a[text()='Sign Up' and @id='btnSubmit']")).click();
	}
	
	@Then("user close the browser")
	public void user_close_the_browser() {
		driver.quit();
	}

/*	
	@Then("Welcome to Shaadi.com displayed")
	public void welcome_to_Shaadi_com_displayed() throws InterruptedException {
		Thread.sleep(5000);
		WebElement newWindow = driver.findElement(By.xpath("//div[@class='sc-bsbRJL fxQkgV']"));
		//WebElement welcomeMessage = driver.findElement(By.xpath("//h1[text()='Welcome to Shaadi.com!']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", newWindow);
		//new WebDriverWait(driver, 10).ignoring(ElementNotInteractableException.class).
	//	until(ExpectedConditions.visibilityOf(welcomeMessage));
		
		//Assert.assertTrue(welcomeMessage.isDisplayed());
	}

	@Then("user provide information some demographic and marital status of daughter")
	public void user_provide_information_some_demographic_and_marital_status_of_daughter() {
		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		state.click();
		state.sendKeys("andhra");
		state.sendKeys(Keys.RETURN);
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(city));
		city.click();
		city.sendKeys("Eluru");
		
		//WebElement maritalStatus = driver.findElement(By.xpath("//input[@name='maritalStatus']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElemenetByname('maritalStatus').value='Never Married'");
		
		
	}

	@Then("user clicks on the Continue button")
	public void user_clicks_on_the_Continue_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
		
	}
*/	

}
