package SeleniumJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {
	
	 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://demo.automationtesting.in/Static.html");
	 
	 driver.manage().window().maximize();
	 
	 WebElement E1 = driver.findElement(By.xpath("//img[@id='angular']"));
	 WebElement E2 = driver.findElement(By.xpath("//img[@id='mongo']"));
	 WebElement E3 = driver.findElement(By.xpath("//img[@id='node']"));
	 WebElement E4 = driver.findElement(By.xpath("//div[@id='droparea']"));
	 Actions a = new Actions(driver);
	 a.dragAndDrop(E1, E4).perform();
	 a.dragAndDrop(E2, E4).perform();
	 a.dragAndDrop(E3, E4).perform();
	 
	     
	 
	     

	}

}
