package SeleniumJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumdemoProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		    driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);

			WebElement E1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			E1.sendKeys("Priya");

			WebElement E2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			E2.sendKeys("Hatewar");

			WebElement E3 = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
			E3.sendKeys("Nagpur, Maharashtra");

			WebElement E4 = driver.findElement(By.xpath("//input[@type='email']"));
			E4.sendKeys("priyahatewar52@gmail.com");

			WebElement E5 = driver.findElement(By.xpath("//input[@type='tel']"));
			E5.sendKeys("1234567890");

			WebElement E6 = driver.findElement(By.xpath("//input[@value='Male']"));
			E6.click();

			WebElement E7 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
			E7.click();
			WebElement E8 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
			E8.click();
			WebElement E9 = driver.findElement(By.xpath("//input[@id='checkbox3']"));
			E9.click();

			WebElement E10 = driver.findElement(By.xpath("//div[@id='msdd']"));
			E10.click();
			WebElement E = driver.findElement(By.xpath("//section[@id='section']//li[9]"));
			E.click();

			Thread.sleep(2000);
			Select skills = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
			skills.selectByVisibleText("Javascript");

			WebElement E11 = driver.findElement(By.xpath("//span[@role='combobox']"));
			E11.click();
//			WebElement E12 = driver.findElement(By.xpath("//input[@role='textbox']"));
//			E11.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@id='countries']")).click();
//			E12.sendKeys("India");
//			E12.sendKeys(Keys.ARROW_DOWN);
//			E12.sendKeys(Keys.ENTER);

			Select year = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
			year.selectByValue("1996");

			Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
			month.selectByValue("June");

			Select day = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
			day.selectByVisibleText("30");

			WebElement E14 = driver.findElement(By.xpath("//input[@id='firstpassword']"));
			E14.sendKeys("Priya@123");
			E14.click();

			WebElement E15 = driver.findElement(By.xpath("//input[@id='secondpassword']"));
			E15.sendKeys("Priya@123");
			E15.click();

			Thread.sleep(2000);
			WebElement E16 = driver.findElement(By.xpath("//input[@id='imagesrc']"));
			E16.sendKeys("C:\\Users\\lenovo\\Downloads\\download.webp");

			Thread.sleep(2000);
			WebElement E17 = driver.findElement(By.xpath("//button[@id='submitbtn']"));
			E17.click();

			Thread.sleep(5000);
			WebElement E18 = driver.findElement(By.xpath("//button[@id='Button1']"));
			E18.click();

		}
	}

		 
		 
	
