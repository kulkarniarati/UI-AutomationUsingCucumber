package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class AmazonloginSteps {
	WebDriver driver=null;
	
	@Given("chrome Browser is open")
	public void chrome_browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	  
	    System.setProperty("webdriver.chrome.driver", "D:/AratiK/AratiWork/JavaLearning/CucumberWebAutomation/src/test/resources/Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@And("(.*) site is launched")
	public void amazon_site_is_launched(String sitename) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(sitename);
	}

	@When("Click on Signin button and Enter (.*) and (.*)")
	public void enter_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[contains(@text(),'Sign in')]")).click();
	    driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(username);
	    driver.findElement(By.xpath("//*[@id='continue']")).click();
	    driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys(password);
	    
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		   
	}

	@Then("Amazon homepage is opened.")
	public void amazon_homepage_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I am on Amazon homepage");
	   }

	@Then("check Amazon text on the home page.")
	public void check_amazon_text_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[contains(@text(),'Hello, ARATI')]"));
		
	}

}
