package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class Test {
	public static void main(String[] args) throws AWTException, IOException {
		 WebDriverManager.chromedriver().setup();
			ChromeOptions op=new ChromeOptions();
			op.addArguments("start-maximized");
			WebDriver driver=new ChromeDriver(op);
			driver.get("https://www.fb.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement e = null;
			Alert a=driver.switchTo().alert();
			Select s=new Select(e);
			s.selectByIndex(1);
			s.selectByValue("new");
			s.selectByVisibleText("text");
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			List<WebElement> options = s.getOptions();
			boolean multiple = s.isMultiple();
			Actions aacc=new Actions(driver);
			String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			for (String x : child) {
				if (!parent.equals(x)) {
					driver.switchTo().window(x);
					}
				
			}
			
			driver.switchTo().frame(1);
			driver.switchTo().defaultContent();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebDriverWait wait =new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(e));
			
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute['value','harun']",e);
			js.executeScript("arguments[0].scrollIntoView(true)", e);
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc=new File("path");
		FileUtils.copyFile(src, desc);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_0);
		
		WebElement f = driver.findElement(By.id("name"));
		List<WebElement> dd = driver.findElements(By.id("dd"));
		
		boolean displayed = e.isDisplayed();
		boolean enabled = e.isEnabled();
		boolean selected = e.isSelected();
		
		String text = e.getText();
		String attribute = e.getAttribute("href");
		e.click();
		
		String color = e.getCssValue("color");
		Dimension size = e.getSize();
		
		
		
		
		
		
		
		
		
	
		
		
			
			
			
			
			
	}
}