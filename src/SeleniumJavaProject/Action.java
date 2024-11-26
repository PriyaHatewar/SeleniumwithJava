package SeleniumJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 
		 WebDriver driver1 = new ChromeDriver();
			driver1.get("https://uncodemy.com/");
			driver1.manage().window().maximize();
		WebElement E1 = driver1.findElement(By.xpath("//span[@id='categoriesBtn']"));
			Actions a = new Actions(driver1);
			Thread.sleep(2000);
			a.moveToElement(E1).perform();
		WebElement E2 = driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
		a.moveToElement(E2).perform();
		WebElement E3 = driver.findElement(By.xpath("//a[normalize-space()='Automation Testing']"));
		E3.click();


					

		 
		 

	}

}
