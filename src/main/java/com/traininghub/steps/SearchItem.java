package com.traininghub.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.traininghub.pages.BaseDriver;
import com.traininghub.pages.FlippHomePage;
import com.traininghub.pages.ItemPage;
import com.traininghub.pages.MainPage;
import com.traininghub.pages.ShoppingList;

public class SearchItem extends BaseDriver{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Study Material\\QE\\chromedriver.exe");
    	driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		
 		//tell selenium compiler to wait for 40 seconds for page to load
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//This is time for elements to load on pag
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FlippHomePage fhp = new FlippHomePage();
		driver.get("https://www.flipp.com/");
		
		fhp.postalCode().sendKeys("L6Y2R6");
		fhp.starSavingButton().click();
		
		MainPage mainPage = new MainPage();
		mainPage.shoppingList().click();
		
		ShoppingList shoppingOjb = new ShoppingList();
		shoppingOjb.addItemField().sendKeys("Cheese");
		shoppingOjb.addItemField().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		shoppingOjb.dealButton().click();
		
		
		shoppingOjb.listOFdeals();
		
		String link;
		
		
		for (WebElement element : shoppingOjb.listOFdeals()) {
			link = "https://www.flipp.com"+element.getAttribute("href");
			driver.navigate().to(link);
			Thread.sleep(5000);
			ItemPage ip = new ItemPage();
			System.out.println(driver.findElement(By.xpath("//*[@class='slideable title']/span")).getText());
			//System.out.println(ip.getTitle());
			System.out.println(ip.getPrice());
			
		}
		
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		

	}

}
