package Important;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class way2Automation {
	
	public static void main(String[] args) {
		      int a[]= {10,20,10,35,40,22,40,40,17,19,10};
		      Set<Integer> s=new TreeSet<Integer>();
		      for (int i = 0; i < a.length; i++) {
		    	  int n=a[i];
				s.add(n);
			}
	      System.out.println(s);

	}

}
