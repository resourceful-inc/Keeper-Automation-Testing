package keeper2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC017_ForgotPassword {

	public static void main(String[] args) {
		//Test Case 017
		//Summary: Verifying email with existing email
		//Expected Result: It will direct user to "Verifying" page and user will get reset password email with the code for verifying
		System.setProperty("webdriver.chrome.driver", "/Users/sky/Documents/workspace/Selenium/src/test1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.keeperhr.com/");
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("uongbanhman@gmail.com");
		driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[3]/form/div[2]/button")).click();
	}

}
