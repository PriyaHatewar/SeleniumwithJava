package SeleniumJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/login/device-based/regular/login/");
			WebElement un = driver
					.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']"));
			un.sendKeys("Priya");

			WebElement pw = driver
					.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']"));
			pw.sendKeys("Priya@123");

			WebElement bt = driver.findElement(By.xpath("//div[@class='_xkt']"));
			bt.click();


	}

}
