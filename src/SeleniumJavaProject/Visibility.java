package SeleniumJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visibility {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement E1 = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			E1.sendKeys("Admin");
			WebElement E2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			E2.sendKeys("admin123");
			WebElement E3 = driver.findElement(By.xpath("//button[@type='submit']"));
			if(E3.isEnabled()) {
				E3.click();
			}
			Thread.sleep(2000);
			
			WebElement E4 = driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
			E4.click();
			WebElement E5 = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
			Thread.sleep(2000);
			if(E5.isSelected()) {
				System.out.println("Male is Selected");
			}
			else {
				E5.click();
				System.out.println("Clicked");
			}

			
			

		 
		 

		 
	}

}
