package com.abc.magento;

import java.util.concurrent.TimeUnit;

public class MagentoTest {

	public static void main(String[] args) 
	{
		 webDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage.timeouts.implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://www.magento.com");
		 WelcomPage w=new WelcomPage(driver);
		 w.clickOnMyacct();
		 Login l=new Login(driver);
		 l.typeEmail("nikhildandge.abc@gmail.com");
		 l.typePassword("Welcome123");
		 l.clickOnLogin();
		 
		 MainPage m=new MainPage(driver);
		 m.clickOnLogOut();
		 Thread.sleep(3000);
		 driver.quite();
	}

}
