package keeper2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC018_WhatIsKeeperLink {

	public static void main(String[] args) {
		//*Test Case:*
		//Summary: User clicks on "What is Keeper?" link
		//Actual Behavior: It will direct user to website www.keeperhr.com
		System.setProperty("webdriver.chrome.driver", "/Users/sky/Documents/workspace/Selenium/src/test1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.keeperhr.com/");
		driver.findElement(By.linkText("What is Keeper?")).click();
	}

}
