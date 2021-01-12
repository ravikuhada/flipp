package com.traininghub.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingList {

	public WebElement addItemField() {
		return BaseDriver.driver.findElement(By.xpath("//input[@title='Add an item']"));
	}
	
	public WebElement dealButton() {
        return BaseDriver.driver.findElement(By.xpath("//button[@class='matchups-drillin']"));
	}

	public List<WebElement> listOFdeals(){
		return BaseDriver.driver.findElements(By.xpath("//div[@class='item-block']//a[@source-action='search_flyer_item_click']"));
	}
	
	
}
