package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_In {
	public WebDriver driver;//null

	@FindBy(id = "username")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id = "login")
	private WebElement log;

	public WebElement getLog() {
		return log;
	}

	public Login_In(WebDriver abc) {
		this.driver = abc;
		PageFactory.initElements(driver, this);
	}
}
