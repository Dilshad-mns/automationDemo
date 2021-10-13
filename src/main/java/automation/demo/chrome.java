package automation.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
	public static void main(String agrs[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P9169174\\Downloads\\chromedriver_win32\\chromedriver.exe");
		final WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
	}
}
