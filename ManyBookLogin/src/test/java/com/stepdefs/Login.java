package com.stepdefs;

import io.cucumber.java.en.Given;

import java.util.Scanner;

import com.pageobjects.LoginPage;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	private LoginPage loginPage;
	WebDriver driver ;

	public Login() {
        loginPage = new LoginPage(driver);
    }




	@Given("Launch the Flipkart Url$")
	public void launchFlipkart() throws Throwable {
		loginPage.launchUrl();


	}
	@Given("User login with Registered credentials$")
	public void login() throws Throwable {
		loginPage.login();


	}
	@Then("Verify successful login$")
	public void verifyLogin() throws Throwable {
		loginPage.verifySuccessfulLogin();


	}


	
}
