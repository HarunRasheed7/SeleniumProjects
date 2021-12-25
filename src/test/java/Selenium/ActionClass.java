package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement src = driver.findElement(By.xpath("(//span[@class='_2FZd5H'])[1]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(src).build().perform();
		driver.findElement(By.xpath("(//a[@class='_1jkBF2'])[3]")).click();
		List<WebElement> samsung = driver.findElements(By.xpath("//a[@class='_2cLu-l']"));
		for (WebElement x : samsung) {
			String text = x.getText();
			System.out.println(text);
		}
		
	}

}
