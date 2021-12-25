package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> iFramess = driver.findElements(By.tagName("iframe"));
		System.out.println(iFramess.size());
		WebElement frame = driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		
	}

}
