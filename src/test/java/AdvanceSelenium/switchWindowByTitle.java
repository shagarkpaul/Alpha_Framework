package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindowByTitle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
		
		clickHereLink.click(); 
		
		windowByTitle(driver,"New Window");
		
    WebElement newWindowText = driver.findElement(By.xpath("//div[@class='example']")); 
		
		System.out.println(newWindowText.getText());
	}
	
	public static void windowByTitle(WebDriver driver, String title) {
		
		String currentWindow = driver.getWindowHandle(); 
		
		for(String winHandle:driver.getWindowHandles()) {
			
         if(!driver.switchTo().window(winHandle).getTitle().equals(title)) {
				
				driver.switchTo().window(currentWindow);
			}
		}
		
	}

}
