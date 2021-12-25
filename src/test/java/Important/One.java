package Important;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class One {
    
	//@Test
	void WebTable() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("Headless");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	List<WebElement> courses = driver.findElements(By.xpath("//table[@name=\"courses\"]//tbody//tr//td[2]"));
	List<WebElement> price = driver.findElements(By.xpath("//table[@name=\"courses\"]//tbody//tr//td[3]"));
	Map<String,String> data=new HashMap<String, String>();
	for (int i = 0; i < courses.size(); i++) {
		String text = courses.get(i).getText();    
		String text2 = price.get(i).getText();
		data.put(text, text2);
		
	}
	Set<Entry<String, String>> entrySet = data.entrySet();
	for (Entry<String, String> entry : entrySet) {
		System.out.println(entry);
		
	}
		
	}
	
	//@Test
	void windowTab() {
		WebDriverManager.chromedriver().setup();
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("Headless");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String l = driver.getWindowHandle();
		driver.findElement(By.id("opentab")).click();
		
		driver.switchTo().window(l);
		}
	//@Test
	void windowHandling() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("openwindow")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		Thread.sleep(5000);
		for (String x : child) {
			if(!parent.equals(x)) {
				driver.switchTo().window(x);
			}
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='display: none;'][2]")));
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New");
//		driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]")).click();
//		driver.findElement(By.linkText("https://www.rahulshettyacademy.com/")).click();
			
		}
	}
	//@Test
	void isDisplayed() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("show-textbox")).click();
		boolean displayed = driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println(displayed);
		driver.findElement(By.id("hide-textbox")).click();
		boolean displayed1 = driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println(displayed1);
	
	
	
	
	}
	//@Test
	void radioButton() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		boolean displayed =driver.findElement(By.xpath("//input[@value='radio1']")).isEnabled();
		System.out.println(displayed);
}
	//@Test
	void dropDown() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropDown);
		s.selectByIndex(2);
		WebElement option = s.getFirstSelectedOption();
		System.out.println(option.getText());
	}
	
	//@Test
	void checkBox() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption3")).click();
		boolean selected = driver.findElement(By.id("checkBoxOption3")).isSelected();
		System.out.println(selected);
		}
	
	//@Test
	void alert() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmbtn")).click();
		Alert a = driver.switchTo().alert();
		a.dismiss();

	
	}
	
	//@Test
	void webTable() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		List<WebElement> data1 = driver.findElements(By.xpath("//table[@id='product']//following::tbody[2]//tr//td[1]"));
		List<WebElement> data2 = driver.findElements(By.xpath("//table[@id='product']//following::tbody[2]//tr//td[2]"));
		Map<String, String> data=new HashMap<String, String>();
		for (int i = 1; i < data1.size(); i++) {
			String xpath1="//table[@id='product']//following::tbody[2]//tr["+i+"]//td[1]";
			String xpath2="//table[@id='product']//following::tbody[2]//tr["+i+"]//td[2]";
			String name = driver.findElement(By.xpath(xpath1)).getText();
			String job = driver.findElement(By.xpath(xpath2)).getText();
			data.put(name, job);
			}
		Set<Entry<String, String>> entrySet = data.entrySet();
	    for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
		}}
	
	//@Test
	void mouseHover() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("mousehover"));
		Actions acc=new Actions(driver);
		acc.moveToElement(element).perform();
		driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[1]")).click();
		System.out.println("Done");

}
	@Test(groups="frame")
	void frame() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebElement frame = driver.findElement(By.id("courses-iframe"));
	    driver.switchTo().frame(frame);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    String text = driver.findElement(By.xpath("//div[@class='text']")).getText();
	    System.out.println(text);
	    driver.switchTo().defaultContent();
	    WebElement top = driver.findElement(By.id("dropdown-class-example"));
	    js.executeScript("arguments[0].scrollIntoView",top);
	    }
	
	@Test(groups="box")
	void suggestionBox() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.id("autocomplete")).sendKeys("indi");
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		WebElement suggestion = driver.findElement(By.xpath("//li[@class='ui-menu-item']//div[text()=\"India\"]"));
	    ac.moveToElement(suggestion).click().perform();
	}
	

}


