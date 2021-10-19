package automation.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
	public static void main(String agrs[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P9169174\\Downloads\\chromedriver_win32\\chromedriver.exe");
		final WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://www.flipkart.com/");
		Thread.sleep(3000);
//		chrome.navigate().to("https://www.flipkart.com/");
		
		//click close button
		chrome.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		//click login
		chrome.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(3000);
		
		//enter phone number
		chrome.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("1234567890");
		Thread.sleep(3000);
		
		//enter password
		chrome.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("*******");
		Thread.sleep(3000);
		
		//enter login
		chrome.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(3000);
		
		//press backward
		chrome.navigate().back();
		Thread.sleep(3000);
		
		//press forward
		chrome.navigate().forward();
		Thread.sleep(3000);
		
	}
}
