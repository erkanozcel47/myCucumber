package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class BlouseFinder {

	public BlouseFinder() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	 
	 
	 public WebElement items(String item) {
		 String xpath="//a[@class='product-name' and @title='"+item +"']";
		 return Driver.getDriver().findElement(By.xpath(xpath));
	 }
	
	
	
	
	 public WebElement itemsName(String item) {
		 String xpath1="//h1[.='"+item +"']";
		 return Driver.getDriver().findElement(By.xpath(xpath1));
	 }
	 public WebElement itemsPrice(String item) {
		 String xpath1="//span[.='"+item +"']";
		 return Driver.getDriver().findElement(By.xpath(xpath1));
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
