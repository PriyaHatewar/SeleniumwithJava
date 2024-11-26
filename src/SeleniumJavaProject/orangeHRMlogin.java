package SeleniumJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRMlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			WebElement un = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			un.sendKeys("Admin");

			WebElement pw = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			pw.sendKeys("admin123");

			WebElement bt = driver.findElement(By.xpath("//button[@type='submit']"));
			bt.click();

	}

}
