package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Buses']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//span[text()='Chennai, Tamil Nadu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Coimbatore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Coimbatore, Tamil Nadu']")).click();
		driver.findElement(By.xpath("(//div[text()='25'])[2]")).click();
		driver.findElement(By.id("search_button")).click();
		driver.findElement(By.className("primoCloseIcon")).click();
		driver.findElement(By.xpath("(//a[text()='Select Seats'])[12]")).click();
		driver.findElement(By.xpath("(//span[text()='Koyambedu'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Ettimadai']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='seat-icon'])[41]")).click();
		driver.findElement(By.xpath("//span[text()='BOOK SEATS']")).click();
		driver.findElement(By.id("fname")).sendKeys("KalpanaMadhu");
		driver.findElement(By.id("age")).sendKeys("24");
		driver.findElement(By.xpath("//p[contains(@class,'GenderOptionSelection')]")).click();
		driver.findElement(By.xpath("//span[@class='trdic-female-2x']")).click();
		driver.findElement(By.id("contactEmail")).sendKeys("kalpanagunasekaran50@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//span[@class='sc-kPVwWT hCyTgB'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Continue to Book Now']")).click();

	}
}
