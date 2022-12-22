package parallel;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.qa.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	
	static String title;
	
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
		WebDriver driver = DriverFactory.getDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
	}

	@When("user gets the title of page")
	public void user_gets_the_title_of_page() {
	    title = loginpage.getTitleOfPage();
	   
	   System.out.println("title of page is :"+title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtile) {
	 boolean ispresent = title.contains(expectedtile);
	 
	 Assert.assertTrue(false);
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	   
		boolean isdisplay = loginpage.isCartIconDisplayed();
		
		Assert.assertTrue(isdisplay);
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String un) {
	    loginpage.enterUsername(un);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
		loginpage.enterPassword(pwd);
	}

	@When("user confirm the signin")
	public void user_confirm_the_signin() {
		loginpage.clickLogin();
	}



	
	
	

}
