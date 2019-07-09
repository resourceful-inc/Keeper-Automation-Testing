package keeper2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_Signin {

	public static void main(String[] args) {
		// TODO user logs in with incorrect password
		System.setProperty("webdriver.chrome.driver", "/Users/sky/Documents/workspace/Selenium/src/test1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.keeperhr.com/");
		driver.findElement(By.id("email")).sendKeys("uongbanhngot@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345677");
		driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[3]/form/div[2]/button[1]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[3]/form/div[1]/div[2]/div[2]")).getText());
	}

}
