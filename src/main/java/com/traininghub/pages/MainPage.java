package com.traininghub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	public WebElement shoppingList() {
        return BaseDriver.driver.findElement(By.xpath("//span[contains(text(),'Shopping List')]"));
	}
	
	

}
