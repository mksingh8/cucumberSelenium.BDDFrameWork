package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class SignupStepWithListDefinition {
WebDriver driver;
	
	@Given("User is already on shaadiDotcom website")
	public void user_is_already_on_shaadiDotcom_website() {
		System.setProperty("webdriver.gecko.driver",
				"/home/manish/Downloads/Selenium/Lib/Browser/geckodriver-v0.23.0-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.shaadi.com/");
		
	}

	@When("User clicks on the SignUp button")
	public void user_clicks_on_the_SignUp_button() {
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();

	}

	@Then("User provides emailId and password and OnBehalf details as Daughter")
	public void user_provides_email_address_andpassword_and_OnBehalf_details_as_daughter(DataTable details) {
		
		List<List<String>> daughterDetails = details.asLists();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		new WebDriverWait(driver, 20).ignoring(ElementNotInteractableException.class)
				.until(ExpectedConditions.elementToBeClickable(email));
		email.sendKeys(daughterDetails.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys(daughterDetails.get(0).get(1));

		driver.findElement(By.xpath("//*[@id='s2id_layer_postedby']/a/span[1]")).click();
		String befoe_Xpath = "//*[@id='select2-drop']/ul/li[";

		for (int i = 2; i <= 6; i++) {
			WebElement ele = driver.findElement(By.xpath(befoe_Xpath + i + "]"));
			String dropDown = ele.getText();
			//System.out.println(dropDown);
			if (daughterDetails.get(0).get(2).equalsIgnoreCase(dropDown)) {
				ele.click();
				break;
			}
		}

	}
	
	@Then("User clicks on the Next button")
	public void user_clicks_on_the_Next_button() {
		driver.findElement(By.xpath("//a[text()='Next']")).click();
	}

	@Then("Great! Now some basic details are displayed of your Daughter")
	public void great_Now_some_basic_details_are_displayed() {
		WebElement basicDetailsScreen = driver.findElement(By.xpath("//*[text()='Great! Now some basic details']"));
		new WebDriverWait(driver, 20).ignoring(NoSuchElementException.class).
		until(ExpectedConditions.elementToBeClickable(basicDetailsScreen));
		//until(ExpectedConditions.elementSelectionStateToBe(basicDetailsScreen, true));
		//until(ExpectedConditions.invisibilityOf(basicDetailsScreen));
		//Assert.assertEquals("Great! Now some basic details", basicDetailsScreen);
	}

	@Then("User provides daughters firstname and lastname and other details")
	public void user_provides_daughter_details(DataTable dautName) throws InterruptedException {
		List<List<String>> daughterName = dautName.asLists();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(daughterName.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(daughterName.get(0).get(1));
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

	@Then("User clciks on the SignUp button")
	public void clciks_on_the_SignUp_button() {
		driver.findElement(By.xpath("//a[text()='Sign Up' and @id='btnSubmit']")).click();
	}
	
	@Then("User close the browser")
	public void user_close_the_browser() {
		driver.quit();
	}


}
