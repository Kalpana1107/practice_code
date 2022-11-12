package practicecodes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("kallakurichi",
				Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,500);");
		driver.findElement(By.xpath("(//div[text()='Thiruchitrambalam'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("(//div[@class='date-numeric'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[starts-with(normalize-space(text()),'06:15 PM')]")).click();
		driver.findElement(By.xpath("(//div[text()='Accept'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@id='pop_4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[starts-with(normalize-space(text()),'Select Seats')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"A_3_011\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnSTotal_reserve")).click();

	}
}
