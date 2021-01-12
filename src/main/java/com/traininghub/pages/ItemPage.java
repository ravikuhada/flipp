package com.traininghub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemPage {
	
	public WebElement getTitle() {
		return BaseDriver.driver.findElement(By.xpath("//*[@class='slideable title']/span"));
	}
	
	public WebElement getPrice() {
		return BaseDriver.driver.findElement(By.xpath("//flipp-price"));
	}
	
	

}
