package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("I am in login page")
	public void i_am_in_login_page() {
	   System.out.println("this is given statement");
	}

	@When("I enter credential")
	public void i_enter_credential() {
	   System.out.println("this is when first statement");
	}

	@When("i click on login button")
	public void i_click_on_login_button() {
	   System.out.println("this is seconds statement");
	}

	@Then("I should be able to login")
	public void i_should_be_able_to_login() {
		 System.out.println("this is then statement");
	}
	
	@When("I enter incorrect credential")
	public void i_enter_incorrect_credential() {
	   System.out.println("i enter incorrect credential");
	}

	@Then("I should not able to login it will show error")
	public void i_should_not_able_to_login_it_will_show_error() {
		System.out.println("it will show error");
	}
	@Given("i am in dashboard page")
	public void i_am_in_dashboard_page() {
	   System.out.println("Iam in dashboard page");
	}

	@When("iam checking dashboard page is apeared or not")
	public void iam_checking_dashboard_page_is_apeared_or_not() {
	    System.out.println("iam checking dashboard page");
	}

	@When("user checking other module is apeared on not")
	public void user_checking_other_module_is_apeared_on_not() {
	   System.out.println("user checking other module");
	}

	@Then("user must be check dashboard is working or not")
	public void user_must_be_check_dashboard_is_working_or_not() {
	   System.out.println("user must check dashboardpage is open or not");
	}










}
