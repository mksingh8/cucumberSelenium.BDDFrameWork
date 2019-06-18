package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class TagStepDefinition {
	//Global Hooks
	@Before
	public void setup() {
		System.out.println("launch ff");
		System.out.println("set windows and timeoutsetting");
		System.out.println("navigate to url");
	}
	
	@After
	public void tearDown() {
		System.out.println("quit the browser");
	}
	
	@Given("user hit the url of xxx site")
	public void user_hit_the_url_of_xxx_site() {
	    System.out.println("this is already cover in before annotation and user is on home page now");
	}

	@When("user clicks on the signup button")
	public void user_clicks_on_the_signup_button() {
	    System.out.println("user clicks on the signup button");
	}

	@Then("user provides its data")
	public void user_provides_its_data() {
	    System.out.println("user provides its data");
	}

	@Then("user clicks on the save button on signup page")
	public void user_clicks_on_the_save_button_on_signup_page() {
	    System.out.println("user clicks on the save button on signup page");
	}

	@Then("user clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
	    System.out.println("user clicks on sign in button");
	}

	@Then("user provides its credentials")
	public void user_provides_its_credentials() {
		System.out.println("user provides its credentials");
		
	}

	@Then("user click on next button And home page is displayed")
	public void user_click_on_next_button_And_home_page_is_displayed() {
	    System.out.println("user click on next button And home page is displayed");
	}

	@Given("user is on the Home page")
	public void user_is_on_the_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user clicks on the Show Balance Button")
	public void user_clicks_on_the_Show_Balance_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user clicks on the transfer fund option")
	public void user_clicks_on_the_transfer_fund_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user selects the transfer method")
	public void user_selects_the_transfer_method() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("selects the receipient")
	public void selects_the_receipient() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("enters the amount to be transferred")
	public void enters_the_amount_to_be_transferred() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("hit the transfer button")
	public void hit_the_transfer_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user provides the OTP on the transaction completion page")
	public void user_provides_the_OTP_on_the_transaction_completion_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("hit ok button")
	public void hit_ok_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user selects the recharge mobile option")
	public void user_selects_the_recharge_mobile_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("enters its mobile number")
	public void enters_its_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("selects the plan")
	public void selects_the_plan() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user hit the ok button")
	public void user_hit_the_ok_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user clixks on the add third party")
	public void user_clixks_on_the_add_third_party() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user provides bank account number and IFSC code of the account holder")
	public void user_provides_bank_account_number_and_IFSC_code_of_the_account_holder() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user clicks on the Add third party")
	public void user_clicks_on_the_Add_third_party() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}
