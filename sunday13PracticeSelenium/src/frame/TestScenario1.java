package frame;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TestScenario1 extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		TestScenario1 obj = new TestScenario1();
		obj.launchBrowser();
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("scroll(0,2100)");
		
		Thread.sleep(3000);
		
		String parentID = driver.getWindowHandle();
		
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		Thread.sleep(3000);
		
		Set<String> parentChildID= driver.getWindowHandles();
		
		for(String i: parentChildID) {
			if(!i.equals(parentID)) {
				driver.switchTo().window(i);
				
				j.executeScript("scroll(0,1500)");
				
			    Thread.sleep(3000);
			    
			    j.executeScript("scroll(0,-1500)");
			    
			    driver.findElement(By.xpath("(//img[@src='https://www.guru99.com/images/guru99-logo.png'])[1]")).click();

				Thread.sleep(3000);
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parentID);
		
		j.executeScript("scroll(0,-2100)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@src='images/logo_1.png']")).click();
		
		
	
	    
	    
		
		
	}
}
