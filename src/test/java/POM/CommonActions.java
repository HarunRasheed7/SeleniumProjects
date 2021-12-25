package POM;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	static WebDriver driver;
	public static void launch() {
        WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("start-maximized");
		driver=new ChromeDriver(op);
		driver.get("http://amazon.in");
	}
	public static void insertText(WebElement e,String s) {
		e.sendKeys(s);
		
	}
	
	public static void clickk(WebElement e) {
		e.click();
	}
	public static void window() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);
				}
		}
	}
	public static void getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
	}
	
	
}
