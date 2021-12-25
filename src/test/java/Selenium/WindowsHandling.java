package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]")).click();
	String parent = driver.getWindowHandle();
	Set<String> child = driver.getWindowHandles();
	for (String x : child) {
		if (!parent.equals(x)) {
			driver.switchTo().window(x);
			
		}
		
	}
	String text = driver.findElement(By.xpath("//span[@class='_35KyD6']")).getText();
	System.out.println(text);
	
	
		
	}

}
