package practicecodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9789710986");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Flipkart@123");
	driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sneakers for women",Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@title='Casual Shoes']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@title='Sneakers']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='Gender']")).click();
	driver.findElement(By.xpath("//div[text()='Women']")).click();
	Thread.sleep(4000);
	WebElement dropDown1 = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
	Select DD1 = new Select(dropDown1);
	DD1.selectByIndex(3);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("asian");
	driver.findElement(By.xpath("//div[text()='asian']")).click();
//	driver.findElement(By.xpath("//span[text()='Apply Filters']")).click();
	driver.findElement(By.xpath("//div[text()='Discount']")).click();
	driver.findElement(By.xpath("//div[text()='30% or more']")).click();
	driver.findElement(By.xpath("//div[text()='8']")).click();
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[3]")).click();
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[13]")).click();
	
	
	
	
	
	
}
}
