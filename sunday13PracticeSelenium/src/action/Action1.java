package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
  public static void main(String[] args) throws InterruptedException {
	 
	  String url = "https://jqueryui.com/droppable/";
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
	
	  WebDriver driver = new ChromeDriver();
	
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get(url);
	  
	  driver.switchTo().frame(0);
	  
	  WebElement e1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	  WebElement e2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	  Actions a1 = new Actions(driver);
	  //a1.clickAndHold(e1).moveToElement(e2).release(e2).build().perform();
	  
	  a1.dragAndDrop(e1, e2).perform();
	  

	  driver.switchTo().parentFrame();

	  a1.sendKeys(Keys.PAGE_DOWN).perform();
	  a1.sendKeys(Keys.PAGE_DOWN).perform();
	  a1.sendKeys(Keys.PAGE_DOWN).perform();
	  a1.sendKeys(Keys.PAGE_DOWN).perform();
	  Thread.sleep(3000);
	  a1.sendKeys(Keys.PAGE_UP).perform();
	  a1.sendKeys(Keys.PAGE_UP).perform();
	  a1.sendKeys(Keys.PAGE_UP).perform();
	  a1.sendKeys(Keys.PAGE_UP).perform();
	  
	  WebElement e3 = driver.findElement(By.xpath("//input[@class='ds-input']"));
	  a1.sendKeys(e3, "Hemant").build().perform();
	  
	  WebElement e4 = driver.findElement(By.xpath("//a[text()='About']"));
	  a1.contextClick(e4).perform();
	  
	  WebElement e5 = driver.findElement(By.xpath("//a[text()='Development']"));
	  a1.doubleClick(e5).perform();
	  
	  
	  driver.close();
	  
	  
	  
	  
	  
	  
	  
	  
}
}
