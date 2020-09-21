package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TotalJobCheck {

WebDriver driver = null;

	@Given("User is able to navigate to total jobs login page url")
	public void user_is_able_to_navigate_to_total_jobs_login_page_url() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:/Users/shail/OneDrive/Desktop/Work/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.totaljobs.com/account/signin?ReturnUrl=/");
	    Thread.sleep(2000);
	}
    
	
	@When("User enters valid email id and valid password")
	public void user_enters_valid_email_id_and_valid_password() {
		driver.findElement(By.id("Form_Email")).sendKeys("shailendra.savant@gmail.com");
		driver.findElement(By.id("Form_Password")).sendKeys("Shlok210409");
	}

	@And("click on Sign in button")
	public void click_on_sign_in_button() {
	 driver.findElement(By.id("btnLogin")).click();
	}

	@Then("Login susccessful")
	public void login_susccessful() {
	   System.out.println("Login Successful");
		
	}

}

