package SeleniumJavaProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethod {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		    driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.manage().window().maximize();
			WebElement E1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
			E1.click();
			
			Alert a =driver.switchTo().alert();
			Thread.sleep(2000);
			a.accept();
			Thread.sleep(2000);
			WebElement E2 = driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
			E2.click();
			
			WebElement E3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			E3.click();
			Thread.sleep(2000);
			a.accept();
			Thread.sleep(2000);
			WebElement E4 = driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
			E4.click();
			
			WebElement E5 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
			E5.click();
			Thread.sleep(2000);
			a.sendKeys("Priya");
			Thread.sleep(5000);
			a.accept();


			
			

			
			


	}

}
