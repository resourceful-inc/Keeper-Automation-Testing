package keeper2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC020_PrivacyPolicyLink {

	public static void main(String[] args) {
		//*Test Case:*
		//Summary: Candidate clicks on "Privacy Policy" link
		//Expected Result: It will direct candiate to "Privacy Policy" page
		System.setProperty("webdriver.chrome.driver", "/Users/sky/Documents/workspace/Selenium/src/test1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.keeperhr.com/");
		driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[3]/form/div[2]/button[2]")).click();
		driver.findElement(By.linkText("Privacy Policy")).click();

	}

}
