package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	@FindBy(id = "location")
	private WebElement location;
	public WebDriver driver;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement type;

	@FindBy(id = "room_nos")
	private WebElement number;

	@FindBy(id = "datepick_in")
	private WebElement date;

	@FindBy(id = "datepick_out")
	private WebElement pickup;

	@FindBy(id = "adult_room")
	private WebElement adult;

	@FindBy(id = "child_room")
	private WebElement child;

	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getType() {
		return type;
	}


	public WebElement getNumber() {
		return number;
	}


	public WebElement getDate() {
		return date;
	}

	
	public WebElement getPickup() {
		return pickup;
	}


	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}


	public Search_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
