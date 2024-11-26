package SeleniumJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.getTitle();
			driver.getCurrentUrl();
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			WebElement E1 = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			E1.sendKeys("Admin");
			WebElement E2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			E2.sendKeys("admin123");
			WebElement E3 = driver.findElement(By.xpath("//button[@type='submit']"));
			E3.click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.navigate().refresh();
			driver.quit();

		 

	}

}
