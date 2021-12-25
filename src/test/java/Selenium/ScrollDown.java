package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://amazon.com");
	driver.manage().window().maximize();
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	//jk.executeScript("window.scrollBy(0,2000)");
	jk.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}
