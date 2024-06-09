package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class Execution extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		Execution obj = new Execution();
		obj.launchBrowser();
		
		driver.navigate().to("http://www.instagram.com");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		WebDriver t1 = driver.switchTo().newWindow(WindowType.TAB);
		
		t1.get(url);
		
		Thread.sleep(3000);
		
		WebDriver w1 = driver.switchTo().newWindow(WindowType.WINDOW);
		w1.get("http://www.instagram.com");
		
		Thread.sleep(3000);
		driver.close();
	
		Thread.sleep(3000);
		driver.quit();
	}
}
