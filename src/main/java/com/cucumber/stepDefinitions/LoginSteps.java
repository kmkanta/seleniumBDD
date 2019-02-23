package com.cucumber.stepDefinitions;



import com.cucumber.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends TestBase{
	//FileHelper fileHelper = new FileHelper();
	@Given("^I launch browser and navigate to application$")
	public void iLaunchBrowserAndNavigateToApplication() throws Throwable {
		init();
		System.out.println("Step1");
	}

	@Given("^I click on Sign in link$")
	public void iClickOnSignInLink() throws Throwable {

		System.out.println("Step2");
	}

	@Given("^I enter Email address$")
	public void iEnterEmailAddress() throws Throwable {

		System.out.println("Step3");
	}

	@Given("^I enter Password$")
	public void iEnterPassword() throws Throwable {

		System.out.println("Step4");
	}

	@When("^I click on Sign in button$")
	public void iClickOnSignInButton() throws Throwable {

		System.out.println("Step5");
	}

	@Then("^I verify Login is success$")
	public void iVerifyLoginIsSuccess() throws Throwable {
		closeBrowser();
		System.out.println("Step6");
	}

}
