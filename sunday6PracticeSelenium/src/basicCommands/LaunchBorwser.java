package basicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBorwser implements TestBaseFunctionality {

	static WebDriver driver;
	public void launchChromeBrowser() {
 
		System.setProperty(key, value);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}

}
