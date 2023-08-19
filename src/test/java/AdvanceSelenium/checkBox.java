package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")); 
		
		WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

		if(checkBox1.isSelected()) {
			System.out.println("Check box 1 is selected");
		}
		else {
			checkBox1.click(); 
		}
		
		if(checkBox2.isSelected()) {
			System.out.println("Check box 2 is selected");
		}
		else {
			checkBox2.click(); 
		}
	}

}
