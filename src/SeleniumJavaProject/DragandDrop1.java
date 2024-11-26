package SeleniumJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {
             public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
				driver.manage().window().maximize();
				WebElement F = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
				driver.switchTo().frame(F);
				WebElement E1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
				WebElement E2 = driver.findElement(By.xpath("//div[@id='trash']"));
				
				Actions a = new Actions(driver);
				a.dragAndDrop(E1, E2).perform();
				WebElement E3 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
				a.dragAndDrop(E3, E2).perform();
				WebElement E4 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
				a.dragAndDrop(E4, E2).perform();
				WebElement E5 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
				Thread.sleep(2000);
				a.dragAndDrop(E5, E2).perform();
				
				
				
				
				
				
				
				
				
				

	}

}
