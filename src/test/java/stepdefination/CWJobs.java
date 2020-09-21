package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CWJobs {

	WebDriver driver = null;

		@Given("I has valid url for cwjobs Portal")
		public void i_has_valid_url_for_cwjobs_portal() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:/Users/shail/OneDrive/Desktop/Work/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.cwjobs.co.uk/account/signin?ReturnUrl=/");
		    Thread.sleep(1000);
		}

		@When("I entered valid {string} and vaild {string} in step")
		public void i_entered_valid_and_vaild_in_step(String string, String string2) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("Form_Email")).sendKeys(string);
			driver.findElement(By.id("Form_Password")).sendKeys(string2);
		}

		@Then("I click on CW_login button")
		public void i_click_on_cw_login_button() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.id("btnLogin")).click();
		}
}
