package com.abc.magento;

public class Login
{
WebDriver driver;
By email=By.id("email");
By pass=By.id("pass");
By login=By.id("send2");
public   LoginPage(webDriver driver)
{
	this.driver=driver;
}
public void typeEmail(String em)
{
	driver.findElement(email).sendKey(em);
}
public void typePassword(String pwd)
{
	driver.findElement(pwd).sendKeys(pwd);
}
public void clickOnLogin()
{
	driver.findElement(login).click();
}

}
