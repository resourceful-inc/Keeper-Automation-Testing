package keeper2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC015_ForgotPassword {

	public static void main(String[] args) {
		//Test Case 015:
		//Summary: Verifying email with invalid email type
		//Expected Result: It will raise error message "Invalid email address"
		System.setProperty("webdriver.chrome.driver", "/Users/sky/Documents/workspace/Selenium/src/test1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.keeperhr.com/");
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sfoiwef@fiowf");
		driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[3]/form/div[2]/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[3]/form/div[1]/div/div[2]")).getText());
	}

}
