package com.abc.magento;

public class WelcomPage 
{
webDriver driver
By myacct=By.linkTest("My Account");
public welcomePage(WebDriver driver)
{
	this.driver=driver;
}
public void clickOnMyacct()
{
	driver.findElement(myacct).click();
}
}
