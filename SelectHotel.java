package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
@FindBy(id="radiobutton_0")
private WebElement radio;
public WebDriver driver;
public WebElement getRadio() {
	return radio;
}
public SelectHotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}

@FindBy(id="continue")
private WebElement contin;
public WebElement getContin() {
	return contin;
}


}
