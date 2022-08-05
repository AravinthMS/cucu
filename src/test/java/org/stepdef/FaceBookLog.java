package org.stepdef;


import org.base.LibGlobal;
import org.loc.LoginPojo;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaceBookLog extends LibGlobal{


	@Given("User has to lauch the Browser and hit the url")
	public void user_has_to_lauch_the_Browser_and_hit_the_url() {
		browserlaunch();
	    urlLauch("https://www.facebook.com/");
		
	}
	@When("Maximize the browser")
	public void maximize_the_browser() {
	   maxwindow();
	}


	@When("User has to pass the valid username to Email field")
	public void user_has_to_pass_the_valid_username_to_Email_field() {
	 driver.findElement(By.id("email")).sendKeys("greens@123");
		
	}

	@When("User has to pass the invaild password to Password field")
	public void user_has_to_pass_the_invaild_password_to_Password_field() {
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtPass(), "5678");
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
	     LoginPojo l = new LoginPojo();
	     clickbtn(l.getBtnLogin());
	     
	}

	@When("User has to navigate to invalid credentials page")
	public void user_has_to_navigate_to_invalid_credentials_page() {
	   System.out.println("Navigate");
	}

	@Then("User has to close the Browser")
	public void user_has_to_close_the_Browser() {
	   System.out.println("Close browser");	
		
		
	}

}