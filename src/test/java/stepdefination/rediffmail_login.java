package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class rediffmail_login {

	WebDriver driver = null;
	
	@Given("Rediff User is able to navigate to total jobs login page url")
	public void rediff_user_is_able_to_navigate_to_total_jobs_login_page_url() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/shail/OneDrive/Desktop/Work/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    Thread.sleep(2000);
	}

	@When("Rediff User enters valid email id and valid password")
	public void rediff_user_enters_valid_email_id_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("login1")).sendKeys("shailendra.savant@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("Shlok210409");
	}

	@When("Rediff user is able to click on Sign in button")
	public void rediff_user_is_able_to_click_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("proceed")).click();
	}

	@Then("Rediff user has successfully logged in to portal")
	public void rediff_user_has_successfully_logged_in_to_portal() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User not able to login "); 
	}
	
	
}
