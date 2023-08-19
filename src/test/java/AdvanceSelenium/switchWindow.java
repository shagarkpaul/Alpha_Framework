package AdvanceSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
		
		clickHereLink.click(); 
		
		String mainWindow = driver.getWindowHandle(); 
		
		Set<String> windows = driver.getWindowHandles(); 
		
		Iterator<String> i = windows.iterator(); 
		
		while(i.hasNext()) {
			
			String childWindow = i.next(); 
			
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow); 
			}
		}
		
		WebElement newWindowText = driver.findElement(By.xpath("//div[@class='example']")); 
		
		System.out.println(newWindowText.getText());
		
		
		
		

	}

}
