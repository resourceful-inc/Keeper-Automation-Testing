package keeper2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC010_CreateAccount {

	public static void main(String[] args) {
		//*Test Case 010:*
		//Summary: Candidate types a less-than-8 characters password
		//Expected Result: It will raise error message "Please lengthen this text to 8 characters or more"
		System.setProperty("webdriver.chrome.driver", "/Users/sky/Documents/workspace/Selenium/src/test1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.keeperhr.com/");
		driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[3]/form/div[2]/button[2]")).click();
		driver.findElement(By.name("firstName")).sendKeys("First");
		driver.findElement(By.name("lastName")).sendKeys("Last");
		driver.findElement(By.name("email")).sendKeys("fwefwef@ccc.ccc");
		driver.findElement(By.name("confirmEmail")).sendKeys("fwefwef@ccc.ccc");
		driver.findElement(By.name("password")).sendKeys("1234567");
		driver.findElement(By.name("confirmPassword")).sendKeys("1234567");
		driver.findElement(By.xpath("//*[@id='main']/div/main/div/div/div/form/div[4]/div[2]/div/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='main']/div/main/div/div/div/form/div[3]/div[1]/div/div")).getText());
	}

}
