package com.my.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Function {
	WebDriver driver;
	@Given("^Open Browser and start application$")
	public void Open_Browser_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	  
	    
	}

	@When("^I enter username and password$")
	public void I_enter_username_and_password() throws Throwable {
	  driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Swain");  
	   
	}

	@Then("^user login  suceesfully$")
	public void user_login_suceesfully() throws Throwable {
		System.out.println("Entered value suceesfully"); 
	}

}
