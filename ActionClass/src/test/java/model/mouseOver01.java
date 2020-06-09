package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.browser;

public class mouseOver01 extends browser {

	@Test
	public void login() {
		driver.findElement(By.xpath("//a[@class='nav-link -before']")).click();

		driver.findElement(By.id("email")).sendKeys("nahidbabu6@gmail.com");

		driver.findElement(By.id("password")).sendKeys("039e9101");

		driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();

		// printing unsuccessful login massage
//		  WebElement hh = driver.findElement(By.xpath("//span[contains(text(),'Please enter your valid email address.')]"));
//		  String pp =hh.getText(); 
//		  System.out.println("print massage: "+pp);

		Reporter.log("==TC Runed==", true);
	}

	@Test(dependsOnMethods = { "login" })
	public void mouseoverm() throws InterruptedException {

//		driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')][contains(text(),'Men')]")).click();
//        Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[@class='row product_row']//div[2]//a[1]//article[1]//div[4]//div[1]")).click();
//        
		Actions obj = new Actions(driver);

//		WebElement mm= driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')][contains(text(),'Men')]"));
//		obj.moveToElement(mm).build().perform();

		WebElement wm = driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')][contains(text(),'Women')]"));
		Reporter.log("===mouse on women module===", true);
		WebElement lm = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[3]//a[1]"));
		obj.moveToElement(wm).build().perform();
		Thread.sleep(2000);
		obj.moveToElement(lm).click().build().perform();
		

		Reporter.log("==clicked==", true);

		// obj.moveToElement(wm).moveToElement(lm).click().build().perform();

		// click on + button for add more product
	}

	@Test(dependsOnMethods = { "mouseoverm" }) // clicking image and adding order
	public void productDetailPage() throws InterruptedException {

		Thread.sleep(3000);
		WebElement jj = driver.findElement(By.xpath("//button[contains(text(),'+')]"));
		jj.click();
		Thread.sleep(3000);

	}

	@Test(dependsOnMethods = { "productDetailPage" })
	public void addToCart() throws InterruptedException {
		//add to cart
		driver.findElement(By.xpath("//button[@class='btn btn-secondary add-to-Cart btnGroup']")).click();
		Thread.sleep(3000);//my cart
		driver.findElement(By.xpath("//span[@class='title']")).click();
		//my cart
		driver.findElement(By.xpath("//span[@class='title']")).click();
		Thread.sleep(4000);//view cart
		driver.findElement(By.xpath("//a[@class='btn btn-dark']")).click();
		driver.findElement(By.id("update_cart")).click();
		Thread.sleep(8000);
		

	}
}
