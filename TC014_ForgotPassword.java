package keeper2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC014_ForgotPassword {
	public static void main(String[] args){
		// Test Case 014
		// Summary: User clicks on "Forgot password" link to reset new password
		// Expected Result: It will direct user to "Forgot Password" page
		System.setProperty("webdriver.chrome.driver", "/Users/sky/Documents/workspace/Selenium/src/test1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.keeperhr.com/");
		driver.findElement(By.linkText("Forgot Password?")).click();
	}
}
