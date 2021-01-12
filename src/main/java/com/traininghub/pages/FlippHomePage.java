package com.traininghub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlippHomePage {

	public WebElement postalCode() {
		return BaseDriver.getDriver().findElement(By.xpath("//input[@name='postal_code']"));
	}
	
	public WebElement starSavingButton() {
		return BaseDriver.getDriver().findElement(By.xpath("//button[contains(text(),'Start Saving')]"));
	}
	
	
}
