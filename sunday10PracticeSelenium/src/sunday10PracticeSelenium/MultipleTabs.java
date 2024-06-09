package sunday10PracticeSelenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		
//		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
//		
//		String parentID= driver.getWindowHandle();
//		
//		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
//		
//		Set<String> parentchildID=driver.getWindowHandles();
//		
//		for(String i:parentchildID) {
//			if(!i.equals(parentID)) {
//			driver.switchTo().window(i);
//			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("SRK", Keys.ENTER);
//			Thread.sleep(3000);
//			driver.close();
//			}
//		}
//		driver.switchTo().window(parentID);
//		
//		
//		
//		driver.findElement(By.xpath("(//a[@href='http://www.facebook.com'])[1]")).click();
//		
//		Set<String> id= driver.getWindowHandles();
//		ArrayList<String> ids = new ArrayList<String>(id);
//		
//		String parent = ids.get(0);
//		String child = ids.get(1);
//		
//		driver.switchTo().window(child);
//		
//		driver.findElement(By.id("email")).sendKeys("hemantahire148@");
//		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("scroll(0,150)");
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.tagName("input")).sendKeys("Hemant");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
