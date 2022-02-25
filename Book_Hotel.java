package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
@FindBy(id="first_name")
private WebElement name;
public WebDriver driver;

@FindBy(id="last_name")
private WebElement last;

@FindBy(id="address")
private WebElement address;

@FindBy(id="cc_num")
private WebElement ccnum;

@FindBy(id="cc_type")
private WebElement cctype;

@FindBy(id="cc_exp_month")
private WebElement expmonth;

@FindBy(id="cc_exp_year")
private WebElement expyear;

@FindBy(id="cc_cvv")
private WebElement cvv;

@FindBy(id="book_now")
private WebElement book;

public WebElement getName() {
	return name;
}

public WebElement getLast() {
	return last;
}


public WebElement getAddress() {
	return address;
}


public WebElement getCcnum() {
	return ccnum;
}

public WebElement getCctype() {
	return cctype;
}

public WebElement getExpmonth() {
	return expmonth;
}

public WebElement getExpyear() {
	return expyear;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBook() {
	return book;
}

public Book_Hotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}







}
