package keeper2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC009_CreateAccount {

	public static void main(String[] args) {
		//*Test Case 9:*
		//Summary: Check the case-sensitive on email address
		//Expected Result: The email address should not be case-sensitive
		System.setProperty("webdriver.chrome.driver", "/Users/sky/Documents/workspace/Selenium/src/test1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.keeperhr.com/");
		driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[3]/form/div[2]/button[2]")).click();
		driver.findElement(By.name("firstName")).sendKeys("First");
		driver.findElement(By.name("lastName")).sendKeys("Last");
		driver.findElement(By.name("email")).sendKeys("ttt@ttt.ttt");
		driver.findElement(By.name("confirmEmail")).sendKeys("TTT@ttt.ttt");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='main']/div/main/div/div/div/form/div[4]/div[2]/div/button")).click();
	}

}
