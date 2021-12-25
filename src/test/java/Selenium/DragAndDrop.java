package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		a.dragAndDrop(drag1, drop1).build().perform();
		
		
		
	
	
	
	}

}
