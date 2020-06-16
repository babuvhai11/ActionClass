package model;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.browser;

public class Test003 extends browser{
    @Test
	public void GitTest(){
    	driver.findElement(By.xpath("//a[contains(text(),'Shop By Brands')]")).click();
    }

}
