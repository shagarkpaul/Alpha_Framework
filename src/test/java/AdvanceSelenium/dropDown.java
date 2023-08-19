package AdvanceSelenium;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement DropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select s = new Select(DropDown);
		
		// select by index 
		s.selectByIndex(1); 
		
		// select by value 
		s.selectByValue("1"); 
		
		// select by visible text 
		s.selectByVisibleText("Option 1");
		
		
		List<WebElement> myList = s.getOptions(); 
		
		for(int i =0; i < myList.size(); i++) {
			
			String str = myList.get(i).getText();
			
			System.out.println(str);
			
		}
		
		
		
		
		
		

	}

}
