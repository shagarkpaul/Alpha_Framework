package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://the-internet.herokuapp.com/hovers");

		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement img1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]")); 
		
		WebElement text1 = driver.findElement(By.xpath("(//div[@class='figcaption'])[1]")); 
		
		Actions act = new Actions(driver); 
		
		act.moveToElement(img1).build().perform(); 
		
		System.out.println(text1.getText());
		
		
	}

}
