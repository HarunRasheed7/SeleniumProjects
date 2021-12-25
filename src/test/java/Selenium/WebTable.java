package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> table = driver.findElements(By.xpath("//table//tbody//tr//td"));
		for (int i = 1; i<=table.size(); i++) {
			String mobiles="//table//tbody//tr["+i+"]//td";
			String text = driver.findElement(By.xpath(mobiles)).getText();
			System.out.println(text);
			
		}
			
		}
		
	}


