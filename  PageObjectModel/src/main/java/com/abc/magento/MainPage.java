package com.abc.magento;

public class MainPage
{
WebDriver driver;
By log=By.linkTest("LogOut");
public MainPage(WebDriver driver)
{
	this.driver=driver;
	
}
public void clickOnLogOut()
{
	driver.findElement(Logout).click();
}
}
