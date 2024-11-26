package SeleniumJavaProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		 WebDriver driver1 = new ChromeDriver();
			driver1.get("https://www.facebook.com/login.php/");
			driver1.manage().window().maximize();

			String pw = driver1.getWindowHandle();
			System.out.println(pw);

			Thread.sleep(5000);
			
			WebElement E1 = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
			E1.click();

			Set<String> aw = driver.getWindowHandles();
			System.out.println(aw);

			for (String as : aw) {
				if (!(pw.equals(as))) {
			driver.switchTo().window(as);
					// System.out.println("Change Window");
				}
			}
			// System.out.println("out of for");

			Thread.sleep(5000);
			WebElement E2 = driver.findElement(By.xpath("//input[@name='username']"));
			E2.click();
			E2.sendKeys("Priya");

			WebElement E3 = driver.findElement(By.xpath("//input[@name='password']"));
			E3.click();
			E3.sendKeys("Priya@123");



	}

}
